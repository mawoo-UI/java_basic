package ch5;

public class MultiArrEx3 {
	public static void main(String[] args) {
		
	
	int[][] m1 = {
			{1,2,3},
			{4,5,6}
	};
	int[][] m2 = {
			{1,2},
			{3,4},
			{5,6}
	};
	final int ROW	= m1.length;
	final int COL	= m2[0].length;
	final int M2_ROW = m2.length;
	
	int[][] m3 = new int[ROW][COL];
	
	for(int i=0;i<ROW;i++) 
		for (int j =0; j < COL; j++)
			for(int k=0;k<M2_ROW;k++)
				m3[i][j] += m1[i][k] * m2[k][j];
	
		for(int i=0;i<ROW;i++) {
			for(int j=0;j<COL;j++) {
				System.out.printf("%3d",m3[i][j]);
			
			}

			System.out.println();
		}
	}//인덱스 순번을 통해 숫자를 사용하는것.
	//ex) 인덱스 5가 담겨있다면 마지막 숫자는 0~4임으로 4
}