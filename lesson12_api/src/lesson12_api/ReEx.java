package lesson12_api;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReEx {
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("b[A|a]*");// |는 똑같이 사용됨
		Matcher m;
		
		m= pattern.matcher("bat");
		System.out.println("bat = " +m.matches());
		
		m= pattern.matcher("cat");
		System.out.println("cat = " +m.matches());
		
		m= pattern.matcher("bed");
		System.out.println("bed = " +m.matches());
		
		String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
		
		System.out.println ("bat".matches("b[a=z]*"));
		
		
		int[] arr= new int[5];
		arr[0] = 1;
		
		java.util.List<Integer> List = new ArrayList<>();
		List.add(1);
		List.add(2);
		List.add(3);
		
		System.out.println(List);
		System.out.println(List.get(1));
		System.out.println(List.size());
		
	}
}
