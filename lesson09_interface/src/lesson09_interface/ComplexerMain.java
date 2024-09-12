package lesson09_interface;

public class ComplexerMain {
	public static void main(String[] args) {
		Complexer com = new Complexer();
		System.out.println(Complexer.INK);
		System.out.println(Printer.INK);	
		
		System.out.println(com.FAX_NUMBER);
		
		
		com.print();
		com.scan();
		com.send("02-8765-4321");
		com.receive("02-8765-4321");
		
		Fax fax = new fax() {  //상속처럼 앞에 올 수 있음
		public void send(String msg) {
			System.out.println("fax 송신");
			
		}
		public void receive(String msg) {
			System.out.println("fax 수신");
		
	}
		{	
	fax.send("abcd");
		
		
		Complexer com2 =new Complexer() {
			public void scan() {
				System.out.println("com2의 스캔");
			}
		};
		
	com2.print();
	com2.scan();

	//comparator : 비교자	
	//comparable:비교가능한 //인터페이스에 많음
}

		}
	}
}