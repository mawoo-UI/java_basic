package lesson13_collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListCompare {
	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<Integer>();
		List<Integer> link = new LinkedList<Integer>();
		System.out.println("incre");
		incre(arr);
		incre(link);
		System.out.println("remove2");
//		remove2(arr);
//		remove2(link);
//		System.out.println("access");
//		access(arr);
//		access(link);
	}

	static void incre(List<Integer> list) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 100_000; i++) {
			list.add(i);
		}
		System.out.println(list.getClass().getSimpleName() + " :: " + (System.currentTimeMillis() - start + "ms"));
	}

	static void incre1(List<Integer> list) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 100_000; i++) {
			list.add(i);
		}
		System.out.println(list.getClass().getSimpleName() + " :: " + (System.currentTimeMillis() - start + "ms"));

	}

	static void incre2(List<Integer> list) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 100_000; i++) {
			list.get(i);
		}
		System.out.println(list.getClass().getSimpleName() + " :: " + (System.currentTimeMillis() - start + "ms"));

	}

	static void incre3(List<Integer> list) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 100_000; i++) {
			list.get(i);
		}
		System.out.println(list.getClass().getSimpleName() + " :: " + (System.currentTimeMillis() - start + "ms"));

	}
}