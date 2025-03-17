package homework;

public class Arr2 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
//		arr = new int[10];
//		1,2,3,4,5
		arr = new int[] {1,2,3,4,5};//값을 통한 초기화
// class에 치는 것들이 변수 ()괄호가 있냐 없냐차이
 // 	배열의 길이
// 자동완성시 ()만 되어있으면 안에 선언하면 안되고, charAt()은 인트만
		System.out.println();
		
		int arrLength = arr.length;
//	문자열의 길이
		String str = "ABC";
		int strLength = str.length();
		
		char[] chs = str.toCharArray();
		System.out.println(chs[0]);
		System.out.println();// 오버로딩
		
		//문자열 배열 내에 여러 문자열 입력
		String[] strs = {"치킨","피자", "햄버거", "라면"};
		// 반복문으로 내부 내용을 출력 length
		for (int i =0; i<4; i++ ) {
			
			System.out.println(strs[i]);
		}
		
		
		
	}
}
