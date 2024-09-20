package lesson12_api;

import java.time.Month;
import java.util.Calendar;
import java.util.Scanner;

public class Exer2 {
public static void main(String[] args) {
static Scanner = new Scanner(System.in);
}
	Calendar cal= Calendar.getInstance();//2024 09 19일의 정보가들어가있음 > 2024-09-01로 바꿔서
	cal.set(Calendar.MONTH, 1);
	//연, 월, 마지막날짜,1일의 요일
	int year = cal.get(Calendar.YEAR);
	int month = cal.get(Calendar.MONTH);//8
	System.out.println(year);
	System.out.println(month);
	int lastDate = cal.getActualMaximum(Calendar.DATE);
	System.out.println(lastDate);
	cal.set(Calendar.DATE, 1);
	
	While (true){
		System.out.println("1. 이전달 2.다음달 3.이전해 4.다음해 5.달 지정(검색)");
	switch (Integer.parseInt(Scanner.nextInt())) {
	case 1:
		cal.add(Calendar.MONTH,-1);
	
	case 2:
		cal.add(Calendar.MONTH,1);
	break;
	
	case 3:
	cal.add(Calendar.YEAR,1);
	break;

case 4: cal.add(Calen.Year,-1);
	break;

case 5;
Systam.out.println("연도, 월을 입력해주세요 ex) 2024/09 >");
String str= Scanner.nextLine();
cal.setTimenew (new SimppleDateFormat("yyyyy/MM").parse(str));
break;
default:
	break;
	}
	printCal(cal);
	int starDay = cal.get(Calendar.DAY_OF_WEEK);
	System.out.println(starDay);
//
//	// 0 1 2 3 4 
//	for (int i = 1 - 2 ; i<= lastDate+1 ; i++) {
//		System.out.printf("%4d", i);
//	if(i % 7 == (7- starDay+ 14)$ 7 {
//		{
//		elser{
//			System.out.println("    ");
//	
//			el
//	}
//		System.out.println();
//	}
//	}
//	}
}
