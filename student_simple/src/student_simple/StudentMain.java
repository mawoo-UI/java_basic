package student_simple;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentMain {
	public static void main(String[] args) {
		
		//var s ={};
		
		Student s = new Student();
		s.no =10;
		s.name = "이부진";
		s.kor = 80;
		s.eng = 100;
		s.mat = 90;
		
		System.out.println(s.total());
		
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(10,5,4,3,2,20));
		list.sort(new MyComp());
		
		
	}
}
	class MyComp implements Comparator <Integer>{
	
}
	System.out.println(list);