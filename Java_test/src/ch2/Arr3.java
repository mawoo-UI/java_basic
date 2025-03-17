package ch2;

import java.util.Arrays;

public class Arr3 {
	public static void main(String[] args) {
		// 0L (long) , 0.0f 0.0 0 false ..
		String s = null;// 모든 참조형의 기본값은 null;

		// 2차원 배열
		// 정수 배열 (2차원)
		int[][] ints = { { 1, 2, 3 }, { 4, 5, 6 } };
		int[] ints2 = new int[5];
		// 문자열 배열(2차원)

		// 사전에 값은 알고 있는 경우
		String[][] strs = { { "가 나", "다 라", "마바" }, { "ABCD", "EFG" } };
		System.out.println(strs[1][0]);

		// 사전에 값은 모르지만 길이를 설정할 경우
		String[] strings = new String[5]; // strings.length
//		{?,?,?<?,?} 
		System.out.println(Arrays.toString(strings));

		String[][] strings2 = new String[3][];// 사전설정 가능하고 첫번째 선언시 뒤엔 나중에설정가능
		strings2[0] = new String[3];
		strings2[0][1] = "추가";
		strings2[1] = new String[] { "", "1", "ㄱ", "ㄴ" };
		strings2[1][0] = "값";
		strings2[2] = new String[2];
		System.out.println(Arrays.deepToString(strings2));

		for (int i = 0; i < strings2.length; i++) {
			System.out.println("i :" + i);
			for (int j = 0; j < strings2[i].length; j++) {
				System.out.println(strings2[i][j]);

			}
		}

//		{null, null, null} //문자열 1차원배열로 구성
//		String[][] strings3 = new String[3][2];
//		{{null,null}, {null,null}, {null,null}} //차원안에있는건 그냥 문자열. 
//		System.out.println(Arrays.deepToString(strings3));// 다차원은 deepto로 사용

	}
}
