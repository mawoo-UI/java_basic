package oop;

public class Overloading {
	int i =10;
	static int si = 20;
	public static void main(String[] args) {
		int a = 10;
		Overloading overloading = new Overloading();
		overloading.run(a, 20);
		overloading.run(a, 25, 35);
		
		overloading.run(25);
		overloading.run(50);// 객체를 통한 호출
		overloading.red(28);
		overloading.live(27);
		System.out.println("==========================");
		System.out.println(overloading.i);
		System.out.println(Overloading.si);//인스턴스 변수는 클래스변수에서 선언안됨
		
		System.out.println(overloading);
		
	}
	//대상: 메서드  // 메서드를 많이 쓰는것
	
	
	//반환 없음, run 파라미터 int 타입 하나 받아옴
	//내용 : 해당 int 변수 콘솔창에 출력
	
	//메인 메서드 생성 후 호출
	
//	void run(int a) {
//	
//		System.out.println(a);
//		
//	}
	
	double run(int value) {
		System.out.println(i);
		System.out.println(value);
		return value * value;
	}
//	double run(int val1, int val2) {
//		System.out.println(val1+","+val2);
//		return val1 + val2;
//	}
	double run(long val1, int val2) {
		System.out.println(val1+","+val2);
		return val1 + val2;
	}
	double run(long val1, long val2) {
		System.out.println(val1+","+val2);
		return val1 + val2;
	}
	double run(int val1, int val2, int val3) {
		double d= run((long)val1, val2);
		System.out.println(val3);
//		System.out.println(val1+","+val2+","+val3);
		return d +val3;
	}//클래스 안에 있는거는 상호 호출이 가능함.
	
	
	void red(int a) {
		
		System.out.println(a);
		
	}
	
	void live(int a) {
		
		System.out.println(a);
		
	}
	
}
