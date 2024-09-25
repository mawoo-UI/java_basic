package day2;

abstract class Shape {
	String type;
	public Shape(String type) {
		this.type = type;
	}
	abstract double area();
	abstract double length();
}


public class ShapeEx {
	public static void main(String[] args) {
		Shape[] shapes = new Shape[2];
		shapes[0] = new Circle(10);
		shapes[1] = new RectAngle(5, 5);
		for(Shape s : shapes) {
			System.out.println(s);
			System.out.println("넓이 : " + s.area() + ", 둘레 : " + s.length());
		}
	}
}
