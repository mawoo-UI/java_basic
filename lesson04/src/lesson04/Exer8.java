package lesson04;

public class Exer8 {

	public static void main(String[] args) {

		//4. 소수 여부 확인
		//소수의 조건 :약수가 1과 자신만 존재(자기보다 작은수)
		//ex )10 소수가 아닙니다.
		//3,5는 소수로 나와야함
		
		
		int num = 11;
		
		boolean flag = true;
		for(int i = 2; i < num; i ++) {
			 if (num % i ==0) {
				 flag = false;
				 break;
			 }
			System.out.printf ("%d : %d\n" , i , num %i);
		
	}
		System.out.println("===================");
		num = 12321; //54321
		int result = 0;
		int tmp = num;
//		System.out.println(tmp);
		
		while (tmp != 0) {
			//5    5	5
			//4    9	54
			//3	   12	543
			//2    14	
			//1	   15
			result += result *10 + tmp % 10;
			tmp /=10;
		
			System.out.println(result == num ? "회문수" : "아님");
			System.out.println(num == result);
		
	}
	
	//5.회문수 여부 구하기 /역순으로 돌려도같은숫자
	// 123321 :회문수 , 12345:회문수 아님
	
}
}