package lesson16_stream;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStream {

	public static void main(String[] args) {
		IntStream is = IntStream.rangeClosed(1, 5);
		is.forEach(System.out::println);
		
		List<Integer> list = IntStream.rangeClosed(1, 45).boxed().collect(Collectors.toList());
		Collections.shuffle(list);
		System.out.println(list.subList(0, 6));

	// 과제 이거 써서 사용하기
		LongStream ls = new Random().longs(6, 1, 45).sorted();
		ls.forEach(System.out::println);
		
		IntBinaryOperator ibo = Math :: max;
		
		Function<String, Integer> f =Integer:: parseInt ;
		
//		BinaryOperator<String> bo = (x,y) -> x.concat(y);//파라미터 언급금지
		BinaryOperator<String> bo = String ::concat;
		System.out.println("a".concat("b"));
		
//		Function<String, Exception> f2 = s-> new Exception(s);
		Function<String, Exception> f2 = Exception :: new;
		
		
		
		is = "가나다라ABCD".chars();
		is.forEach(s -> System.out.println((char)s));
		
		
//		Comparator<String> com =(x,y) -> y.compareTo(x);
		Comparator<String> com = String:: compareTo;
		
		
	}
}
