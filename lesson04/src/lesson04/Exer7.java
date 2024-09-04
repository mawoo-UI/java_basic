package lesson04;

public class Exer7 {

	public static void main(String[] args) {
		
		//5.회문수 여부 구하기 /역순으로 돌려도같은숫자
		// 123321 :회문수 , 12345:회문수 아님
		
		int	 num1 = 12;
		int	num2 = 18;
		
		num1 %= num2;
		boolean flag = true;
		while(flag) {
			int tmp = num1 % num2;
	//		System.out.println("%d %d %d\n", num1,num2,tmp);
			num1 = num2;
			num2 =tmp;
			if(tmp == 0) {
				flag= false;
				System.out.println( num1 );
			}
		}
		num1 =12;
		num2 = 18;
		System.out.println("===============");
		for(int i = num1 ; i <= num1 * num2;i+=num1) {
			System.out.println(i);
		outer:
		System.out.println("===============");
		for(int j = num1 ; j <= num1 * num2;j+=num1) {
			if(i ==j) {
			System.out.println(j);
			break;
	}
}
		}}}

//greater common dividor
//  a* b/gcd 
//12 24 36 48 60 70
//18 36 54 72 90
//36 72 108
// 12 *18 /6\