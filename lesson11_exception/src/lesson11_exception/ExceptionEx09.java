package lesson11_exception;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class ExceptionEx09 {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		int[] arry2 = arr;
		int[] arr3 = arr.clone();
		System.out.println(Integer.toHexString(arr.hashCode()));
		System.out.println(arr);
	
	
	arr[0] = 10;
		
	
	try(FileOutputStream fos = new FileOutputStream("1,txt")) {					
		byte[] bs = {'A','B','C','D','E',234-256,176-256,128-256};
		fos.write(bs);
		}	
	catch (IOException e) {
		e.printStackTrace();
		}
	}
	
}
	

	

//유니코드는 기본적으로 2바이트 고정


