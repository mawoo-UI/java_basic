package lesson11_exception;
//터짐
public class ExceptionEx01 {
	public static void main(String[] args) {
		System.out.println(1);
		try {
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		}
		catch (ArithmeticException e) {
			System.out.println(5);
		}
		System.out.println(6);
		
	}
}
