package day2;

public class ArrEx12 {
	public static void main(String[] args) {
		String[][] addrs = {
				{"홍길동,", "고길동"},
				{"서울", "제주"},
				{"0001,","0002","0003"}
		};
		
		for(int i = 0 ; i < addrs.length ; i++) {
			System.out.println(addrs[i].length);
			for(int j = 0 ; j < addrs[i].length ; j++) {
				
				System.out.println(addrs[i][j]+" ");
			}
			System.out.println();
}
		
//	int[][] arr = new int[3][2];
//	//System.out.println(arr[0].length);
//	arr[0] = new int[] {1,2,3,4};
//	arr[1] = new int[2];
//	arr[2] = null;
//	System.out.println(arr[0].length);
//	System.out.println(arr[1].length);
//	System.out.println(arr[2].length);
	/*
	 * 0 1 2 3 4
	 * 2 3 4
	 * 4
	 * 
	 * 
	 * 
	 */
	
	
		//배열의 복사 
		
	}
}
