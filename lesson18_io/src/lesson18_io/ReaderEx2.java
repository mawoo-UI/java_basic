package lesson18_io;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReaderEx2 {
<<<<<<< HEAD
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\tj\\Desktop\\새 텍스트 문서.txt");
		InputStreamReader isr = new InputStreamReader(fis, "ms949");
//		FileReader fr = new FileReader("C:\\Users\\tj\\Desktop\\새 텍스트 문서.txt");
		int c = 0;
		int cnt = 0;
		while((c = isr.read()) != -1) {
			cnt++;
			System.out.println((char)c);
		}
		System.out.println(cnt + "글자 읽음");
		isr.close();
	}
}
=======
	public static void main(String[] args) throws IOException{
		FileInputStream fis =new FileInputStream("C:\\Users\\tj\\Desktop\\ 새 텍스트.txt");
		InputStreamReader isr = new InputStreamReader(fis, "ms949");
//		FileReader fr = new FileReader("C:\\Users\\tj\\Desktop\\ 새 텍스트.txt");
		int c = 0;
		int cnt = 0;
		while ((c = isr.read()) != -1) {
			cnt++;
			System.out.println((char)c);
		}
		System.out.println(cnt + "글자읽음");
		isr.close();
	}
}
>>>>>>> b584507697e52b8b10fa82cc42cffa58f5a0582f
