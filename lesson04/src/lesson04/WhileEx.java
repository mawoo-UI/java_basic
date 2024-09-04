package lesson04;

public class WhileEx {

	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		
		while (i <= 100) {
			sum += i;
					i++;
					System.out.printf("i : %d,sum : %d\n", i, sum);
		}
		System.out.println("합계:"+sum);
		
		// 정수를 입력 받아 각 자릿수의 합계를 구하여라.
		int num =123123; // 12
		sum= 0;
		
		for(;num !=0;) {
			sum =+ num % 10 ; //3
			num /= 10; //12312
		}
		System.out.println(sum);
		
		
		//while>for 같은식으로 사용가능함
		
		//System.out.println(num % 10);
//		sum += num % 10;//3
//		num /= 10; // 12312
//		
//		sum += num % 10;//3 +2
//		num /= 10;
//		
//		sum += num % 10;// 5 + 1
//		num /= 10;
//		
//		sum += num % 10;// 6 + 3
//		num /= 10;
//		
//		sum += num % 10;//9 + 2
//		num /= 10;
//		
//		sum += num % 10;// 11 + 1
//		num /= 10;
//		
		
	}
		
	}

