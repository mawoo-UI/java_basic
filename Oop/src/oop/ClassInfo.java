package oop;

import java.util.Arrays;

public class ClassInfo {
	public static void main(String[] args) {
		
	//클래스 : 인스턴스를 만들기 위한 설계도
	//변수, 메서드
	//변수의 종류
	
	
	//1.클래스 변수
	//2.인스턴스 변수
	// 3. 지역 변수(매개변수)
	
	
	Structure s1 = new Structure();
	s1.no = 10;
	s1.name = "가나다라";
	
	int[] hour = {3, 4, 5};
	int[] minute = {11, 22, 33};
	float[] second = {33, 44, 55};

	//시 분 초
	System.out.println(hour[0] + "," + minute[0] + "," + second[0]);
	
	//선언, 활용
	
	Time t1 = new Time(); //{Time hour 0 minute 0  0.0f}
	t1.setHour(10); //<< 0; //변화를 안했으니까 다시 0//제약조건
	t1.minute = -11;
	t1.second = 123433.333f;
	//get set해야 안전하게 사용가능
	
	System.out.println(t1);
	System.out.println(t1.getHour());
	
	
	
	Time[] times = new Time[3]; // {null,null,null}
	times[0] = t1;
	times[1] = new Time();
	times[2] = new Time();
	
	System.out.println(Arrays.toString(times));
	

//	구조체의 목적
//	유일성 보장 : unique
//	빈값 없음 : not null
//	범위 : check

//	private, public 접근 제한
	
//	나머지 연산 = 11 / 4
//	몫 :2
//	제수 : 4 //나누는 수
//	피제수(나누어지는 수) : 11
//	나머지: 3
//	몫 * 제수 + 나머지 = 피제수
	
	
	
//	가감승제
//	제곱, 제곱근
//	2의 3제곱 8 = 2의 3승 =2^3 >>8 = 2*2*2
// 	2^5 = 32
//	3^3 = 27
	
	
//	3^2=9
//	9를 만들기 위해 숫자의 2제곱
//	피타고라스 법칙
//	직각 삼각형
	
//	두점 사이의 거리 구하기
//	(1 , 3) (5, 8) 
//	5-1 = 4
//	8-3 = 5
//	41
//	E = mc2
	System.out.println(Math.sqrt(0)); //제곱근 구하기 메서드

	long value = 'A';
	
	int v = (int)t1.getHour();
			
	}
}


//구조체의 목적
class Structure {
	int no;
	String name;
}
class Time {
	private int hour;
	//필드에 접근 하는 방법을 제공
	//지정 set
	//조회 get
	
	
	
	//void 
	public void setHour(int h) {
		
		// h :매개변수 parameter
		//h = 12345
		//드 모르간의 법칙 
		
		//0이상이면서 24미만
		//0미만 이거나 24이상이 아닐때
		
//		if(h >= 0 && h < 24) {
//		if(!(h < 0 || h >=24)) {
//		hour = h;
//			
//		}
		if(10 < 0 || 10 >=24) {
			return; //반환, 되돌림  //없음 호출했던곳으로 감
		}
		hour = h;
		//void들은 리턴이 자동 생략되어있음
	}
	
	
	public int getHour() {
		return hour;
	}
	public int[] get() {
		return new int[] {1,2,3,4};
	}
	
	
	int minute;
	float second;
	@Override
	public String toString() {
		return String.format("Time [hour=%s, minute=%s, second=%s]", hour, minute, second);
	}
	
}