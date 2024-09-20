package lesson13_collection;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetEx4 {
private static TreeSet members;

public static void main(String[] args) {
//	Set<Integer> set=new TreeSet<>((i1,i2)->{return i2 =i1});
	Set<Integer> set=new TreeSet<>((i1,i2)-> i2 =i1);
	set.add(100);
	set.add(99);
	set.add(7);
	set.add(13);
	set.add(15);
	
	System.out.println(set);
	
	Set<Object> set2 =new TreeSet<>();
	set2.add("홍길동");
	set2.add("고길동");
	set2.add("새똥이");
	set2.add("개똥이");
	set2.add(1);
	
	System.out.println(set2);
	
	
//	Set<Member> Member = new TreeSet<>(new Comparator()<> {
//
	Member.add(new Member("홍길동", 40));
	Member.add(new Member("홍길동", 40));
	Member.add(new Member("홍길동", 40));
	Member.add(new Member("홍길동", 35));
	
	System.out.println(members);
	
	class Member implements Comparable<>((o1, o2) ->o1.name.compareto(o2.nave));
	
	members = new TreeSet<>();
members.add(new Member("홍길동", 40));
members.add(new Member("고길동", 40));
members.add(new Member("김길동", 40));
members.add(new Member("새똥이", 40));

System.out.println(members);


	}
	//TreeSet에 저장될 자료를 만족할 조건
	//1.Comparable 인터페이스를 구현한 객체
	//2. 혹은 Comparator 를 별도로 지정

	//why ?
	

	
	
}
