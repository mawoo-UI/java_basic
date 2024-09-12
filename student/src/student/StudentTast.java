package student;

public class StudentTast {
public static void main(String[] args) {
	
	Student s1 =new Student(1,"새똥이",90,80,80);
	//복제의 방법
	//1.clone override
	//접근제어,타입,예외, CLoneable 인터페이스
	//2.생성자를 통한 복제
		
	
	Student s2 = s1.clone();
	Student s3 = s1.clone();
	s1.setname("개똥이");
	System.out.println(s1);
	System.out.println(s2);
	

	Student s4 = new Student(s1);
	Student s5 = s1;
	
	System.out.println(s1 ==s5);
	System.out.println(s1.equals(s5));
	
	System.out.println(s1 ==s4);
	System.out.println(s1.equals(s4));	//true
}


}
