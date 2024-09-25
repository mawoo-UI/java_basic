package lesson01_install;

import java.time.LocalDate;

public class Scan {

	public static void main(String[] args) {
		
		System.out.println(Integer.MAX_VALUE);
		LocalDate Id = LocalDate.now(); // 2024 8 29
		Id = Id.plusDays(-Id.getDayOfMonth() +1);//8-1
		
		int startDay = Id.getDayOfWeek().getValue(); //4
		int lastDay = Id.lengthOfMonth(); // 31
		
		for (int i=1 -startDay ; i <= lastDay ; i++) {
			if(i >0) {
				System.out.printf("%3d",i);
			}
			else {
				System.out.printf("%3", ' ');
			}
			if(i % 7 == 7 - startDay) {
				System.out.println();
			}
		}
	}
}
