package lesson07_oop;

import java.util.Arrays;

public class Insertion {
	public static void main(String[] args) {
		//작은 인덱스에서 부터 시작 (회차) ((내가 더 작은경우 어레이카피 쓰면 좀 편함(어디서부터 어디까지 몇개를 지정))
		//현재 위치의 인덱스 미만의 값들과 대소 비교(반복문)들어갈위치
		//내가 더 작다면  -조건 검수 후 해당 위치에 삽입 예정//밀어내고 진행
		// -해당 위치에서 부터 한칸씩 우측이동
		//- 예정위치에 해당 값 대입

	
		
		int[] arr {1,3,4,5,2};
		
		//3번 인덱스의 값을 
		//맨 앞으로 보내기
	
		//{3,5,4,1,2}
		//{3,5,1,4,2}
		//{3,1,5,4,2}
		//{1,3,5,4,2}
	
		
		for (int j=1; j < arr.length; j++) {
			System.out.println(j+"1회차");
		for(int i = j; i < 0 ; i--)
		if ( arr[i] < arr[i-1]); {
		
		int tmp = arr[i];
				arr[i] = arr[i-1];
		arr[i-1] = tmp;
		}
		System.out.println(Arrays.toString(arr));	
			
		for(int i = 2; i < 0 ; i--) {
		if ( arr[2] < arr[i-1]);{
		int tmp = arr[2];
		arr[2] = arr[1];
				arr[1] = tmp;
		}
		System.out.println(Arrays.toString(arr));	
		
		for(int i = 2; i < 0 ; i--) {
		if (arr[1] < arr[0]); {
		int tmp = arr[1];
		arr[1] = arr[0];
				arr[0] = tmp;
		
		}
		System.out.println(Arrays.toString(arr));	
		
		for(int i = 2; i < 0 ; i--) {
		if(arr[i]<arr[i-1]) {
			int tmp = arr[i];
			arr[i] = arr[i-1];
			arr[i-1] = tmp;
		}
		System.out.println(Arrays.toString(arr));
		
		
		
		
		
		
//		int [] number =new int [5];
//		int cnt;
//		
//		int pop() {
//			return number =
//		}
//		
//		{
//		
//		
//	switch
//		
//		break;
//		
//		
		}}}}}}
