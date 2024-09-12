package lesson07_oop;

import java.util.Arrays;

public class Selection {
	//	1.	 회차 반복문
	//최소값 찾기의 반복문(내부로 가는게 편함)// 분리해서하면 쉬움
	
	//  -  최소값이 존재하는 인덱스
	//  - 0번째 있던 값이 위 인덱스에 있던 값과 교환 //선택정렬
	//n 제곱
	
	
	public static void main(String[] args) {
//		String str ="123456";
//		System.out.println(str.indexOf("3"));
//		System.out.println(str.indexOf("3"));
//		
//		
//		char[] cs = str.toCharArray();
//		str
//		
//		int = idx = -1;
//		
//		
//		for (int i = 0; i < cs.length; i++) {
//			 if (cs[i] =='3')
		
		
		
		{
//				 System.out.println(str.indexOf("3"));
//			break;
//				 
		
		
		int[]arr = {5,4,2,1,7};
		System.out.println(arr[-1]);
		for(int i = 0; i < arr.length ; i++ ) {
			int idx= i;
			int min =  arr[idx];  //arr[0]>arr[idx]/  
			for(int j = i; j < arr.length ; j++ ) {
			if	(arr[idx] > arr[j]) { //이항연산할때 둘다 언급필요하며/최소값 찾을땐 확인 잘해보기
//				min = arr[j];
				i = j;
				
			}				 
		}
		System.out.println(min);
		int tmp = arr[idx];
		arr[idx] = arr [i]; ///{5,4,2,5,7}
		arr[i] = tmp; //{1,4,2,5,7}
		System.out.println(Arrays.toString(arr));
		
		}
		String str = "123456";
		System.out.println(str.indexOf("9"));
		
		
		//int [] arr = {2,3,1,4};
		//int number = 4;
		//int balance = 0;	
	//			Switch (number)  {
	//				case 1:
	//					System.out.println(Arrays.toString( arr));
						
	//					break;
	//				case 2;
	//					System.out.println();
	//					break;		
						
		
	
			
			
		}
	}
		
		
		
		
	//	System.out.println(Arrays.toString( arr1));
		
		
	}}


		
	
	
	
	
