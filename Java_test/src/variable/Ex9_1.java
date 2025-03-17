package variable;

public class Ex9_1 {
	public static void main(String[] args) {
		String[] names = {"Kim","Park","Yi"};
		
		for(int i = 0; i < names.length; i++) {
			System.out.println("naemes["+i+"]:"+names[i]);
			
			String tmp = names[2];
			System.out.println("tmp:"+tmp);
			names[0] ="Yu";
			
			for(int i1 =0; i1 < names.length; i1++) {
				System.out.println(names[i1]);
			}
		}
	}
}
