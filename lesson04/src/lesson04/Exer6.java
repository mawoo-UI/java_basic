package lesson04;

public class Exer6 {

	public static void main(String[] args) {
		// 12 18 12
		//	  18 12 6
		//		 12 6 0
		
		
		// 145 15 10
		// 		15 10 5
		//			10 5 0
		
		//3.자연수 두개 입력, 최대 공약수 구하기
				//12 18 >>6 //약수부터구하기//
				//12:1,2,3,4,6,12
				//18:1,2,3,6,9,18
	
	int	 num1 = 12;
	int	num2 = 18;
		int result = 0;
		for(int i = 1 ; i <= num1 ; i++) {
			for(int j = 1 ; j <= num1 ; j++)
			if(num1 %i ==0 && num2 % j ==0 && i == j);
	
			{
		}
	
	 {
		
		 result = i;
			
		}
		}
	}
}

