package lesson07_oop;

public class MethodOrder {

	public static void main(String[] args) {
		System.out.println("main start");
		MethodEx ex = new MethodEx();
		ex.one();
		System.out.println("main end");
		
	}
	
	
}

class MethodEx{
	void one () {
		System.out.println("one start");
		two();	
		System.out.println("one end");
	}
	
	void two () {
		System.out.println("two start");
		three();
		System.out.println("two start");
	}
	
	void three () {

		System.out.println("three");
	}
	
}