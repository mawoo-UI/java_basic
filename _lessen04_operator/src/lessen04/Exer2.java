package lessen04;

import java.util.Arrays;
import java.util.Scanner;

public class Exer2 {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		String[] strings = new String[3];
	
		for(int i = 0;;i++) {
			System.out.println("이름을 입력 >");
			String str = scanner.nextLine();
			if(str.equals("p")) {
				System.out.println("bye");
				strings = Arrays.copyOf(strings, i);
						break;
			}
			//배열 늘리기 /조건식 필요
			if(strings.length == i) {
				System.out.println("문제 발생 직전");
				strings[i] = str;
			}
			for(String s: strings) {
				if(s == null) break;
				System.out.println(s);
			}
			
		}
					}
		
	}
