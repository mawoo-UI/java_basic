package lesson10_inner;

public class LocalTest {
	
	static MyInter create() {
		class MyClss implements MyInter {
		public MyClss() { 
			
		}
			@Override
		public void run() {
			System.out.println("MyClass.run()");
		}
			
			
		}
		return new MyClss();
	}
	static MyInter create2() {
		return new MyInter() {
			@Override
			public void run() {
				System.out.println("create2().run()");
				
			}
		};
	}
	
public static void main(String[] args) {
	MyInter mi = create();
		mi.run();
		create2().run();
		create3().run();

}
static MyInter create3() {
	return () -> System.out.println("Lambda.run()"); 

}

interface MyInter {
	void run();
}
}