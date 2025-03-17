package test;

public class Regad {
	static int hp = 20;
	static int hungrry = 20;
	
	int playgame = +15;
	int food = +15 ;
	@Override
	public String toString() {
		return String.format("Regad [hungrry%s ,playgame=%s, food=%s]", playgame, food);
	}
	
	
}
