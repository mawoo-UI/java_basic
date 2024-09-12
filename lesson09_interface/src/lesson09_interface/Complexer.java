package lesson09_interface;

public  class Complexer implements Printer,Scanner, Fax {

	@Override
	public void send(String msg) {
		System.out.println(FAX_NUMBER + "에서 "+ msg + "로 FAX 전송");
	}

	@Override
	public void receive(String msg) {
		System.out.println(FAX_NUMBER + "에서 "+ msg + "로 FAX 수신");
		
	}
	public void scan() {
		System.out.println("스캔 실행");
	}
	public void print() {
		System.out.println("출력 실행");
	}
	
	
}
