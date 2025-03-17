package stud;

import java.util.Scanner;

public class UtilMain {
	Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		// 사용자로 부터 콘솔 입력/변수입력해서
//		,이름 , 아이디 ,비밀번호를 받으세요
//		System.out.println("이름을 입력해주세요");
//		String name = Utils.nextLine("이름을 입력해주세요");
//
//		System.out.println("아이디를 입력해주세요");
//		String id = Utils.nextLine("아이디를 입력해주세요");
//		
//		System.out.println("비밀번호를 입력해주세요");
//		String pw = scanner.nextLine();
//		String pw = Utils.nextLine("비밀번호를 입력해주세요");
//		
//		System.out.println(name);
//		System.out.println(id);
//		System.out.println(pw);
		
//		int kor = Utils.nextInt("국어점수를 입력 하세요");
		
		
		Student 한주연 = new Student();
		
		한주연.kor = 75;
		한주연.eng = 65;
		한주연.mat = 65;
		
		System.out.println(한주연.no);
		System.out.println(한주연.name);
		System.out.println(한주연.kor);
		System.out.println(한주연.eng);
		System.out.println(한주연.mat);
		System.out.println(한주연.sum());
		System.out.println(한주연.avg());
//		한주연.sum();
//		System.out.println(한주연.sum());
//		한주연.avg();
		
//		멤버: 클레스가 가지고있는 변수와 메서드
//		System.out.println((student.kor+student.eng+student.mat) /3);
		
//		Student.getName();
//		Student.getNo();
//		Student.getKor();
//		Student.getEng();
//		Student.getMat();
//		System.out.println(student.add);
	}
}
