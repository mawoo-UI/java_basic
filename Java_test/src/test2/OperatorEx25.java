package test2;

import java.util.Scanner;

public class OperatorEx25 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char ch = ' ';
		
		System.out.printf("문자를 하나 입력하세요.>");
		
		String input = scanner.nextLine();
		ch = input.charAt(0);
		
		if('0' <= ch && ch <= '9') {
			System.out.println("입력하신 문자는 숫자입니다. %n");
		}
		
		if(('a'<= ch && ch <= 'z') || ('A'<= ch && ch <= 'Z')) {
			System.out.printf("입력하신 문자는 영문자입니다. %n");
			
			
			System.out.println();
		}
		//조건문 if는 괄호()안의 연산결과가 참인 경우 블럭{}내의 문장을 수행한다.
		//아래코드는 '0'<=ch&&ch <='9'가 참일 때, 숫자라고 출려한다.
		//10 / 4
		//10 / 3
		//10 >>> 피제수
		//3 >> 제수  
		
	}
}
