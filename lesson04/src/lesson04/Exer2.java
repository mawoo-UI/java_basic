package lesson04;

public class Exer2 {
	public static void main(String[] args) {
		
		for(int i = -2; i <=5 ; i++) {
			for(int j =-2 ; j <= 5; j++) {
			
				//if(i *j ==0) 
				if(i * j >= -1 && i* j <= 1){
					System.out.println("*");
				}
			
		
				else {
					//System.out.printf("%7c", ' ');
					System.out.print('');
				}
			}
		}
	}
}


