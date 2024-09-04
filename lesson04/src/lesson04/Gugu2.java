package lesson04;

public class Gugu2 {

	public static void main(String[] args) {
		// A * B= C
		//B가 5였을때 건너뛰고 출력
		// B가 5였을때 반복 정지
		
		//A가 5였을때 건너뛰고 출력
		//B가 5였을때 i 반복 정지
		
		point:
		for(int i = 2 ; i <= 9 ; i++) {
			//if(i == 5) {
				//continue;
//			}
	System.out.println( "[" + i+ "단]");
	for (int j = 1; j<= 9; j++) {
		if(j == 5)
			//continue;//만나는 아래문장 스킵
			break point;
			System.out.println (i + "*" + j + " = " + i * j );
	}
		}
		int num = 0;
		if(num>0);{
	}
		for(int i = 0 ; i < 5; i++)
			//for(;;){  break 코드 없을시 System코드로 안넘어감
			
	}
}