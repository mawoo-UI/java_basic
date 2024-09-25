package lesson03_varlable;

public class Excercise1 {

	public static void main(String[] args) {
		int total = 0;
		for(int i = 0; i<= 100; i++ ) {
		if(i % 5 == 0)
			total += i;
		else continue;
		System.out.println("sum=" + "i=");
		{
		
			System.out.println("sum="+total+", i="+ i);
			 }
		System.out.print("total =" + total);
		}
	}
}