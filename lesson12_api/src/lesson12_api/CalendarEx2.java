package lesson12_api;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarEx2 {
	public static void main(String[] args) {
	Calendar cal = Calendar.getInstance();
	SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
	System.out.println(sdf.format(new Date(cal.getTimeInMillis())));	
	cal.add(Calendar.DATE, -10000);
	System.out.println(sdf.format(new Date(cal.getTimeInMillis())));
	cal.add(Calendar.MONTH, 200);
	System.out.println(sdf.format(new Date(cal.getTimeInMillis())));
	cal.roll(Calendar.DATE, 4);
	System.out.println(sdf.format(new Date(cal.getTimeInMillis())));
	
	
	//과제/첫출력, 이번달
	//년,월 입력해서 달력표출
}
}
