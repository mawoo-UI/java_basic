package lesson07_oop;

public class MethodMain {
	public static void main(String[] args) {
		
		
		System.out.println(Param.min(1,2,3,4,5,6));
		System.out.println(Param.min());
		System.out.println(Param.min(new int[] {3,4,5}));
		
		
		
		System.out.printf("d","");
		
//		int a=10;
//		Param p = new Param();
//		//argument
//		//paraneter
//		int result = p.add(10, 20);//정확한 개수,정확한 타입
//	System.out.println(result);
//	System.out.println(p.add(30, 40));
//	System.out.println(new Param().add(40, 50));
//	int b = Param.add2(10, 20);
//	System.out.println(b);
//	int c = Param.max(new int[] {10, 20, 5, 30, 1, 4,50});
//	System.out.println(c);
//	System.out.println(Param.max(new int[] {}));
//	System.out.println(Param.max(null));
	
//	class Param.min(1,2,3,4,5,6);
//		int add(int a, int b)
//		{
//			return a+b;
//		}
	
	String str ="가나다라";
	String s1 = str
			.substring(0, 2)
			.concat("AB")
			.substring(1,3);
	System.out.println(s1);
	

	
	}

	static int add2(int a, int b) {
		return a+b;
}
	
	//가변 인자
	
	static int min(int[] num) {
		if(num == null || num.length ==0) {
			
			return -1;
			
		}
		
		int ret = num[0];
		for(int i : num) {
			if (ret <i){
				ret = i;
			}
		}
		//최대값 처리
		return ret;
//가변 인자
	

	
	}
}
//입력 push //출력 pop