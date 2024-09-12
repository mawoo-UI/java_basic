package lesson11_exception;

public class CustomExceptionMain {
public static void main(String[] args) {
	int num = nextInt("국어");
	if(num < 0 || num > 100) {
		throw  new RangeException(0, 100);
	}
}

private static int nextInt(String string) {
	// TODO Auto-generated method stub
	return 0;
}
}
