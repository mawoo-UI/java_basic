package _lesson12_api;

import java.time.LocalDate;
import java.util.Scanner;

public class DateEx5 {
public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("[달력 출력 프로그램]");
		System.out.println("달력의 년도를 입력해 주세요.(yyyy): ");
		int yyyy = sc.nextInt();
		sc.nextLine();
		System.out.print(" 달력의 월을 입력해 주세요.():");
		int mm = sc.nextInt();
		
		createCalendar(yyyy,mm);}

	public static void createCalendar(int yyyy, int mm) {
		int previousMonth = (mm == 1) ? 12 : mm -1;
		int previousYear = (mm == 1) ? yyyy - 1 : yyyy;
		int nextMonth = (mm == 12) ? 1 : mm + 1;
		int nextYear = (mm == 12) ? yyyy + 1 : yyyy;
		
		LocalDate cal1 = LocalDate.of(previousYear, nextMonth, 1);
		LocalDate cal2 = LocalDate.of (yyyy , mm , 1);
		LocalDate cal3 = LocalDate.of (nextYear , nextMonth, 1);
		
		int firstDay1 = cal1.getDayOfWeek().getValue();
		int lastDate1= cal1.lengthOfMonth();
		int firstDay2 = cal2.getDayOfWeek().getValue();
		int lastDate2 = cal2.lengthOfMonth();
		int firstDay3 = cal3.getDayOfWeek().getValue();
		int lastDate3 = cal3.lengthOfMonth();
		
		int[] months = {previousMonth, mm, nextMonth};
		int[] dates = {1, 1, 1};
		int[] lastDates = {lastDate1, lastDate2, lastDate3};
		int[] days = {firstDay1, firstDay2, firstDay3};
		
		
		System.out.print("[" +previousYear + "년" + String.format("%02d",(previousMonth)) +"월]" + "\t\t\t\t\t");
		System.out.print("[" + yyyy + "년" + String.format("%02d", mm)+"월]" + "\t\t\t\t\t");
		System.out.println("["+ nextYear + "년" + String.format("%02d", (nextMonth))+"월]");
		
		System.out.print("일\t 월\t 화\t 수\t 목\t 금\t 토\t\t");
		System.out.print("일\t 월\t 화\t 수\t 목\t 금\t 토\t\t");
		System.out.print("일\t 월\t 화\t 수\t 목\t 금\t 토");
		
		for(int j = 0; j < 3; j++) {
			int i = 0;
			if(days[i] > 6) {
				days[j]= days [j] - 7;
				
			}
			while(i < days[j]) {
				System.out.print("\t");
				i++;
				
			}
			for(i = 0; i < lastDates[j]; dates[j]++,i++) {
				System.out.printf("%02d\t", dates[j]);
				days[j]++;
			
			if(days[j] % 7 == 0) {
				System.out.print("\t");
				dates[j]++;
				break;
				}
			}
		}
		System.out.println();
	
	for(int k =0; k <5; k++) {
		for(int j= 0; j <3; j++) {
			if(dates[j] ==0) {
				System.out.print("\t\t\t\t\t\t\t\t");
				break;
			}
			if(days[j] % 7 ==0) {
				System.out.print("\t");
				break;
			}else if (dates[j] <= lastDates[j]) {
				System.out.printf("%02d\t", dates[j]);
				dates[j]++;
				days[j]++;
			}
			if (dates[j] > lastDates[j]) {
				for(int n = 0; n <=(35 - days[j]); n++) {
					System.out.print("\t");
				}
				dates[j] = 0;
				break;
			}
			if(days [j] % 7 == 0) {
				System.out.print("\t");
			}
		}
		}
	System.out.println();
	}
}
