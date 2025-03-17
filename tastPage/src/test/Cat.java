package test;

public class Cat {
	static int hp = 20;
	static int hungrry = 20;
	static int bored = 0;
	static int touch = +5;
	int playhunt = +15;
	int food = +15 ;
	
	
	
	@Override
	public String toString() {
		return String.format("Cat [hungrry=%s ,hungrry=%s , playhunt=%s, food=%s]", playhunt, food);
	}
	
	
	
	
}
