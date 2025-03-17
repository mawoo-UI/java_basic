package test;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
	 
	 
	Scanner scanner = new Scanner(System.in);
	
	
	System.out.println("첫번째 숫자를 입력하세요");
	int num1 = Integer.parseInt(scanner.nextLine());
	System.out.println("두번째 숫자를 입력 하세요");
	int num2 = Integer.parseInt(scanner.nextLine());
	
	
	System.out.println("연산 기호를 눌러주세요.(+ , -, * ,/, % )");
	String operator = scanner.nextLine();
	
	Calc calc = new Calc();
	switch (operator) {
	case "+":
		System.out.println(calc.add(num1 , num2));
		break;
	case "-":
		System.out.println(calc.sub(num1, num2));
		break;
	case "*":
		System.out.println(calc.mul(num1, num2));
		break;
	case "/":
		System.out.println(calc.div(num1,num2));
	case "%":
		System.out.println(calc.mod(num1, num2));
		break;
	}

 }
}

class Calc {
	
	
	
	
	int add (int a , int b) {
		return a + b;
	}
	
	int sub (int a, int b) {
		return a - b;
	}
	int mul (int a, int b) {
		return a * b;
	}
	//나누기 div
	int div (int a, int b) {
		return a / b;
		
	}
	//나머지 mod
	int mod (int a, int b) {
		return a % b;
	}

}
