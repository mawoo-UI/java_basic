package test2;

public class OperatorEx6 {
	public static void main(String[] args) {
		byte a = 10;
		byte b = 20;
		byte c =(byte)(a + b);// 예제대로 a +b일시 컴파일 에러/형변환사용
		System.out.println(c);
	}
}
