package homework;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMain {
	private static boolean result;

	public static void main(String[] args) {
		// 30,40,20,10,50, 1
		// 1.배열 생성 후 합계/평균 출력

		int[] arr = { 30, 40, 20, 10, 50, 1 };
//		int sum = 0;
		for (int i = 0; i < arr.length; i++) {

//			sum += arr[i];
		}
//		System.out.println(sum);
//		double avg = (double) sum / arr.length;
//		avg = (int) (avg * 100) / 100d;
//		System.out.println(avg);
		// 1, 3, 2, 7, 8, 2
		// 2.배열 생성 후 짝수의 갯수 구하기
		arr = new int[] { 1, 3, 2, 7, 8, 2 };

		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] % 2 == 0) {
				System.out.println(arr[i]);
				cnt++;
			}
		}
		System.out.println(cnt + "개");

		// int 배열의 중간 값 계산
		// {1,2,3,4,5} >>3 홀수 일때는 단일값

		arr = new int[] { 5, 4, 6, 3, 2, 1 };
		System.out.println(
				arr.length % 2 == 1 ? arr[arr.length / 2] : (arr[arr.length / 2] + arr[arr.length / 2 - 1]) / 2d);

		// {4,5,2,3,4,1} >>2.5 짝수일때는 두수의 평균

		// 4. 배열의 요소 뒤집기 (순서 역순 만들기)
		// {3,4,5,6,7}
		// {7,6,5,4,3}

		arr = new int[] { 1, 2, 3, 4, 5 };
		int[] tmp = new int[arr.length];

		for (int i = 0; i < arr.length; i++)
			tmp[arr.length - 1 - i] = arr[i];
//		tmp[4] = arr[0];
//		tmp[3] = arr[1];
//		tmp[2] = arr[2];
//		tmp[1] = arr[3];
//		tmp[0] = arr[4];

//		int tmp = arr.length;
//		arr[4] = arr[0];
//		
//		arr = tmp;
//		System.out.println(Arrays.toString(arr));

		// 5.포함 여부 묻기
//		{1,2,3,4,5}		5.입력시 포함됨
//						6.입력시 포함되지않음
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("숫자를 입력하세요 >");
//		int input = Integer.parseInt(new Scanner(System.in).nextLine());
//		arr = new int[] { 1, 2, 3, 2, 1 };
//
//		boolean result = false;
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] == input) {
//				result = true;
//				break;
//			}
//			System.out.println(result ? "포함되어 있다." : "포함되지 않았다.");
//		}

//	scanner.close(); 

// 배열의 특정 구간의 합계 구하기
//				{1,2,3,4,5}	
		arr = new int[]  {1, 2, 3, 4, 5};

        // 배열의 길이 출력
        System.out.println("배열의 길이: " + arr.length);

        Scanner scanner = new Scanner(System.in);
        System.out.print("합계를 구할 시작 인덱스를 입력 (0 ~ " + (arr.length - 1) + "): ");
        int start = Integer.parseInt(scanner.nextLine());
        System.out.print("합계를 구할 끝 인덱스를 입력 (0 ~ " + (arr.length - 1) + "): ");
        int end = Integer.parseInt(scanner.nextLine());

      
        int sum = 0;

      
        if (start >= 0 && end < arr.length && start <= end) {
          
            for (int i = start; i < arr.length && i <= end; i++) {
//                tmp[i] += arr[i];
            }
            // 결과 출력
            System.out.println("배열: " + Arrays.toString(arr));
            System.out.println(start + "부터 " + end + "까지의 합계 "+ sum );
        } else {
            System.out.println("잘못된 인덱스 범위입니다.");
        }
	}
}

// 배열의 값이 좌우 대칭인지 확인
//		arr = new int[] { 1, 2, 3, 3, 2, 1 };
//		tmp = new int[arr.length];
//		for (int i = 0; i < arr.length; i++)
//			tmp[arr.length - 1 - i] = arr[i];
//
//		boolean result = true;//true 대칭이다.
//
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] != tmp[i]) {
//
//				result = false;
//				break;

//		System.out.println(result ? "대칭" : "대칭아님");
// 대칭인지 아닌지 확인
