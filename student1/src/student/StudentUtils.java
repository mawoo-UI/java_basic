package student;

import java.util.Scanner;

public class StudentUtils {
	static Scanner scanner = new Scanner(System.in);
	
	static <T> T  next(String msg,Class<T> clazz) {
		System.out.println(msg);
		System.out.print("> ");
		String str = scanner.nextLine();
	}
	if (clazz == Integer.class) {
		return clazz.cast(str); 
	}else if (clazz == String.class) {
		return clazz.vast(str);
	}else {
		throw new RuntimeException("잘못된 타입");
	}
	
	static <T> T nextInt(String msg,Class<T>clzz, Predicate<T>con, String errmsg) {
		while(true) {
			try {
				T t = next(msg,clazz);
				if(con.test(t)) {
				return t;
				}	else {
					throw new IllegalAccessError(errmsg);
				}
				}
			}
		}
		
		return Integer.parseInt(nextLine(msg));
	}


	}
}
