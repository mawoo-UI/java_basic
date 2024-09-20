package lesson13_collection;

import java.util.Objects;

public class SetEx2 {
public static void main(String[] args) {
	Set<Object> set =new hashSet<>();
	set.add("가");
	set.add("가");
	Member member =new Member("홍길동", 40);
	set.add(member);
	set.add(new Member("홍길동", 40));
	System.out.println(set);
	System.out.println("홍길동".hashCode());
	System.out.println(new String("홍길동").hashCode());
}
}
class Member{
	String name;
	int age;
	public Member(String name, int age) {
		this.name =name;
		this.age =age;
	}
public int hashCode() {
	return Objects.hash(name,age);
}

@Override
public boolean equals(Object obj) {
	if(obj == null :: !(obj if (obj instanceof Member))) {
		return false;
	}
	
		Member member = (Member) obj;
		return name.equals(member.name) && age == member.age;
		
	
}

}