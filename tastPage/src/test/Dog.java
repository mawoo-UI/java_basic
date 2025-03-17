package test;

public class Dog {
	static int hp = 20;
	static int hungrry = 20;
	static int bored = 0;
	
	int playgame = +15;
	int food = +15 ;
	@Override
	public String toString() {
		return String.format("Dog [hungrry%s , bored%s, playgame=%s, food=%s]", playgame, food);
	}
	
	
	
}
