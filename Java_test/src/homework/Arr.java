package homework;

import java.util.Arrays;

public class Arr {
	public static void main(String[] args) {

		// 길이가 5개인 정수 배열생성
		// 10, 30, 50, 70, 90

		int[] arr = { 10, 30, 50, 70, 90 };

		int[] arr2 = new int[5];

		arr2[0] = 10;
		arr2[1] = 30;
		arr2[2] = 50;
		arr2[3] = 70;
		arr2[4] = 90;

		// arr의 0번째 인덱스의 값과 arr2의 0번째 인덱스 값이 같은지 비교

		System.out.println(arr[0] == arr2[0]);

		arr2 = new int[5];
		System.out.println(Arrays.toString(arr2));

		// 1. 0번째 인덱스에 10을 대입한다.
		// 2. 반복문을 사용한다. 4회 반복

		// 1~4번 인덱스의 위치에 이전 인덱스 배열 내의 값에
		// 1-1.0번 인덱스에 있던 값에 20을 더해서 1번 인덱스에 대입한다.

		// 20을 더해서 현재 인덱스에 지정한다.

		arr2[0] = 10;

//		arr2[1] = arr2[0] + 20; // 30
//		arr2[2] = arr2[1] + 20; // 50
//		arr2[3] = arr2[2] + 20;
//		arr2[4] = arr2[3] + 20;
		System.out.println(Arrays.toString(arr2));
//		System.out.println();

		for (int i = 1; i <= 4; i++) {
			arr2[i] = arr2[i - 1] + 20;
//			System.out.println(i);
		}

//			arr2[1] = arr[0] + i;
//			arr2[2] = arr2[1] + i;
//			arr2[3] = arr2[2] + i;
//			arr2[4] = arr2[3] + i;
//			System.out.println(arr2[4]);
//			 같은 비율로 늘어나는걸 등비수열

		arr2 = new int[5];
//			0, 1, 2, 3, ,4
//			0, 2, 4, 6, 8
//			1 ,3 ,5, 7, 9	
		for (int i = 0; i <5; i++) {
//			arr2[i] = i*2;
//			arr2[i] = i*2+1;
			arr2[i] = (i*2+1)*10;
			
		}
		System.out.println(Arrays.toString(arr2));
	}
}
