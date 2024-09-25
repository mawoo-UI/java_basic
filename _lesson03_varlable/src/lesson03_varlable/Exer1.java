package lesson03_varlable;

public class Exer1 {
	public static void main(String[] args) {
		int sum =0;
		int dice1 =0;
		int dice2 =0;
		do {
			dice1 = (int)(Math.random()* 6)+1;
			dice1 = (int)(Math.random()* 6)+1;
			
			sum += dice1 +dice2;
			System.out.println(dice1);
			System.out.println(dice2);	
		}
		while(dice1 == dice2);
		System.out.println(sum);

	}
}
