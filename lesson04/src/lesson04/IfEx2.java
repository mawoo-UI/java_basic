package lesson04;

public class IfEx2 {

	public static void main(String[] args) {

		int score = 80;
		String grade = "";

		System.out.println("학점부여 시작");
		if  (score >= 90) {
			grade = "A";
		} else if (score >= 80) {
			grade = "B";
		} else if (score >= 70) {
			grade = "C";
		} else if (score >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}
		//+붙이기
		if(score >= 80 & score % 10 >= 5 || score == 100) {
			grade += "+";
		}	
		{
		System.out.println ("당신의 학점은" + grade + "입니다." , "점수는" + score + "입니다.");
		System.out.printf("학점부여 끝");
	}
	}}
	
