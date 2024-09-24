package test;

import java.util.Optional;

public class Deck {
	//카드를 
	//섞기
	//peek
	
	private void test(String str) {
		Optional<String> o = Optional.ofNullable(str);
		System.out.println(o.orElse("다른값"));
	}
	public void test() {
		test("기본값");
		
	}
	public static void main(String[] args) {
		Deck deck = new Deck();
		deck.test("일반 문자열 성공");
		deck.test(null);
	}
	
}
