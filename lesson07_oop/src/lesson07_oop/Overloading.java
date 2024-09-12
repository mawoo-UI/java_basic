package lesson07_oop;

public class Overloading {
	public static void main(String[] args) {
		
	}
}

class Operato{
	int multiply(int x, int y)
	{
		return x * y;
	}

	int multiply(int z) {
		return z*z;
	}
	
	double multiply(double z,int a) {
		return z *z;
	}
	double multiply(int x,Double y) {
		return x *y;
	}
	
}