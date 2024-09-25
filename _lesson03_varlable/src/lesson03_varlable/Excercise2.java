package lesson03_varlable;

public class Excercise2 {
	public static void main(String[] args) {
		
		int evenSum = 0 ;
		int oddSum = 0;

		for (int i = 0; i <= 100 ; i ++) {
			 evenSum += i * 100;
		 for (int j = 0; j <=100; j ++)
			oddSum += j * 100;
	
		 
	System.out.println (("홀수의 합계는" + " evenSum") + ("짝수의 합계는" + "oddSum"));
}
}}