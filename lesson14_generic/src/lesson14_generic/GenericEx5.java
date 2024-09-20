package lesson14_generic;

import java.util.ArrayList;

public class GenericEx5 {
public static  void main(String[] args) {
	Gen3 g3 =new Gen3();
	Generic5< ? super Gen2>g2 = new Generic5<>(new Object());
	Gen1 t2 = (Gen3)g2.getT();
	Object t1=g2.getT();
	System.out.println(t2.getName());

	Generic5<? extends Gen2> g4 = new Generi1c5<>(g3);
	Gen2 t3= g4.getT();
	Gen3 t4= (Gen3)g4.getT();
	
	Generic5<?> g7 = new Genric5<>(1);
	Object t5= g6.getT();
	Gen3 t6 =(Gen3)g6.getT();
	
	Generic5<?> g7 = new Generic5<>(1);
	System.out.println(g7.getT());

}

}
 Class Gen1 {
	 String getName() {
		 return getClass().
	 }
}	