package lesson11_exception;

import java.io.IOException;

public class ExceptionEx07 {
	public static void main(String[] args) throws Exception  {
		Exception exception = new Exception();
		//checked excption:일반예외
		//unchecked exception: 런타임 예외
		try {
			m1();
		} catch (Exception e) {
		
			System.out.println("추가작업");
			throw e;
		}
		System.out.println("가능");
	}
	static void m1() throws Exception{
		Exception ex = new Exception();
		throw ex;
	}
}
class A {
	void m () throws IOException{
		
	}
}
class B extends A{

	
	public B() throws Exception {
	
		super.m();
	}
	
}