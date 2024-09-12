package day2.ex2;

public class Employee {
	
	public Employee(String name) {
		this.name = name;
	}
	
	String name;
	void startWork() {
		System.out.println("출근합니다");
	}
		abstract void work();
		void endWork() {
	}
	void work() {
		System.out.println("업무합니다");
	
	}
	public void endwork() {
		System.out.println("퇴근합니다.");
	}
	public String toString() {
		return = name;
	}
	
}
