package student;

import java.util.Scanner;
import java.util.function.Predicate;

public class StudentUtils {
	static Scanner scanner = new Scanner(System.in);

<<<<<<< HEAD
	static String nextLine(String msg) {
=======
	public static String nextLine(String msg) {
>>>>>>> b584507697e52b8b10fa82cc42cffa58f5a0582f
		System.out.println(msg);
		System.out.print("> ");
		return scanner.nextLine();
	}

<<<<<<< HEAD
	static int nextInt(String msg) {
		return Integer.parseInt(nextLine(msg));
	}

	// 입력 통합
	static <T> T next(String msg, Class<T> clazz) {
		System.out.println(msg);
		System.out.print("> ");
		String str = scanner.nextLine();
		if (clazz == Integer.class) {
			return clazz.cast(Integer.parseInt(str));
		} else if (clazz == String.class) {
			return clazz.cast(str);
		} else {
			throw new RuntimeException("잘못된 타입");
		}
	}
=======
//	public static int nextInt(String msg) {
//		return Integer.parseInt(nextLine(msg));
//	}

	// 입력 통합
	static <T> T next(String msg, Class<T> clazz) {
		System.out.println(msg);
		System.out.print("> ");
		String str = scanner.nextLine();
		if (clazz == Integer.class) {
			return clazz.cast(Integer.parseInt(str));
		} else if (clazz == String.class) {
			return clazz.cast(str);
		} else {
			throw new RuntimeException("잘못된 타입");
		}
	}
>>>>>>> b584507697e52b8b10fa82cc42cffa58f5a0582f
	/*
	 * () -> {} Runnable (1) -> {} Consumer () -> {1} Supplier (1) -> {1} Function
	 * (1) - > {b} Predicate
	 */

	// 입력 반복
<<<<<<< HEAD
	static <T> T next(String msg, Class<T> clazz, Predicate<T> con, String errMsg) {
=======
	static <T> int next(String msg, Class<T> clazz, Predicate<T> con, String errMsg) {
>>>>>>> b584507697e52b8b10fa82cc42cffa58f5a0582f
		while (true) {
			try {
				T t = next(msg, clazz);
				if (con.test(t)) {
					return t;
				} else {
					throw new IllegalArgumentException(errMsg);
				}
			} catch (NumberFormatException e) {
				System.out.println("올바른 숫자를 입력하세요");
			} catch (IllegalArgumentException iae) {
				System.out.println(iae.getMessage());
			} 
		}
	}
}