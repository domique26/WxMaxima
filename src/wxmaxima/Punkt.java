package wxmaxima;

public class Punkt {
	
	private double x,y;
	private String name;
	
	public Punkt(double x, double y, String name) {
		this.setX(x);
		this.setY(y);
		this.setName(name);
	}
	
	@Override
	public String toString() {
		return this.name+"(" +this.x + "/" +this.y +")";
	}
	
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
