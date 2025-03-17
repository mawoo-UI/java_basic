package variable;

public class Variable {
	public static void main(String[] args) {
//		int a;
//		int b;
//		int x = 0;
//		int y = 0;
		int year = 0;
		int age = 14;
		
		System.out.println(year);
		System.out.println(age);
		
		year = age + 2000;
		age =age +1;
		
		System.out.println(year);
		System.out.println(age);
		
		int x = 10;
		int y = 20;
		System.out.println("x:" + x + "y:" + y);
		int tmp = x;
		
		x = y;
		y = tmp;
		
		//오른쪽에 있는 값을 왼쪽으로 넣는것
		System.out.println("x:" + x + "y:" + y);
		
		int curPos = 0; // 현재위치(current position)
		int lastPos = -1;// 마지막 위치 (last position)
		
		
//		final int MAX_SPEED; //에러. 상수는 선언과 동시에 초기화해야함
//		final int MAX_VALUE = 100;// OK. 선언과 동시에 초기화했음
//		MAX_BALUE= 200; // 에러. 상수의 값은 변경될수없음

		final int WIDTH = 20; //폭
		final int HEIGHT = 10; // 높이
		
		int triangleArea = (WIDTH * HEIGHT) /2;//삼각형의 면적을 구하는 공식
		int rectangleArea= WIDTH * HEIGHT ;//사각형의 면적을 구하는 공식
		
		int octNum = 010; // 8진수 10, 10진수로 8
		int hexNum = 0x10; // 16진수 10, 10진수로 16
		int binNum = 0b10; // 2진수 10, 10진수로 2
		
		long big = 100_000_000_000L; //long big=10000000000L;
		long hex =0xFFFF_FFFF_FFFF_FFFFL;//long hex0xFFFFFFFFFFFFFFFFL;
		
		float pi = 3014f;
		double rate =10618d;
		
		//타입의 불일치
		int i= 'A';
		long l= 123; 
		double d = 3.14f;
		
		String name = "Ja" + "va"; //name은 "Java"
		String str = name + 8.0;//str은 "Java8.0"
		
		System.out.printf("age:%d", age);
		System.out.printf("age:%d%n", age);
		
		
		
	}
	
	
}
