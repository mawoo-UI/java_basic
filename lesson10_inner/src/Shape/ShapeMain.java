package Shape;

public class ShapeMain {

	public static void main(String[] args) {
		ShapeMain s1 =new circle(10);
		System.out.println(s1.area());
		System.out.println((D2)s1).length();;
	}
	Shape s2 = new Cylinder(10 , 3);
	System.out.println(s2.area());
	System.out.println((03)s2).volume();;

	shape s3 = new Rect(5,4);
	Shape[] shapes = new Shape[3];
	shape[0]= s1;
	shape[1]= s2;
	shape[2]= s3;

	for(Shape s : shapes) {
		System.out.println(s.area());
		if(s instanceof D2) {
			((D3)s).length;
		}
		else if (s instanceof D3) {
			((D3)s).volume();
		}
	}
  }
}
