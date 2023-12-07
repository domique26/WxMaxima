package wxmaxima;

public class Funktion {
	private String name;
	private double koeffizienten;
	
	public Funktion(String name, double koeffizienten) {
		super();
		this.name = name;
		this.koeffizienten = koeffizienten;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getKoeffizienten() {
		return koeffizienten;
	}
	public void setKoeffizienten(double koeffizienten) {
		this.koeffizienten = koeffizienten;
	}
	
	//
	double funktionswertBerechnen(double x) {
		return 0;
	}
	
	//
	Funktion ableitung() {
		return null;
	}
	
	//
	Punkt[] berechneTiefpunkt() {
		return null;
	}
	
	//
	Punkt[] berechneHochpunkt() {
		return null;
	}
	
	//
	Punkt [] nullstellen() {
		return null;
	}
	
	//
	boolean achsenSymetrie() {
		return false;
	}
	
	//
	boolean punktSymetrie() {
		return false;
	}
}
