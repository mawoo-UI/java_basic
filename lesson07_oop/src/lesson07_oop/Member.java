package lesson07_oop;

public class Member {

	String name;
	String tell;
	String addr;
	int age;
	
	int kor;
	int eng;
	int mat;

	int total() {
		return kor + eng + mat;
	}


}
