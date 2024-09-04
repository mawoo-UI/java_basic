package lesson04;

public class Exer5 {

	// 2.두 숫자를 입력받아 (정수) 두 숫자 사이의 정수의 합
	// ex) 3, 10 : 3++4+5+6+7+8+9+10 // 10,3 //사이의 합부터

	public static void main(String[] args) {
		
		int num1 =3;
		int num2 =10;
		int sum = 0;
		
		for (int i =num1; i <= num2; i ++) {
			sum += i;
			
			System.out.println(sum);
			}
	}
}