package Mable;

public class Player {
// 시작 자본 200만원
	//포춘카드
	// 도시 증서 23장
	//지역갯수 //땅 32개
	// 빌라>빌딩>호텔 순으로 건물 짓기(한바퀴 돌때마다 가능)(3개의 건물이 있으면 랜드마크 세울수있음)
	//
	String name;
	int money =2_000_000;
	int idx;
	
	
	public Player(String name) {
		this.name =name;
		
	}
	public String toString() {
		return name + "이" + idx + "번째 위치에 존재합니다. 자산은 "+ money+"입니다.";
	}
	
}
