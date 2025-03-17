package test2;

public class OperatorEX29 {
	public static void main(String[] args) {
		byte p = 10;
		byte n = -10;

		System.out.printf("p  =%d \t%s%n", p, toString(p));
		System.out.printf("~p  =%d \t%s%n", ~p, toString(~p));
		System.out.printf("~p+1=%d \t%s%n", ~p + 1, toString(~p + 1));
		System.out.printf("~~p  =%d \t%s%n", ~~p, toString(~~p));
		System.out.println();
		System.out.printf("n  =%d%n", n);
		System.out.printf("~(n-1)  =%d%n", (n - 1));
	}

	static String toString(int x) {
		String zero ="0000000000000000000000000000000";
				String tmp = zero + Integer.toBinaryString(x);
				return tmp.substring(tmp.length()-32);
	}
}
