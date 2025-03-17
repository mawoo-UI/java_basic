package test2;

public class OperatorEx30 {
		static String toBString(int x) {
			String zero ="00000000000000000000000000000000";
			String tmp = zero + Integer.toBinaryString(x);
			return tmp.substring(tmp.length()-32);
		}
		public static void main(String[] args) {
			int dec = 8;
			
			System.out.printf("%d >> %d = %4d \t%s%n",dec, 0, dec >> 0, toBString(dec>>0));
			System.out.printf("%d >> %d = %4d \t%s%n",dec, 1, dec >> 0, toBString(dec>>1));
			System.out.printf("%d >> %d = %4d \t%s%n",dec, 2, dec >> 0, toBString(dec>>2));			
			System.out.printf("%d << %d = %4d \t%s%n",dec, 0, dec << 0, toBString(dec<<0));
			System.out.printf("%d << %d = %4d \t%s%n",dec, 0, dec << 1, toBString(dec<<1));			
			System.out.printf("%d << %d = %4d \t%s%n",dec, 0, dec << 2, toBString(dec<<2));
			System.out.println();
			dec = -8;
			System.out.printf("%d >> %d = %4d \t%s%n",dec, 0, dec >> 0, toBString(dec>> 0));
			System.out.printf("%d >> %d = %4d \t%s%n",dec, 1, dec >> 1, toBString(dec>> 1));			
			System.out.printf("%d >> %d = %4d \t%s%n",dec, 2, dec >> 2, toBString(dec>> 2));
			System.out.printf("%d << %d = %4d \t%s%n",dec, 0, dec << 0, toBString(dec<< 0));
			System.out.printf("%d << %d = %4d \t%s%n",dec, 1, dec << 1, toBString(dec<< 1));
			System.out.printf("%d << %d = %4d \t%s%n",dec, 2, dec << 2, toBString(dec<< 2));
			System.out.println();
			dec = 8;
			System.out.printf("%d >> %2d = %4d \t%s%n",dec, 0, dec >> 0, toBString(dec >> 0));
			System.out.printf("%d >> %2d = %4d \t%s%n",dec, 32, dec >> 32, toBString(dec >> 32));			
	}
}
