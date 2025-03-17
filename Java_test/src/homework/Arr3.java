package homework;

import java.util.Arrays;

public class Arr3 {
	public static void main(String[] args) {

		// 30 50 20 10 40 0 0 0 0 0

		int[] arr = { 30, 50, 20, 10, 40 };
		//arr의 배열의 길이 2배를 tmp에 담는다
		int[] tmp = new int[arr.length*2];
//		arr[0] = 30;
//		arr[1] = 50;
//		arr[2] = 20;
//		arr[3] = 10;

		for(int i = 0; i <arr.length;i++) 
			tmp[i] = arr[i];
		
		arr= tmp;
		
		System.out.println(Arrays.toString(arr));
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
		
//		int[] arr = new int[];
		
		
		
		
	}
}
