package stud;

public class Service {
	Student[] students = new Student[5];
	int count; 
	
	
	 Service() {
		 students[count++] = new Student(1 , "개똥이" , 90, 80, 80);
		 students[count++] = new Student(2 , "소똥이" , 90, 80, 80);
		 students[count++] = new Student(3 , "말똥이" , 90, 80, 80);
		 students[count++] = new Student(4 , "쥐똥이" , 90, 80, 80);
	 }
	
	//등록
	void register() {
		//1.학생 만들기
		
//		Student students = new Student();

		students[count++] = new Student(Utils.nextInt("학번"), Utils.nextLine("이름"),
				Utils.nextInt("국어"),Utils.nextInt("영어"),Utils.nextInt("수학"));
		
		//2.학생이 가지고 있는 정보 값 배정
//		students.no = Utils.nextInt("학번");
//		students.name = Utils.nextLine("이름");
//		students.kor = Utils.nextInt("국어");
//		students.eng = Utils.nextInt("영어");
//		students.mat = Utils.nextInt("수학");

		
		
		//값 확인
//		System.out.println(students1.avg());
		//3.배열의 특정 위치에 학생 지정
//		students[count] = students;
//		
////		System.out.println(students1.sum());
//		System.out.println(students[count].sum());
//		System.out.println(students[count].avg());
		
//		count++;
		
//		Student.getName();
//		Student.getNo();
//		Student.getKor();
//		Student.getEng();
//		Student.getMat();
//		String[] sutdent = {"새똥이","80","70","90"};
		
		
	}
	//조회
	void list() {
		System.out.println("학번 이름 국어 영어 수학 총점 평균");
		System.out.println("===================================");
		
		
		for(int i = 0; i < count; i++) {
			System.out.println(
				students[i].no + " " +
				students[i].name + " " +
				students[i].kor + " " +
				students[i].eng + " " +
				students[i].mat + " " +
				students[i].sum()+ " " +
				students[i].avg()+ " " 
				);
	}

}
	//수정
	void modify() {
		//1. 수정할 학생의 학번 입력
		int no = Utils.nextInt("학번");
		//2. 입력된 학번으로 학생 탐색
		 Student s = null;
		for (int i = 0; i < count; i++) {
			if(no == students[i].no) {
				s = students[i];
				break;
			}
		}	
		
		if( s != null) {
			s.kor = Utils.nextInt("국어");
			s.eng = Utils.nextInt("영어");
			s.mat = Utils.nextInt("수학");
		}
		// 못찾음 메세지 전달
		else {
			System.out.println("찾는 학생의 학번이 없습니다.");
		}
	}
	// 삭제
	void remove() {
		//1. 수정할 학생의 학번 입력
		int no = Utils.nextInt("학번");
		//2. 입력된 학번으로 학생 탐색
		int idx = -1;
		for (int i = 0; i < count; i++) {
			if(no == students[i].no) {
				idx = i;
				break;
			}
		}
		
		
		//2-1. 찾았을 때
		//	해당 위치로 이후의 값을 한칸씩 당김
		if(idx > -1) {
			for (int i = idx; i < count -1; i++) {
				students[i] = students[i+1];
			}
			count--;
		}	
			//2-2. 못찾았을때 
			// 못찾음 메세지 전달
		else {
		System.out.println("찾는 학생의 학번이 없습니다.");
		
		}
		
	}
	
}
