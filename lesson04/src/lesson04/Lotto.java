package lesson04;

import java.util.Arrays;

public class Lotto {
	//1~45 6개의 숫자를 고르는것
	public static void main(String[] args) {
		int[] lotto = new int [6]; //[10,20,0,0,0,0]
		int idx = 0; //언제까지 실행될것인가 설정
		while (true) //무한으로 뽑음
		{
			int number = (int)(Math.random() * 45 + 1) ; //10>20>10
			
			boolean insert =true;
			for(int i = 0 ; i < idx; i++) {
				if(lotto[i] == number) {
				insert =false;
				break;
			}
			if(insert) {
				lotto[idx] = number;
				idx++;
			}
			if (idx == 6) break;//공뽑는횟수 종료 //tmp 사용시 다른공간에 복사.
		}
			System.out.println(Arrays.toString(lotto));
	}
	}
}
