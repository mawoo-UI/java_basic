package stud;

import java.util.Scanner;

public class Utils {
	static Scanner scanner = new Scanner(System.in);
	
	static String nextLine(String s) {
		System.out.println(s);
		String ret = scanner.nextLine();
		return ret;
	}
	
	static int nextInt(String s) {
		String str = Utils.nextLine(s);
		int ret = Integer.parseInt(str);
		return ret;
	}
	
	static int parseInt(String s) {
		return Integer.parseInt(s);
	}
}
