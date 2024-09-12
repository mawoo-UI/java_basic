package lesson11_exception;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
public class Test {
	public static void main(String[] args) throws IOException{
		FileOutputStream fos = null;
	
		System.out.println(Arrays.toString(("가".getBytes("ms949"))));
		try {
		 fos = new FileOutputStream("1.txt");
		byte[] bs = {'A','B','C','D','E',234-256,176-256,128-256};
		fos.write(bs);
			
	}
	catch (IOException e) {
		e.printStackTrace();
		
	}
	finally{
		try {
			fos.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}//유니코드는 기본적으로 2바이트 고정
}
