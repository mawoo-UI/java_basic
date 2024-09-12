package day2;

import java
import static java.lang.Integer.parseIn *;

public class Main {
//클래스가 더 빠름
	int i;
	static int si;
	
	
	void run() {
		System.out.println(this.i);
		System.out.println(Main.si);
		System.out.println(this);
	}
	
	
	static void sRun() {
				System.out.println(i);
				System.out.println(this);
			}
		
	public static void main(String[] args) throws ClassNotFoundException { 
//		System.out.println (InitMain.arry2.length);
		Main.sRun();
//		Class cls = InitMain.class;	//클래스 리터럴
		Class cls =Class.forName("day2.InitMain");
		
		
		
		
	}
	
	static int parseInt(String str) {
		return Integer.parseInt(str)
	}
	
	
}
