package test;

import java.util.Arrays;



public class DamagochMain {
	Cat cat = new Cat();
	Dog dog = new Dog();
	Regad regad = new Regad();
	
		
	 static String[] Cat = {"로나","짜루","루이" };
	 String[] Dog = {"해피","뽀삐","꼬물이" };
	 String[] Regad = {"게코","토케","크레"};
	
	 
//	Cat cat = new Cat();
	 public static void main(String[] args) {
		 
		System.out.println(Cat[1]);
	 }
		
	 void Hungrry(int Hungrry, int food) {	
		 int remainHungrry = cat.hungrry; 
		 Cat = Cat;
		 if ( Hungrry < 0) {
			 Hungrry = 0;
			 cat.hp -= Hungrry;		
		 }
		 else {
			 cat.hp = food;
			 
//	
			 System.out.println(cat.hp);
		 
//	 void HP(int food) {
//		String c = null;
//		for(int i = 0; i < Cat.length ; i ++ ) {
//			if(Cat[i] != null) {
//				c = Cat[i];
//				break;
//			}
//		}
//		if( c == null) {
//			System.out.println("배부릅니다.");
//			System.exit(0);
//		}
//					
//			int cat.HP(food) = c.hp - damage;
//			if(food <0) {
//				c.hun
//			}else {
//				c.hp = food;
//			}
//					
		 

		}
	 }
	
}
