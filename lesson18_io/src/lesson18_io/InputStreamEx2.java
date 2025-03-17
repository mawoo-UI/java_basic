package lesson18_io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class InputStreamEx2 {
	public static void main(String[] args) throws IOException {
<<<<<<< HEAD
		// EOF : End of File
		
		FileInputStream fis = new FileInputStream("C:\\Users\\tj\\Desktop\\새 텍스트 문서.txt");
		FileOutputStream fos = new FileOutputStream("C:\\Users\\tj\\Desktop\\복사2.txt");
		byte[] bytes = new byte[5];
		int i = 0;
		while((i = fis.read(bytes)) != -1 ) {
			System.out.println(new String(bytes, 0, i));
=======
		// EOF =: End of File

		FileInputStream fis = new FileInputStream("C:\\Users\\tj\\Desktop\\ 새 텍스트.txt");
		FileOutputStream fos = new FileOutputStream("C:\\Users\\tj\\Desktop\\ 복사2.txt");
		byte[] bytes = new byte[5];
		int i = 0;
		while ((i = fis.read(bytes)) != -1) {
			System.out.println(new String(bytes,0 ,i));
>>>>>>> b584507697e52b8b10fa82cc42cffa58f5a0582f
			System.out.println(Arrays.toString(bytes));
			fos.write(bytes, 0, i);
		}
		fis.close();
		fos.close();
	}
<<<<<<< HEAD
}
=======
}
>>>>>>> b584507697e52b8b10fa82cc42cffa58f5a0582f
