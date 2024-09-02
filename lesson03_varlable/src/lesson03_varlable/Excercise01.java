package lesson03_varlable;

public class Excercise01 {
	private static final int ColorPen = 0;

	public static void main(String[] args) {
	
	// += : 우측함의 값을 좌항값에 더하여 좌항에 대입
	// a + b=; // a = a+b
//		System.out.print(7 - 1 * 20 / 5);
//		int studentCount = 27;
//		//int divColorpen =?;
//		//System.out.println("학생당 색연필 수" +);
//		
//		int divColorpen = ColorPen / studentCount;
//		System.out.print("학생당 색연필 수"  +divColorpen);
//		int remainColorPen = ColorPen - divColorpen * studentCount;
//		System.out.print("학생당 색연필 수"  + remainColorPen);

	int age = 8;
	int height = 110;
	boolean parent = true;
	boolean hearchDease = true;
	boolean result = (age >= 6 && height >= 120) || parent && hearchDease;
	System.out.println(result);
	
	result = height >= 120 && (age >= 6 || parent) && hearchDease;
	
	System.out.println(result);
	int year = 2020;
			
			boolean leapYear = year % 4 ==0 && 100 != 0 || year % 400 == 0;
	
			// 365.242342/절기
			
			int price = 187000 ;
			int oman = price / 50000;
			int ilman = price % 50000/ 10000;
			int ochaun = price % 10000/ 5000;
			int ilchun = price % 5000/ 1000;
			System.out.println("5만원권 :" + oman + "장");
			System.out.println("1만원권 :" + ilman + "장");
			System.out.println("5천원권 :" + ochaun + "장");
			System.out.println("1천원권 :" + ilchun + "장");
			
			
			int number = 1234;
			System.out.println(number / 100 * 100);
			
			
	}
}


