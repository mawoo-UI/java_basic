package homework;

public class OperEx {
	public static void main(String[] args) {
//아래는 변수 num 의 값보다 크면서 가장 가까운 10의 배수에서 변수 num의 값을
// 24의 크면서도 가장 가까운 10의 배수는 30이다.
//19의 경우 20이고 81의 경우 90이 된다. 30에서 24를 뺀 나머지는 6
//		변수 num의 값이 24라면 6을 결과로 얻어야한다. 
		int num = 24;
		
		System.out.println(10-num %10 );
	}//나머지연산 
}
