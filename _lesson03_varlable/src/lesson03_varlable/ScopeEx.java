package lesson03_varlable;

public class ScopeEx {
	public static void main(String[]atgs) {
		char ch = '가';
		{
			int num = 10;
			System.out.println(num);
			System.out.println(ch);
		}
	}
}
