package thu;

public class PointMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point a = new Point2d(1, 2);
		Point b = new Point2d(3, 4);
		
		//khoang cach giua 2 diem trong oxy
		double d1 = a.distance(b);
		System.out.println("D1 là "+d1);
		
		Point c = new Point3d(1, 2, 3);
		Point d = new Point3d(2, 3, 4);
		//khoang cach giua 2 diem trong oxyz
		double d2 = c.distance(d);
		System.out.println("D2 là "+d2);
		
		
		



	}

}
