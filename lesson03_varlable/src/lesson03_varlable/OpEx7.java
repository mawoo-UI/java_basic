package lesson03_varlable;

public class OpEx7 {

	public static void main(String[] args) {
		
		int score = 80;
		String pass = score >= 60 ? "합격" : "불합격";
		System.out.println(pass);
		
		int num = 70;
		int num2 = 2;
		//짝수,홀수
		String pass2 = num % 2 == 0 ? "짝수" :  "홀수"; 
		System.out.println(pass2);
		
		
		
		String s ="ABCD";
				s += "가나다라";
				s += "1234";
				System.out.println(s);
		
				
				char ch= 'A';
				char ch2 =(char)(ch+ 1);
				
				System.out.println(ch2);
				
				//산술 형 상승 :int보다 적은 숫자 타입을 이항 연산시 int//int가 char에 못담김 추가로 똑같이 괄호활용.
				//int보다 적은 숫자 타입을 산술 연산 시 int
				//int double char boolean
				//byte, short,char
				byte b = Byte.MAX_VALUE;
				byte b1 = 1; 
				byte b2 =((byte) (b- b1)); // 126
				System.out.println(b + 1);
		
				int i= 300;
				
				byte b3 = (byte)i;
				
				System.out.println(i);
				System.out.println(b3);
				//100101100
				
				System.out.println(Integer.toBinaryString(i));
				// 1 0010 1100
				
				//'0' : 48, 'A' : 65, 'a' : 97, '가' : 44032
				
				System.out.println((char)('가'+1));
				
				//'힣'(마지막글자)
				//unicode 에 완성형 한글의 글자 갯수 구하기
			
				System.out.println('9' - '0' +1);
				System.out.println('z' - 'a' +1);
				System.out.println('힣' - '개'+1);
				
				
				System.out.println("================");
				
				int cnt = 0;
				for(ch = '가' ; ch< '까' ; ch++) {
					System.out.print(ch);
					cnt++;
					System.out.println(cnt * 19);
					// 2^16 65536 (0~65535)
					
					// 사ㅏ과 123개 상자당 10개씩 들어갑니다.
					//몇개의 상자가 필요합니까?
//					}
					
					
					int apple = 123;
					int box = 10;
					
//					int reult = apple % box == 0 ?apple / box : apple/box +1;
					int reult = (apple + 9) / box;
					System.out.println(reult);
					
					// 원하는 값의 차이값을 +로 해보는것도 좋음		
							
					
					// 소수점 자르기 (반올림) 소수점 셋째자리까지올리기
					// 3.141592
					//3.142
					
				
					double pi = 3.141592;
					System.out.println(pi * 1000);
					System.out.println((int)(pi * 1000 + 0.5)/1000.);
					
					
					
					
					
				}
				
	}
	
	
}
