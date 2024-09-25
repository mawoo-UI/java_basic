package lesson05_control;

public class SwitchEx {
	public static void main(String[] args) {
		//IfEx4 계절 계산을 switch로 변환
		int month = 1;
		switch(month/3) {
		case 1:
			System.out.println("봄");
			break;
		case 2:
			System.out.println("여름");
		break;
		case 3 :
			System.out.println("가을");
		break;
		default :
			System.out.println("겨울");
		}
	
	}
}
