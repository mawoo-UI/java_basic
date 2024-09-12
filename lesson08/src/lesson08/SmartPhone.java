package lesson08;

public class SmartPhone extends Phone {
	public void installapp() {
		
		
		
		System.out.println("앱 설치");
	}
	public SmartPhone() {   }
	
	public SmartPhone(String name, String color, String company) {
		super(name, color, company);

	}
	void installApp() {
		System.out.println("앱 설치");
	}
}
