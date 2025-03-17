package stud;

import java.util.Arrays;

public class StudentMain {
	public static void main(String[] args) {
	Service service = new Service();//생성자 호출 생성자//참조자료형 지역변수
//		Student s1 = new Student();
//		s1.kor = 90;
//		
//		System.out.println(s1);
//	
//		Student s2 = new Student(1, "길동이", 80, 90, 80);
//		s2.kor = 70;
//		System.out.println(s2);
		
		
	
//	service.register();
//	System.out.println(Arrays.toString(service.students));
//
//	service.register();
//	System.out.println(Arrays.toString(service.students));
//	
	service.list();
	
	service.remove();
	
	service.list();
//	int[] arr = {1,2,3,4,5};
//	
//	
//	System.out.println(Arrays.toString(arr));
//		arr[0] = arr[1];
//		arr[1] = arr[2];
//		arr[2] = arr[3];
//		arr[3] = arr[4];
//		for (int i = 0; i < arr.length -1 ; i++) {
//			arr[i] = arr[i+1];
//		System.out.println(Arrays.toString(arr));
//	}
	
	
	
	
	
//	arr
//	작업작업
//	{1,3,4,5,5}
	
	
	
	
	//new 들어간건 다 인스턴스
	//지역변수는 메서드 내부에" 선언" , 반드시 초기화 이후에 참조 가능,초기화 시점:할당 시점,메서드 종료시 해제
	//	정지해있는 상태// 실행중인 프로그램: 프로세스 //주기억장치에 프로세스상태를 올린다. 프로세스화 되는거
	// 램에서 공간요청./주기억장치/
	//같은 패키지에선 접근가능(접근제한자)
	//메서드 안에서 사용된 지역변수는 (라이프사이클) ./지역안에서만
	//클레스 변수 :클레스 내부 선언, 초기화는 옵션/안하면 기본값나옴,클래스 로드(언급)시점에 초기화,프로그램종료시 해제
	//인스턴스변수 클래스 내부 선언, 초기화여부는 옵션, 인스턴스 생성시 초기화
	//클래스에서 생성자 호출시 제일빠름(초기화) /끝나는건 제일 늦게끝남
	//callstack 현재 실행중인 메서드//
	
	}
	
}
