package oop;

public class Tv {
	// 필드(field): 클래스 블럭에서 선언한 변수
	// 메서드 (method) : 클래스 블럭에서 선언한 함수//두글자로 치환하는 '기능'필드변화//속성값,형태/저장관리를 변수로 관리.
	// 객체가 지정하도록 하는것./다양하게 할수록 자연스러워짐
	// 출력 return으로 표현. 입력은 paramiter
	// 동사는 기능/ //따로따로 분리된게 모듈 //덜 종속적
	//현재는 인스턴스 변수   // 전체가 바뀌는건 클래스 변수(스태틱 키워드)
	
	// 규격 ex 티비규격
	static int inch = 80; // 바꿀 순 있음 못바꾸게 하려면 파이널 키워드. //
	

	
	
	boolean power; // 기본값 false
	int channel;
	int volume;

	// 값 변경희망시 대입연산자 or 증감연산자

	// method 타입/설계도의 선언부
	//리턴타입이 없음으로 아무것도 반환하지 않는다.
	
	//method
	void power() {
		power = !power;

	}

	void volumeUp() {

//		volume = volume +5;
		volume += 5;
		
	}
	void volumeDown() {

//		volume = volume - 5;
		volume -= 5;
		//연산자 다시 확인하기 위치....
	}

	void channelUP() {
		channel += 1 ;

	}
	
	void channelDown() {
		channel -= 1 ;

	}
	static void setInch(int i) {
		inch = i;
	}
	
}
