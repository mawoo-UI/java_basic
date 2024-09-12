package day2;

public class Student {

	int no;//학번
	String name;//이름
	
	Student() {}
	
	Student(int i ,String s){
		// 생성자의 첫줄은 super() , 혹은 this()//괄호는 인자호출구간
		//super();
		no= i;
		name = s;
	}

	Student(String s,int i ){
		this (s);
		no= i;
	
	}
	
	Student(String s){

		name = s;
	
	}	
	
	void printThis(){
		System.out.println(this);
	}
	
	Student retunThis() {
		retun this;
	}
	
	
}
