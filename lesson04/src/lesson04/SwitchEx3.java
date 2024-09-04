package lesson04;

public class SwitchEx3 {

	public static void(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("가위(1), 바위(2), 보(3) 중에 하나를 선택하세요 >");
		int me -scanner.netxInt();
		int com =(int)(Math.random()) *3) +1;
		
		switch(me - com) {
		case -2 : case 1:
				System.out.println("이겼습니다");
		break;
		case 0 :
				System.out.println("비겼습니다");
		default;
				System.out.println("졌습니다");
		}
		System.out.println("나의 패 :" +me+",컴퓨터듸 패 : "+com);	
}
}
