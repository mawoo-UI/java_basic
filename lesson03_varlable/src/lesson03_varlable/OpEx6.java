package lesson03_varlable;

public class OpEx6 {

	public static void main (String[] args) {
		String s =	Integer.toBinaryString(10);
		System.out.println(s);
		String s2 =	Integer.toBinaryString(6);
		System.out.println(s2);
		String s3 =	Integer.toBinaryString(-3);
		System.out.println(s3);
		System.out.printf("%32s\n",s2);
		
		
		int max = Integer.MAX_VALUE;
		int min = Integer.MAX_VALUE;
		
		System.out.println("0"+ Integer.toBinaryString(min));
		System.out.println(Integer.toBinaryString(min));
		
		System.out.println();
		
		System.out.println(max + 1);
		
		// integer.toBinaryString(int) : String
		//integer.parseint(String) : int
		
		
		
	}
}