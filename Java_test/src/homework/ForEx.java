package homework;

public class ForEx {
	public static void main(String[] args) {
		//반복문 : 조건이 참인동안 반복수행하는 문자/ 거짓일땐 수행하지 않는다.
		
		//for// 초기식은 for문만 사용
		
		// while
		
		//do ~while
		// 1.초기식(변수의 선언), 조건식(참인 동안만 수행/boolen ); 증감식 (++ or --), 
//		for(1.초기식 ;2.조건식 ;3.증감식 ){
			//4.반복문의 문장 //총 4파트임
		
//		1 > 2번 > 4번 > 3번
	// != , || , > 등 다양하게 활용하기
	// 
//		char ch ='A';
//		String str="";
//		
//		str = str + ch++;
//		System.out.println(str);
//		ch++;
//		
//		str = str + ch;
//		System.out.println(str);
//		ch++;
//		언제까지 해야하는지 26
		String s = "";
		for(char c= 'A'; c <='Z'; c++ ) {
//			String s = "";
//			s = s + c;
			
			s = c + s; //앞뒤 중 어디에 붙이는냐 따라 달라짐
//			s += c;
		}
		System.out.println(s);
		String str = " ";
		for(; str.length() < 10; ) {
			str += "0";
		}
		System.out.println(str);
		
		
//		65~91
		
		
		
//		for(int tmp = 3; tmp != 1; tmp--) {
//			System.out.println(tmp);
//		}
//	
//		if(조건식) {
//			문장
//		}
//}
	while(str.length() < 10){
		str += "0";
	}
	System.out.println(str);
	
	
	
}
}
