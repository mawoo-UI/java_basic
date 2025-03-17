package homework;

import java.util.Arrays;
import java.util.Scanner;

public class Arr4 {
	public static void main(String[] args) {
		// 배열의 특정 구간의 합계 구하기
		//		{1,2,3,4,5}	
			int arr[] = {1, 2, 3, 4, 5};

			   System.out.println("배열의 길이: " + arr.length);

		        // 사용자 입력으로 구간을 받기 (배열 값 기준)
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("합계를 구할 시작 값을 입력하세요 (1 ~ 5): ");
		        int startValue = Integer.parseInt(scanner.nextLine());
		        System.out.print("합계를 구할 끝 값을 입력하세요 (1 ~ 5): ");
		        int endValue = Integer.parseInt(scanner.nextLine());

		        // 인덱스 구하기
		        int start = -1, end = -1;

		        // 배열 값에서 인덱스 찾기
		        for (int i = 0; i < arr.length; i++) {
		            if (arr[i] == startValue) start = i;
		            if (arr[i] == endValue) end = i;
		        }

		        // 구간 합 계산을 위한 변수
		        int sum = 0;

		        // 유효한 구간인지 확인
		        if (start != -1 && end != -1 && start <= end) {
		            // 구간 합을 계산 (값 기준)
		            for (int i = start; i <= end; i++) {
		                sum += arr[i];  // sum에 arr 배열의 구간 값을 더함
		            }

		            // 결과 출력
		            System.out.println("배열: " + Arrays.toString(arr));
		            System.out.println(startValue + "부터 " + endValue + "까지의 합계: " + sum);
		        } else {
		            System.out.println("잘못된 값 범위입니다.");
		        }
	}
}
