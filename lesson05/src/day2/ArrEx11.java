package day2;

public class ArrEx11 {
	public static void main(String[] args) {
		int [][][] arrInt = new int [3] [3] [3];
		int value = 0;
		
		for (int i=0; i<=2; i++) {
			for (int j=0; j<=2; j++) {
				for (int k=0; k<=2; k++) {
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
			for(int[][] arr1 : arrInt) {
				
			}
			for(int[][] arr2 : arr1) {
				
			}
			for(int[][] num : arr2) {
				
			}
			System.out.println();
			}
		}
		int[][][] arr= {
				{
					{1,2},
					{3,4}
							
				{
					{4,5},
					{6,7}
					
				
				