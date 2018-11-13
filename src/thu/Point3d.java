package thu;

public class Point3d extends Point{
	int z;
	
	public Point3d() {
		super();
	}
	
	public Point3d(int x, int y, int z) {
		super(x,y);
		this.z = z;
	}

	
	public double distance() {
		Point bbb = new Point3d();
		return distance(bbb);
	}
	
	public double distance(Point p3) {
		int a = this.getX() - this.getY();
		int b = this.getX() - this.getY();
		int c = this.getX() - this.getY();
		double t = Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2)+Math.pow(c, 2));
		return t;
		
	}


	
	

}
