package student1;

abstract class Shape {
	String type;
	public Shape(String type) {
		this.type = type ;
	
	}
	abstract double area();
	abstract double lenghth();
}
//예외처리/