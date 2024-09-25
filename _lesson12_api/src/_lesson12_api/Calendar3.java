package _lesson12_api;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Calendar3 {


	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		Date date = new Date(cal.getTimeInMillis());
//		date.setTime(cal.getTimeInMillis());
		SimpleDateFormat sdf = new SimpleDateFormat("ToDay"+"YYYY-MM-dd HH:mm:ss");
			
		int year = cal.get(Calendar.YEAR);
		int dayofweek= cal.get(Calendar.DAY_OF_WEEK);
		int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		for (int i =1; i< dayofweek; i++) {
			System.out.println("   ");
		}
		for (int i = 1; i<= lastDay; i++) {
			System.out.println();
		}
		dayofweek++;
		
		
		cal.set(year, lastDay, 0);
//		cal.set();
//		System.out.println(year);
//		System.out.println(SEPEMBER);
//		System.out.println(cal.get(MONTH));
//		System.out.println(cal.get(DATE));
		
	}
}
