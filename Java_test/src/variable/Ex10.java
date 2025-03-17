package variable;

public class Ex10 {
	public static void main(String[] args) {
		int[] ball = new int[45];
		
		for(int i = 0; i < ball.length; i++) {
			ball[i] = i+1;
			
			int tmp =0;
			int j = 0;
		
			for(int i1= 0; i1 < 6; i1++) {
				j = (int)(Math.random() *45);
				tmp = ball[i1];
				ball[i1] = ball[j];
				ball[j] =tmp;
			}
		}
			for(int i =0 ; i <6; i++) {
				System.out.printf("ball[%d]=%d%n", i , ball[i]);
		}
	}
}
