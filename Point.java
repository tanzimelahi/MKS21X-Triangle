
public class Point {

	private double x;
	private double y;
	public Point(double x, double y) {
		this.x=x;
		this.y=y;
	}
	public Point(Point p) {
		this.x=p.x;
		this.y=p.y;
	}
	public double getx() {
		return this.x;
	}
	public double gety() {
		return this.y;
	}
	public void setx(int x) {
		this.x=x;
	}

	public void sety(int y) {
		this.y=y;
	}
	public double distanceTo(Point other) {
		return Math.sqrt(Math.pow(this.x-other.x,2)+Math.pow(this.y-other.y,2));
	}
	public double distance(Point a,Point b) {
		return Math.sqrt(Math.pow(a.x-b.x,2)+Math.pow(a.y-b.y,2));
	}
	public String toString() {
		return "x= "+this.x+"y= "+this.y;
	}
}



