package oop;

public class Marine {
	//정보 >> 변수 ( 전체가 가져야하는것(클래스) , 개체하나만 (인스턴스))
	
	//클래스 변수
	//공격력, 방어력, 최대 체력, 가격
	static int attack = 6;
	static int defence=  0;
	static int maxHp = 40;
	
	static int mineral = 50;
	static int gas;
	
	
	//인스턴스 변수
	//킬수,현재 체력, 좌표
	
	int kill;
	int hp = maxHp;
	int x;
	int y;
	 
	@Override
	public String toString() {
		return String.format("Marine [attack=%s, defence=%s , kill=%s, hp=%s, x=%s, y=%s]", attack, defence , kill, hp, x, y);
	}
	
	
	
	
}
 