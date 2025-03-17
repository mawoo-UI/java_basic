package lesson14_generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenericEx4 {
<<<<<<< HEAD
	public static void main(String[] args) {
		List<Map<String, Object>> list = new ArrayList<>();
		Map<String, Object> map = new HashMap<>();
		map.put("name", "홍길동");
		map.put("id", "hong");
		map.put("age", 30);
		
		list.add(map);
		
		map = new HashMap<>();
		map.put("name", "이순신");
		map.put("id", "lee");
		map.put("age", "40");
		
		list.add(map);
		
		map = new HashMap<>();
		map.put("name", "김유신");
		map.put("id", "kim");
		map.put("age", 50);
		
		list.add(map);
		
		for(int i = 0 ; i < list.size() ; i++) {
			System.out.printf("인덱스 : %d, 이름 : %s, 아이디 : %s, 나이 : %d\n", 
					i, list.get(i).get("name"), list.get(i).get("id"), list.get(i).get("age"));
		}
	}
=======
public static void main(String[] args) {
	List<Map<String,Object>> list = new ArrayList<>();
	Map<String, Object> map = new HashMap<>();
	map.put("name ","홍길동");
	map.put("id","hong");
	map.put("age", 30);
	list.add(map);
	
	map = new HashMap<>();
	map.put("name ","이순신");
	map.put("id","lee");
	map.put("age", 40);
	list.add(map);
	
	map = new HashMap<>();
	map.put("name ","김유신");
	map.put("id","kim");
	map.put("age", 50);
	list.add(map);
	
	list.add(map);
	for(int i = 0; i < list.size() ; i ++) {
		System.out.printf("인덱스 : %d, 이름 : %d, 아이디 : %d, 나이 : %d\n",
				i,list.get(i).get("name"),list.get(i).get("id"),list.get(i).get("age"));
	}
}
>>>>>>> b584507697e52b8b10fa82cc42cffa58f5a0582f
}