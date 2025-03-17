package homework;

public class Test2 {
	public static void main(String[] args) {
		// 피  반대입장
		//연산자 = 연산의 주체
		//피연산자 = 연산의 대상
		// a + b //연산자 : +, 피연산자 : a,b
		//연산자 : operator  //관리자
		// 피연산자 : operand
		
		// 		피연산자	연산결과
		// 산술		숫자		숫자
		// 대소		숫자		논리
		// 동등		x			논리
		//논리		논리		논리
		// < <= > >=
		//== !=
		//&& ampersand:엠퍼샌드  || : vertical bar(수직)
	
		// /: 지연 , % : 순환
		for (int i = 1; i <= 31; i++) {
			int week = (i -1) /7 +1; //
			
			if(i % 7 ==1) {
				System.out.printf("%d주차 ", week);
			}
			
			System.out.printf("%3d", i);
			// 수식, boolean, 일주일마다, 토요일마다
			if(i % 7 ==0 ) {
				System.out.println();
			}
			
			
//			if (i == 7 || i == 14) {
//				System.out.println();
//			}
//			if (i == 14) {
//				System.out.println();
//			}
//			if (i == 21) {
//				System.out.println();
//			}
//			if (i == 28) {
//				System.out.println();
//			}
		}
		//vertical bar(수직)
		//horizontal (수평)

		//input : 1 > 1
		//input : 7 >1
//		int input = 20;
//		
//		System.out.println((intput-1)/7+1);
		
	}
}
