package day2;

public class SingletonTest {
	public static void main(String[] args) {
		//final : 클래스, 메서드에 사용시(오버라이드 금지), 필드
		final int i;
		public SingletonTest(int i) {
			this.i = i;
		}
		
		String str;
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		// 회원
		//책
		//구매
	}
}

