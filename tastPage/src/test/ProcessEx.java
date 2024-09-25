package test;

public class ProcessEx {
public static void main(String[] args) {
	try {
		//메모장 실행
		Process p1 = Runtime.getRuntime().exec("notepad.exe");
		// 그림판 실행
		Process p2 = Runtime.getRuntime().exec("mspaint.exe");
		
		p1.waitFor();// p1프로세스가 종료될때 까지 대기
		p1.waitFor();// p1프로세스가 종료되면 실행
		
		
	}
	catch (Exception e) {
		e.printStackTrace();
	}
}
}
