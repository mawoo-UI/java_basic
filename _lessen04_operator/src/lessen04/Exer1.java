package lessen04;

public class Exer1 {

	public static void main(String[] args) {
		
		int money = 123456;
		int[] units = {50000,10000,5000,1000,500,100,50,10,5,1};
		
		int[] counts = new int [10];
		
		
		
		for (int i =0; i<counts.length ; i++) {
			counts[0] =money/units[0];
		}	
			
		{
			for(int i=0; i<counts.length; i++)
			System.out.printf("%d원 짜리가 %d" +(counts[i]>= 1000 ?"장":"개")+"\n",units[i],counts[i]);
		}
		
		
		
		
		// 50000=2,10000=12,5000=24,1000=120,500=246,100=1234,5=24691,1=123456
		// money 뒷자리부터 계산시 1=1 ,5=1,10
		//for( i = 1; i < units.;i++) 
	}
//50000=1,1000=2,5000=2,1000=2,500=2,100=3,50=3,5=1,1=1
}

