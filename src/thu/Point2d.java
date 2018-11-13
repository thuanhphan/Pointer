package thu;

public class Point2d extends Point {
	
	public Point2d() {
		super();
	}
	
	public Point2d(int x, int y) {
		super(x,y);
	}

	public double distance() {
		Point aaa = new Point2d();
		return distance(aaa);
	}
	
	public double distance(Point p2) {
		int a = this.getX() - p2.getX();
		int b = this.getX() - p2.getY();
		double t = Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));
		return t;
	}
	
	
	
	
	
	
	
	
	
	
}
