package lesson13_collection;

import java.util.TreeSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class NewLotto {
public static void main(String[] args) {
	TreeSet<Integer> set= new TreeSet<>();
	
	while (set.size()<6) {
		set.add((int)(Math.random()* 45) +1);
		
	}
	System.out.println(set);
	//개별 탐색
	//1. 향상 for
	for(Integer i : set){
	System.out.println(i-1);

	
	}
	//2. iterator 로 변경
	java.util.Iterator<Integer>iter = set.iterator();
//	iter.hasNext();
//	iter.hasNext();
	while(iter.hasNext()) {
		System.out.println(iter.next()-1);
	}
}
}

