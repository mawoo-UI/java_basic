package Lesson15_lambda;

import java.util.function.Function;

public class LambdaEx {
	public static void main(String[] args) {
		MyInter<Integer> inter = t -> t * t;

		System.out.println(inter.m(10));
		MyInter<String> inter2 = s -> "hello !! " +s;
		System.out.println(inter2.m("새똥이"));
		
		Function<String, Integer> f = s -> Integer.parseInt(s);
//		Function<String, Integer> f2 = Integer::parseInt;
		
		int result = f.apply("1234");
		System.out.println(result + 1000);
		
		
		Object o = new MyInter<Integer>() {

			@Override
			public Integer m(Integer t) {
				return t;
			}
			
		};
	Object o2 =	(MyInter<String>)(s -> s);//식자체로는 안됨/추론에 의해 실행임
	}
}

@FunctionalInterface
interface MyInter<T> { // 추상메서드가 단 하나일떄만
	T m(T t);

	default T m2(T t) {
		return t;
	}
}