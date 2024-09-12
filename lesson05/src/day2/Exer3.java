package day2;

import java.util.Arrays;
import java.util.Scanner;

public class Exer3 {

	public static void main(String[] args) {
		  
		
		
		   Scanner scanner = new Scanner(System.in);
		   String[] strings = new String[3];
		
		for(int i = 0;;i++) {
			   System.out.println("이름을 입력>");
			   String str = scanner.nextLine();
			   if(str.equals("q")) {
			   System.out.print("bye");
			   strings = Arrays.copyOf(strings, i);
			   break;
			   }
		   
			  //배열 늘리기 /조건식필요/i값과 길이가 같을때 문제발생/2배크기로 늘리기.
			   if(strings.length == i) {
				   System.out.println("문제 발생 직전");
				   strings = Arrays.copyOf(strings, strings.length * 2);
			   }
			   strings[i] = str;
			   
			   
		   }
		   
		  
		   for(String s: strings) {
			if(s == null) break;   
			   System.out.println(s);
		   }
	}
}
///클래스 변수는 프로그램 종료되어야 사라짐