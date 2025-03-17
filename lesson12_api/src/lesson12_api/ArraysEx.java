package lesson12_api;

import java.util.Arrays;
import java.util.Random;
import java.util.function.BiFunction;
import java.util.stream.IntStream;

public class ArraysEx {
	public static void main(String[] args) {
		String[] arr = {"홍길동","이순신","강감찬","김유신"};
		Arrays.sort(arr, (o1, o2) -> -o1.compareTo(o2));
		System.out.println(Arrays.toString(arr));
		
		
		BiFunction<String, String, Integer> bi = (o1,o2) -> -o1.compareTo(o2);
		
		int[]arr2 = new int [10];
//		Arrays.fill(arr2, 5);
		Arrays.fill(arr2, new Random().nextInt(6)+1);
		System.out.println(Arrays.toString(arr2));
	int[] arr3	= IntStream.rangeClosed(1, 100).toArray();
	System.out.println(Arrays.toString(arr3));
	}
}
//달력 출력(최소 이번달)
//이전달, 다음달,이전해 ,다음해 ,특정 연월입력시  /해당연월 달력 출력
//문자열>연월형태의 포멧ㅌ로 변경

//URL분석(String classs사용)
//String str = Url
//1. 프로토콜(gttps: 앞에는 프로토콜)
//2. 도메인 search.naver.com
//3, 파일네임 search.naver
//4. 뭐리스틀이 Where=nexearch&sm =top_hty
//wher	: nexearch
//sm :: to phty

//현재 위의 문자열은 5쌍의 key,value