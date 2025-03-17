package homework;

import java.util.*;
import java.util.Scanner;

public class HomeWork4 {
	public static void main(String[] args) {

//	### 1. 간단한 `if-else` 사용
//사용자로부터 정수를 입력받아, 이 정수가 짝수인지 홀수인지 판별하는 프로그램을 작성하세요.

		Scanner scanner = new Scanner(System.in);
//		System.out.printf("정수를 입력해주세요>");
//		int number = scanner.nextInt();
//		//if(number >0)
//		if(number %2==0) {
//			System.out.println("짝수입니다.");
//		}else {
//			System.out.println("홀수입니다.");
//		}

		// nextInt 쓰지말것.
//		int input = Integer.parseInt(sanner.nextLine());
//		String str = input + " ";
		// '0' :48, 'A' :65 ,'a' :97
//		char lowercase = 'A' + 32;
//		의문문
//		동사 + 주어 + 형용사 >> 2형식의 질문은 답을 어떻게?boolean 
//		문자 형식 5형식 : 문장 형식 결정 >> 동사가 결정
//		1형식: 주어 + 동사  : I go??
//		2형식: 주어 + 동사 + 형용사 :You are OK, I am fine, I am hungry >be동사
//		1인칭 am 2인칭 are 3인칭 is //객체
//		동사:메서드
//		3형식: 주어 + 동사 + 목적어(~을, ~를)//
//		Mr' Han buy the house?, //Miss won eat meal

//		if >질문형식 >boolean이 들어감//수식결과로boolean나오는 연산자 :논리연산,
//		are you OK?
// 		even >> 짝수 2의 배수/ %2사용
//		odd >> 홀수 //! 부정사용
//		boolean isEven = i % 2 ==0;;

		// + -:부호 부정
		// 1.부호(단항) 거의 사용되지 않는다.
		// 2.산술 (이항) 산술연산자의 조건 >> 피연산자 타입확인>>
		// 문자열 결합 연산 "1"+ "2" >> 12
		/*
		 * if(피연산자 중 하나가 문자열인가?) { 문자열 결합 }
		 * 
		 * else {
		 * 
		 */
		// systeam.out.println

//	### 2. 중첩 `if-else` 사용
//	사용자로부터 3개의 정수를 입력받아, 가장 큰 수를 출력하는 프로그램을 작성하세요.

//		System.out.println("첫번째");
//		int i1 = Integer.parseInt(scanner.nextInt());
//		System.out.println("두번째");
//		int i2 = Integer.parseInt(scanner.nextInt());
//		System.out.println("번번째");
//		int i3 = Integer.parseInt(scanner.nextInt());
//
//		if (i1 < i2) {
//			if (i2 < i3) {
//				System.out.println(i3);
//			} else {
//				if (i1 < i3) {
//					System.out.println(i3);
//
//				} else {
//					System.out.println(i1);
//				}
//			}
//
//			int max = i3;
//
//			if (max < i2) {
//				max = i2;
//			}
//			if (max < i1) {
//				max = i1;
//			}
//			System.out.println(max);
//		}

//		Scanner scanner = new Scanner(System.in);
//
//		System.out.print("1번째 정수를 입력 해주세요 >");
//		String input = scanner.nextLine();
//		int num1 = Integer.parseInt(input);
//		System.out.println("2번째 정수를 입력 해주세요 >");
//		String input2 = scanner.nextLine();
//		int num2 = Integer.parseInt(input2);
////		System.out.println("3번째 정수를 입력 해주세요>");
////		int num3 = Integer.parseInt(input);
//		if (num1 > num2) {
//			System.out.println(num1);
//		} else {
//			System.out.println(num2);
//		}
//		System.out.println(num2);
//		System.out.printf("num=%d%n", num);

//	### 3. `if-else`와 논리 연산자 사용
//	사용자가 입력한 나이가 18세 이상이면 "성인입니다"를 출력하고, 그렇지 않으면 "미성년자입니다"를 출력하는 프로그램을 작성하세요.

		int age = 20;
		if (age >= 18) {
			System.out.println("성인");
		} else {
			System.out.println("미성년자");
		}
		System.out.println("입니다.");

//	### 4. `if-else`를 사용한 학점 계산
//	학생의 점수를 입력받아 다음과 같은 학점을 출력하는 프로그램을 작성하세요:
//	- 90점 이상: A
//	- 80점 이상: B
//	- 70점 이상: C
//	- 60점 이상: D
//	- 그 외: F

//		int score = 77;
//		if (score >= 90) {
//			System.out.println("A");
//		} else {
//			if (score >= 80) {
//				System.out.println("B");
//			} else {
//				if (score >= 70) {
//					System.out.println("C");
//				}
//			}
//
//		}

//		int score = 0;
//		char grade = ' ';
//		
//		System.out.print("점수를 입력하세요. >");
//		Scanner scanner = new Scanner(System.in);
//		score = scanner.nextInt();
//		
//		if (score >= 90) {
//			grade = 'A';
//		} else if (score >= 80) {
//			grade = 'B';
//		} else if (score >= 70) {
//			grade = 'C';
//		} else if (score >= 60) {
//			grade = 'D';
//		} else if (score < 60)
//			grade = 'F';
//		System.out.println("당신의 학점은"+ grade +"입니다.");
//	}

//	### 5. `switch`문을 이용한 요일 출력
//
//	사용자로부터 1~7 사이의 숫자를 입력받아, 해당 숫자에 맞는 요일을 출력하는 프로그램을 작성하세요.
//
//	- 1: 월요일
//	- 2: 화요일
//	- 3: 수요일
//	- 4: 목요일
//	- 5: 금요일
//	- 6: 토요일
//	- 7: 일요일
//		int day =3;
////		변수 >> 점수 (byte short int long char),문자열
//		switch (day) {
//		case 1:
//		case 3:
//			System.out.println("수요일");
//			break;
//		case 4:
//			System.out.println("목요일");
//			break;
////			return(메서드)
//	}

//		System.out.print("1~7 사이를 입력하세요>");
//		Scanner scanner = new Scanner(System.in);
//		int number = scanner.nextInt();
//		switch (number) {
//		case 1:
//			System.out.println("월요일 ");
//			break;
//		case 2:
//			System.out.println(" 화요일 ");
//			break;
//		case 3:
//			System.out.println(" 수요일 ");
//			break;
//		case 4:
//			System.out.println(" 목요일 ");
//			break;
//		case 5:
//			System.out.println("금요일 ");
//			break;
//		case 6:
//			System.out.println("토요일 ");
//			break;
//		case 7:
//			System.out.println("일요일 ");
//			break;
//		}
//		System.out.println("입니다.");
//		
//	}
////
//	### 6. 중첩된 `if-else`문을 사용하여 로그인 검사
//
//	사용자로부터 입력받은 아이디와 비밀번호를 비교하여, 맞으면 "로그인 성공", 틀리면 "로그인 실패"를 출력하는 프로그램을 작성하세요.
////
//		String storedId = "ABCD";
//		String StoredPw = "1234";
//		
//		String inputId = "ABCD";
//		String inputPw = "1234";
//	
//		if(storeId.equals(inputId)) {
//			if(StoredPw.equals(inputPw)) {
//				System.out.println("로그인 성공");
//			}else {
//				
////			}else {
////				

//	}

//		String userId = "abcd";
//		String userPw = "12345";
//		
//		Scanner scanner = new Scanner(System.in);
//		System.out.printf("아이디를 입력해주세요>");
//		String usersId = scanner.nextLine();
//			System.out.printf("비밀번호를 입력해주세요");
//		String usersPw = scanner.nextLine();
//			if(usersId.equals(userId) && usersPw.equals(userPw)) {
//				System.out.println("로그인 성공입니다!");
////			String usersPw = scanner.nextLine();
//	
//		}else {
//			System.out.println("아이디와 비밀번호를 다시 확인해주세요");
//		
//			if(user_pw){
//			System.out.println("로그인 성공");
//			
//		}
//}
//		System.out.print("비밀번호를 입력해주세요");
//		input = Integer.parseInt(tmp);

//	### 7. `if-else`를 사용한 세금 계산
//
//	연봉을 입력받아 다음 규칙에 따라 세금을 계산하는 프로그램을 작성하세요:
//
//	- 연봉이 5천만 원 이하: 10% 세율
//	- 연봉이 5천만 원 초과 1억 원 이하: 20% 세율
//	- 연봉이 1억 원 초과: 30% 세율

//	long annual = 80_000_000L;
//	if(annual>100_000_000)
//	{
//		System.out.println("%30");
//	}else if(annual >50_000_000){
//			System.out.println("20%");
//		} else {
//			System.out.println("10%");
//	}
//		if (annual <= 50_000_000) {
//		}else if (annal > 10_000_000) {
//		}else {
//		
//		}
		
		
//	### 8. `switch`문을 이용한 간단한 계산기
//
//	사용자로부터 두 개의 숫자와 연산자(+, -, *, /)를 입력받아 결과를 출력하는 프로그램을 작성하세요.
// In on at//어디 안쪽에서의 특정값
	
	// right on time /
	//
	
	//이번달에 in	in this month
	//이번주에 on on this week
	//이시각에 at 
//System.out.println(" 숫자를 입력 해주세요");
//
//Scanner scanner = new Scanner(System.in);
//	switch(input){
//	case 1: {
//		
//}
//default:
//	throw new IllegalArgumentException("Unexpected value: " + input);
//}

//	### 9. `if-else`로 음수, 양수, 0 판별
//
//	정수를 입력받아 해당 숫자가 양수, 음수 또는 0인지 판별하는 프로그램을 작성하세요.
//
//	### 10. `switch`문을 사용한 계절 출력
//
//	사용자로부터 월(1~12)을 입력받아, 해당 월이 속한 계절을 출력하는 프로그램을 작성하세요.
//
//	- 12, 1, 2: 겨울
//	- 3, 4, 5: 봄
//	- 6, 7, 8: 여름
//	- 9, 10, 11: 가을
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("1~12월 중 숫자를 입력 해주세요 ");
//		int month =scanner.nextInt();
//		switch (month) {
//		case 3: case 4: case 5:
//			System.out.println("현재의 계절은 봄 입니다.");
//			break;
//		case 6: case 7: case 8:
//			System.out.println("현재의 계절은 여름 입니다.");
//			break;
//		case 9: case 10: case 11: 
//			System.out.println("현재의 계절은 가을 입니다.");
//			break;
//		case 12: case 1: case 2:
//			System.out.println("현재의 계절은 겨울 입니다.");
//			break;
//		}

//
//	### 11. 삼항 연산자를 사용한 간단한 프로그램
//
//	두 수를 입력받아, 더 큰 수를 출력하는 프로그램을 작성하세요. (삼항 연산자를 사용할 것)
//

//		Scanner scanner = new Scanner(System.in);
//		System.out.println(" 숫자를 입력 해주세요");
//		String input = scanner.nextLine();
//		int num1 =Integer.parseInt(input);
//		
//		System.out.println(" 숫자를 입력 해주세요");
//		String input2 = scanner.nextLine();
//		int num2 = Integer.parseInt(input2);

//	### 12. `if-else`와 `switch`를 조합한 프로그램
//
//	사용자가 선택한 메뉴(1: 커피, 2: 주스, 3: 물)에 따라 각각의 가격을 출력하고, 그 외 숫자가 들어오면 "잘못된 선택입니다"를 출력하는 프로그램을 작성하세요.
//
//	### 13. `if-else`로 윤년 판별
//
//	연도를 입력받아 해당 연도가 윤년인지 아닌지 판별하는 프로그램을 작성하세요. (윤년: 4로 나누어지고 100으로 나누어지지 않거나, 400으로 나누어지는 해)
//
//	### 14. `switch`를 이용한 학년 구분
//
//	사용자로부터 학년을 입력받아, 해당 학년이 "1학년", "2학년", "3학년", "4학년"인지 출력하는 프로그램을 작성하세요. 그 외 숫자가 들어오면 "잘못된 학년"이라고 출력하세요.
//
//	### 15. `if-else`로 숫자 범위 확인
//
//	사용자로부터 입력받은 숫자가 1~100 사이에 있는지 여부를 확인하여, 범위 안에 있으면 "유효한 숫자입니다"를 출력하고 그렇지 않으면 "유효하지 않은 숫자입니다"를 출력하는 프로그램을 작성하세요.

}}
