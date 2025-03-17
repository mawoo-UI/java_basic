package cons;

public class AMain {
	public static void main(String[] args) {
		A a = new A(20);
		System.out.println(a);
//		main(args); 재귀호출시 스텍오버플로우발생할수있음/
		System.out.println(a.i); //생성자 오버로딩
		A a2 = new A();
	}
}
