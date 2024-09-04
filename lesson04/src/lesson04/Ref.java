package lesson04;

public class Ref {
	public static void main(String[] args) {
		int[] arr = {1,3,5,7,9};
		int[] arr2 = arr;
		
		arr[0]=10;
		System.out.println(arr2[0]);
		arr= null;
		arr= null;//
				;
		int a = 10;
		int b = a; //a 그대로가져옴 //b는 그대로10
		
		a = 20; //a > 20으로변경
		System.out.println(b);
		
		System.out.println(022);
		System.out.println(0x22);//18진수
	
	
	
	}
	
}
