package student1;

class Circle extends Shape{
	int r;
	Circle(int r){
		super("원");
		this.r = r;
	}

	@Override
	double area() {
	return r* r* Math.PI;
	
	}

	@Override
	double lenghth() {
	
		return  r * 2 * Math.PI;
	}

	@Override
	public String toString() {

		return "Shape [ type =" + type + ",r="+r+"]";
		
	}
}