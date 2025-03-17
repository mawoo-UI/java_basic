package homework;

public class Data1 {
	public static void main(String[] args) {
		//문제 1: 기본 데이터 타입
//		byte = 1 byte;
//		int = 4 byte;
//		long = 8 byte;
//		double = 8 byte;
		
		
		//문제 2: 변수 선언
		//정수형 변수 age와 실수형 변수 height 를 선언하고 초기값으로 각각 25와 175.5를 할당하는 코드를 작성하시오.
		
		int age =25;
		double heighy =17.5;
		
		
		//문제 3: 변수 값 변경
		//문제 2에서 선언한 변수 age의 값을 30으로 변경하는 코드를 작성하시오.
		System.out.println(age +5);
		
		//문제 4: 문자형 변수
		//문자형 변수 initial을 선언하고, 초기값으로 'J'를 할당하는 코드를 작성하시오.
		
		String initial;
		initial = "j";
		System.out.println(initial);
		
//		System.out.println(j);
		
		//문제 5: 문자열 변수
		//문자열 변수 name을 선언하고, 초기값으로 "홍길동"을 할당하는 코드를 작성하시오.
		
		String name = "홍길동";
		
		System.out.println(name);
		
		//문제6: 진법 변환
		//10진수 255를 2진수와 16진수로 변환한 값을 각각 작성하시오.
		
		int a = 254; // 2진수 10, 10진수로 2
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toHexString(a));
		
		
		System.out.println(0b11111111);//2진수 0b  //0x
		System.out.println(0xff);
		
//		System.out.println(octNum*2);
//		System.out.println(hexNum*16);		
		
		//문제7: 자바에서의 진법 표현
		//다음 수를 자바 코드로 2진수와 16진수로 표현하시오: 42
		
		int i =42;

		System.out.println(Integer.toBinaryString(i));
		System.out.println(Integer.toHexString(i));
		//### 문제 8: 변수와 데이터 타입
		//다음 코드의 오류를 찾아 수정하시오:
		
		
		String num = "100";
		
		
		//문제 9: 타입 변환
		//5.8이라는 실수형 변수를 정수형으로 변환하고 출력하는 코드를 작성하시오. (결과는 5)
		
		 double d =5.8;
		 i =(int)d;
		 
		 System.out.println(i);
		
		
		//문제 10: 진법 계산기
		//10진수 10과 2진수 1010을 더한 결과를 10진수로 계산하시오.
		int hexNum = 0b1010;
		int j = 10;
		
		System.out.println(j+hexNum);
		
		
		
		
	}
}
