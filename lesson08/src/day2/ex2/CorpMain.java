package day2.ex2;

public class CorpMain {
	public static void main(String[] args) {
		Employee[] employees = new Employee[4];
		int idx=0;
		employees[0]= new Programmer("개똥이"); //본인거,자손거 가능
		employees[0]= new Designer("새똥이");
		employees[0]= new Designer("소똥이");
		employees[0]= new BuyManager("말똥이");
		
		
		//추상클래스는  인스턴스 생성 목적 보다는 공통 조상 정의
		//Employee e = new Employee();
		//e.work();
		
		Employee emp = new Employee("미정사원") {
			
			void work() {
				System.out.println("업무진행");
			}
		};
		
		
		for(Employee e : employees) {
			System.out.println("=========" +e.name+ "의 하루=======");
			e.startWork();
			e.work();
			e.endWork();
		}
	}
}
