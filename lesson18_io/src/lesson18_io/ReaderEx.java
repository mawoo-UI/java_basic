package lesson18_io;

import java.io.FileReader;
import java.io.IOException;

public class ReaderEx {
<<<<<<< HEAD
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("C:\\Users\\tj\\Desktop\\새 텍스트 문서.txt");
		int c = 0;
		int cnt = 0;
		while((c = fr.read()) != -1) {
			cnt++;
			System.out.println((char)c);
		}
		System.out.println(cnt + "글자 읽음");
		fr.close();
	}
}
=======
	public static void main(String[] args) throws IOException{
		FileReader fr = new FileReader("C:\\Users\\tj\\Desktop\\ 새 텍스트.txt");
		char c = 0;
		int cnt = 0;
		while ((c = fr.read()) != -1) {
			System.out.println((char)c);
		}
		System.out.println(cnt + "글자읽음");
		fr.close();
	}
}
>>>>>>> b584507697e52b8b10fa82cc42cffa58f5a0582f
