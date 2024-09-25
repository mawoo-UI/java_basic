package _lesson12_api;

import java.util.Calendar;

public class DateEx4 {
	private static Calendar cal;

	public static void main(String[] args) {
		
		cal.set(Calendar.DATE,1);
		int FirstDayOfMonth = cal.get(Calendar.DAY_OF_WEEK);
		
		for(int i= 1; i<FirstDayOfMonth; i++);{
			System.out.println(" \n");
		}
			
		
	}
}
