package lesson18_io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputStreamEx {
<<<<<<< HEAD
	public static void main(String[] args) throws IOException {
		// EOF : End of File
		
		FileInputStream fis = new FileInputStream("C:\\Users\\tj\\Desktop\\새 텍스트 문서.txt");
		FileOutputStream fos = new FileOutputStream("C:\\Users\\tj\\Desktop\\복사.txt"); //
		System.out.println(fis.available());
		int i = 0;
		int cnt = 0;
		while((i = fis.read()) != -1 ) {
			cnt++;
			System.out.println((char)i + ":" + i);
			fos.write(i); //
		}
		System.out.println(cnt + " bytes");
		fis.close();
		fos.close(); //
	}
}
=======
	
	public static void main(String[] args) throws IOException {
		//EOF =: End of File
		
		
		FileInputStream fis = new FileInputStream("C:\\Users\\tj\\Desktop\\ 새 텍스트 .txt");
		FileOutputStream fos =new FileOutputStream("C:\\Users\\tj\\Desktop\\ 복사.txt");
		System.out.println(fis.available());
		int i =	0;
		int cnt =0;
		while ((i = fis.read()) != -1) {	
		cnt++;
		System.out.println((char)i+ ":"+1);	
		fos.write(i);
	}
	System.out.println(cnt +"bytes");
	fis.close();
	fos.close();
}
}
>>>>>>> b584507697e52b8b10fa82cc42cffa58f5a0582f
