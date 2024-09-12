package lesson07_oop;

import java.util.Arrays;

public class MyStack {
	private int[] items = new int[3];  //외부에서x
	private int cnt;
	int pop() {
		return items[--cnt];
	}
	
	void push(int item) {
		if(items.length == cnt) {
			items = Arrays.copyOf(items , items.length  *2);
		}
		items[cnt++] =item;
	}
	int size() {
		System.out.println(Arrays.toString(items));
		return cnt;
		
	}
}
//size(배열확인)

//q구현
//빠진개수 
//정렬 과제/
//Q구현 : 이사하기 Attays.copy 하기/도착위치 0번이면 단체로 옮겨옴(성능이슈 뒤@짐)/
// 변수를 더 만들어서 0 자리수를 주기만하기
//begin인덱스 빼주기 +1증가
//cnt+4/4개 집어넣고 2개뺌/
//비긴이 더 커지는경우 에러나게 만들어야함
//cnt 랭을 안씀/
