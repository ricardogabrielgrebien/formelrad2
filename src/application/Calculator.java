package application;

/**
 * Berechnet das Formelrad
 * @author Peter Rutschmann
 * @version 13.09.2018
 */
public class Calculator {
	private double leistung;
	private double spannung;
	private double strom;
	private double widerstand;
	
	public Calculator(double leistung, double spannung, double strom, double widerstand) {
		super();
		this.leistung = leistung;
		this.spannung = spannung;
		this.strom = strom;
		this.widerstand = widerstand;
	}
	
	public double getLeistung() {
		return leistung;
	}
	
	public double getSpannung() {
		return spannung;
	}

	public double getStrom() {
		return strom;
	}

	public double getWiderstand() {
		return widerstand;
	}

	@Override
	public String toString() {
		return "Calculator [leistung=" + leistung + 
				", spannung=" + spannung + 
				", strom=" + strom + 
				", widerstand="	+ widerstand + "]";
	}

	public void calculate() {
		/* Hier auf Grund der vorhanden Werte entscheiden
		 * welche Methode unten aufgerufen werden muss.
		 */
	}
	
	/* Hier die Methoden mit den Formlen hinzufügen
	 * 
	 */
	public double pAusUundI (double u, double i) {
		System.out.println("u*i");
		return u*i;
	}
	
	public double pAusUundR (double u, double r) {	
		System.out.println("(u*u)/r");
		return (u*u)/r;
	}
	
	public double pAusRundI (double i, double r) {
		return (i*i)*r;
	}
	
	public double iAusPundR (double p, double r) {
		System.out.println("Sqrt(p/r)");
		return Math.sqrt(p/r);
	}
	
	public double iAusPundU (double p, double u) {
		System.out.println("p/u");
		return p/u;
	}
	
	public double iAusUundR (double u, double r) {
		System.out.println("u/r");
		return u/r;
	}
	
	public double rAusPundU (double p, double u) {
		System.out.println("(u*u)/p");
		return (u*u)/p;
	}
	
	public double rAusPundI (double p, double i) {
		System.out.println("p/(i*i)");
		return p/(i*i);
	}
	
	public double rAusUundI (double u, double i) {
		System.out.println("u/i");
		return u/i;
	}
	
	public double UAusRundI (double r, double i) {
		System.out.println("r*i");
		return r*i;
	}
}
