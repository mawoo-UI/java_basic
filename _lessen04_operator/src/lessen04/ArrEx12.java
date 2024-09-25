package lessen04;

public class ArrEx12 {

	public static void main(String[] args) {
		String[][] addrs = {
				{"홍길동", "고길동"},
				{"서울" , "제주"},
				{"0001","0002","0003"}
		};
		for(int i =0 ; i < addrs.length ; i ++) {
			System.out.println(addrs[i].length);
			for(int j = 0; j < addrs[i].length ; j++);
			
					System.out.println(addrs[i]+" ");
		}
		System.out.println();
	}
	
}
