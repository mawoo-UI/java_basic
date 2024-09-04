package lesson04;

import java.util.Random;

public class Exer4 {

	public static void main(String[] args) {
		// 1. 모두의 마블
		// 주사위 두개를 굴려서 이동한 거리를 계산
		// 더블일 경우 한번 더 굴린다. 총 이동 거리를 출력//숫자가 다를때 탈출가능
		// 와일문으로 비교
		int sum =0;
		int dice1 = 0;
		int dice2 = 0;
		do {
		 dice1 = (int)(Math.random() * 6) + 1;
		 dice2 = (int)(Math.random() * 6) + 1;
		
		sum += dice1 + dice2;
		
		System.out.println(dice1);
		System.out.println(dice2);
		}
		
		while(dice1 == dice2);
		System.out.println(sum);
		}
	}
		


