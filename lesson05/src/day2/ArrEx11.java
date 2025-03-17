package day2;

public class ArrEx11 {
	public static void main(String[] args) {
		int [][][] arrInt = new int [3] [3] [3];
		
		int value = 0;
		for (int i=0; i < arrInt.length; i++) {
			for (int j=0; j <arrInt[i].length; j++) {
				for (int k=0; k < arrInt[i][j].length; k++) {
					arrInt[i][j][k] = value++;
				}
			}
		}
	
	
		for (int i=0; i< arrInt.length ; i++) {
			for (int j=0; j< arrInt[i].length ;j++) {
				for (int k=0; k<arrInt[i][j].length; k++) {
					System.out.printf ("%4d",arrInt[i][j][k] +"\t");
				}
				System.out.println();
<<<<<<< HEAD
			}
		}
			for(int[][] arr1 : arrInt) {
			for(int[] arr2 : arr1) {
			for(int num : arr2) {
				System.out.printf("4%", num);
=======
			for(int[][] arr1 : arrInt) {				
			
			for(int[][] arr2 : arr1) {
			
			for(int[][] num : arr2) {
>>>>>>> 5f07f8bc23894ecd8cd1bdcc73265f16cf63de68
				
			
			System.out.println();
			}
		}
	}
			}
		}
	}
		int[][][] arr= {
<<<<<<< HEAD
				{
					{1,2},
					{3,4}
				},		
				{
					{4,5},
					{6,7}
				},
				{
					{1,2},
					{3,4}
				}
		};
	}
}
				
=======
	
>>>>>>> 5f07f8bc23894ecd8cd1bdcc73265f16cf63de68
