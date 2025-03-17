package variable;

public class Ex9_2 {
	public static void main(String[] args) {
		System.out.println("배개변수의 개수:"+ args.length);
			for(int i=0; i< args.length;i++) {
				System.out.println("args["+i+"]=\""+args[i]+"\"");
			}
		}
	}

