package lesson12_api;

public class StringEx2 {
public static void main(String[] args) {
	String str= "a";
	str += "b";
	String str2 = "1 "+ "2"+ "3";
	
	//" a" "b" "ab" "1" "2""12""3" "123"
	
	
//	str= "";
	StringBuffer sb = new StringBuffer("");//가변처리/
	sb.append("e");
	System.out.println(sb);
	long start = System.currentTimeMillis();
	for(int i = 0; i < 100_000 ; i++) {
	str += "0";
		sb.append("0");
	}
	long end = System.currentTimeMillis();
	str= sb.toString();
	sb=new StringBuffer(str);
	System.out.println(sb.length()+" ::: "+(end -start)+ "ms");
	// cache, hash/탐색성능, buffer 예비공간 /성능향상의 목적
//	System.out.println(str.length()+" ::: "+(end -start)+ "ms");


	String s= "abcde"; // "abc123de"
//	s=	s.substring(0,3)+ "123" +s.substring(3);
//	System.out.println(s);
//	System.out.println(s.replace("c", ""));


	sb= new StringBuffer(s);
	sb.insert(3, "123");
	sb.deleteCharAt(sb.indexOf("c"));
	System.out.println(sb);
	
	
//  StringBuffer: Thread Safe
// StringBuilder: Thread Unsafe;
	
	//ArrayList 
	// vector
	
}



	}

