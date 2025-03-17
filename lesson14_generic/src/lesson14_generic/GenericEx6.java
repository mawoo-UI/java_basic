package lesson14_generic;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
<<<<<<< HEAD

public class GenericEx6 {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class<GenericEx6> cls = GenericEx6.class;
		Method[] methods = cls.getDeclaredMethods();
		for(Method m : methods) {
			System.out.println(m.getName());
			if(m.getName().equals("test")) {
				m.invoke(new GenericEx6());
			}
		}
		
		GenericEx6 ex6 = cls.newInstance();
		ex6.test();
		GenericEx6.getT(10L);
	}
	void test() {
		System.out.println("test!!");
	}
	
	static <T> T getT(T t) {
		return t; 
	}
}
=======
import java.security.DrbgParameters.Instantiation;

public class GenericEx6 {
public static void main(String[] args) throws InstantiationException, IllegalAccessException, InvocationTargetException {
	Class<GenericEx6> cls =GenericEx6.class;
	Method[] methods= cls.getDeclaredMethods();
	for	(Method m:methods) {
	System.out.println(m.getName());
	if(m.getName().equals("test"));
	m.invoke(new GenericEx6());
	
	}
	
	
	GenericEx6 ex6 = cls.newInstance();
	ex6.test();
	GenericEx6.getT(10L);
}
void test() {
	System.out.println("test!!");
}
static <T> T  getT(T t) {
	return  t;
}
}
>>>>>>> b584507697e52b8b10fa82cc42cffa58f5a0582f
