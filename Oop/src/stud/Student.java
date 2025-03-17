package stud;

public class Student {
	static int count = 20;
	// 필드 5개
	//학번 ,이름(인스턴스변수, 클래스변수), 국어, 영어, 수학
	
	
	
	//생성자 정의
	//다섯개의 필드 초기화를 하는 생성자를 작성
	//Service클래스의 register는 해당 생성자를 호출하는 코드로 변경
	int no;
	String name;
	int kor;
	int eng;
	int mat;

	
	// this? 나를 조금 더 먼 시점에서 바라보는 나. 이 클래스의 인스턴스임(타자화)(전화받을때)
	Student(int no,String name, int kor, int eng, int mat) {
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
//	int sum = kor + eng + mat;
	//총점, 평균
	
	
	Student() {
		this(3, "개똥이 ", 80, 60, 50);
		
	}


	public int sum() {
//		System.out.println(kor+eng+mat);
		return this.kor +this.eng+this.mat;
	}
	
	int avg() {
//		System.out.println((kor+eng+mat)/3);
		//총점 / 갯수
		
		return this.sum() / 3;
	}// 인스턴스 내부에서 인스턴스 객체 호출가능


	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", kor=" + kor + ", eng=" + eng + ", mat=" + mat + ", sum()="
				+ sum() + ", avg()=" + avg() + "]";
	}
	
	
	//	 int add;
	//메서드:반환타입과 이름.매개변수 + 블럭
	//블럭안에서는 지역변수.
	//지역변수는 메서드 내부에" 선언" , 반드시 초기화 이후에 참조 가능
	//파라미터 선언 /원하는만큼 제한없이.괄호는 있어야함/쉼표로 구분
	
	
	//eat ate eaten
//	public Student() {
//		int no;
//		String name;
//		int kor;
//		int eng;
//		int mat;
//	}
//	public void add() {
//		int no = Student.no;
//		String name = Student.name;
//		int kor = Student.kor;
//		int eng = Student.eng;
//		int mat = Student.mat;
//		//총점, 평균
//	}



	
}
