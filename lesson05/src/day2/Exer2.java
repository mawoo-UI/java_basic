package day2;

import java.util.Arrays;
import java.util.Scanner;

public class Exer2 {

	public static void main(String[] args) {
		
		//1.지폐, 동전세기
		int money =123456;
		int[] units = {50000,10000,5000,1000,500,100,50,10,5,1};
		int[] counts = new int [10];
		
	
		// int a = 10;
		//a = a +5 - 3;
		// a = a + 5 -3;
		//a = a - 3;
		
		for(int i= 0; i <counts.length; i++) {
		counts[i] = money/units[i];
		money %= units[i];
	}	
	
	
//	
//		for(int i= 0; i < counts.length; i++)
//			System.out.printf ("%d원 짜리가 %d" + (units[i]>= 1000 ? "장" : " 개 ") + "\n" ,units[i],counts[i]);
//					
		
////		
//		
////		int oman = (money/ 50000);
////		int ilman =(money % 50000/ 10000);
////		int ochaun =(money % 10000/ 5000);
////		int ilchun =(money % 5000/ 1000);
////		int obackwon =(money % 1000/ 500);
////		int backwon =(money % 500/ 100);
////		int oshipwon = (money % 100 / 10);
////		int shipwon = (money % 100 / 10);
////		int owon =(money % 10 / 5);
////		int ilwon=(money % 5 / 1);
////		
////		System.out.println("5만원권 :" + oman + "장");
////		System.out.println("1만원권 :" + ilman + "장");
////		System.out.println("5천원권 :" + ochaun + "장");
////		System.out.println("1천원권 :" + ilchun + "장");
////		System.out.println("5백원권 :" + obackwon + "장");
////		System.out.println("1백원권 :" + backwon + "장");
////		System.out.println("5십원권 :" + oshipwon + "장");	
////		System.out.println("1십원권 :" + shipwon + "장");		
////		System.out.println("5원권 :" + owon + "장");		
////		System.out.println("1원권 :" + ilwon + "장");
////		
////		for (int i=0; i <units.length; i++) {
////			System.out.println(i);
//	
//		
//	
//
//		
	
		
	//	System.out.println(" "+Arrays.toString(units));
		
		//{2,2,0,3,0,4,1,0,1,1}
		
	Scanner scanner = new Scanner(System.in);
	String[] strings = new String[3];
	System.out.println(Integer.MAX_VALUE);
	Byte b = 10;
	byte b2= 20;
	System.out.println(Byte.MAX_VALUE);
	System.out.println(Character.BYTES);
	
	for(int i = 0;;i++) {
		System.out.println("이름 입력 >");
		String str = scanner.nextLine();
		if(str.equals("q")) {
			System.out.println("bye");
			strings = Arrays.copyOf(strings, i);
			break;
		}
		if(strings.length == i) {
			System.out.println("문제 발생 직전");
			strings = Arrays.copyOf(strings, strings.length *2);
		}
		strings[i] = str;
	}
	for(String s : strings) {
		System.out.println(s);
	}
		
}
}
	
//		   }
		   
//}
	
//}