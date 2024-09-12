package day2.ex2;

public class OverEx {
	public static void main(String[] args) {
		//bind :관계 형성, 어떤 객체가 특정 멤버를 호출 시 대상을 지정
		//정적 바인드: 컴파일 시 지정
		//동적바인드: 런타임 시 지정
		
		A obj= new B();
	System.out.println(obj.i);//정적 바인드
	obj.m(); //동적 바인드
	System.out.println(obj.si);
	obj.sm();
}
class A {
	static int si= 1;
	int i =2;
	static void sm() {
		System.out.println("A.sm();");
	}
	
}
class B extends A{
	int i =4;
			static void sm() {
				System.out.println("A.sm()");
			}
			void m() {
			System.out.println("A.sm()");
			}
}
}