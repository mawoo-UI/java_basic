package chapter04;

import java.time.LocalDate;

public class Hello_World {

}
	public static void main(String[] args) {
//	scanner scanner = new Scanner(System.in);
//	int num = scanner.nextint();
//	system.out.println(num * num);
		LocalDate ld = LocalDate.now(); // |
		ld = ld.plusDays(-ld.getDayOfMonth() + 1);
		
		int StartDay = ld.getDayOfWeek().getValue();
		int lastDay = ld.lengthOfMonth();
		
		for(i>0){
			System.out.("%3d", i);
		}
		else {
			System.out.printf("%3c", ' ');
		}
		if( i % 7 == 7 - StartDay) {
	}