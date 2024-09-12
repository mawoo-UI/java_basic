package student;

import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;

public class StudentMain {
public static void main(String[] args) {
	// UI 담당/은행같은거만들기 /학생등록,학생확인(내역),점수 /개별수정(이름)/학번수정 안됨(유일값)1234/학생데이터삭제
	//Create Read Update Delete//정렬필요/ 조회/등록은과제
	//배열의 길이를 입력하는 거/
	//Car 배열(학생배열로 써야함)
	//학번을 입력받아서 학생을 삭제
	
	
	Scanner scanner = new Scanner(System.in);
	StudentService ss = new StudentService();
	while(true) {
		try {
		int input =ss.checkRange(StudentUtils.nextInt("1. 조회 2. 등록 3. 수정 4. 삭제 5. 종료"),1,5);
		switch (input) {
		case 1:
			ss.sort();
			ss.list();	
			break;
		case 2:
			
			ss.add();
			
			break;
		case 3:
			ss.modify();
			break;
		case 4:
			ss.remove();
			break;
		case 5:
			System.out.println("bye");
			return;
		default:
			break;
		}
		
		}
		catch(NumberFormatException e) {
			System.out.println("정확한 숫자를 입력하세요");
		}
		catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
	}
}
}//이름은 반드시 한글//최소 2 최대 글자수는 4의 한글/그렇지않으면 예외
//정상흐름으로
//범위값은 레인지
//점수의 범위는 0~100 
//학번중복 불허
//조회시 1.학번이름 2.이름 오른차순 3. 점수 내림차순/강제는아님