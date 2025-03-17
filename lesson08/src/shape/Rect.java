package shape;

public class Rect {
	private int x;
	private int y;
	public Rect(int x, int y) {
		
	}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return x * y;
	}

	@Override
	public double length() {
		// TODO Auto-generated method stub
		return (x + y) * 2;
	}
	
}
