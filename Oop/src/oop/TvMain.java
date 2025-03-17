package oop;

public class TvMain {
	public static void main(String[] args) {
//		String string = "ABCD";
		Tv tv1 = new Tv();//클레스 이름을 통해 생성/new Tv() /인스턴스//맨앞에는 클래스 타입, 변수명 ,인스턴스 
		Tv tv2 = new Tv();//인스턴스 하나임
//		int i = 10;
//		int j = i;
		
//		i = 20;
//		
//		System.out.println(i);
//		System.out.println(j);
		
		
//		System.out.printf("%s,%d,%d\n", tv1.power, tv1.channel,tv1.volume);
//		System.out.printf("%s,%d,%d\n", tv2.power, tv2.channel,tv2.volume);
		
		//. = '~의' 라고 이해 
		//tv1의 전원 킴  //직접 접근
//		tv1.power = true;
		tv1.power();
		
		//tv1의 채널을 10으로 지정
		tv1.channelUP();
		tv1.channelUP();
		tv1.channelDown();
		//tv1의 볼륨을 20으로 지정 +5
		tv1.volumeUp();
		tv1.volumeUp();
		tv1.volumeUp();
		tv1.volumeUp();
		tv1.volumeUp();
		
		
		
		tv1.setInch(120);
		Tv.setInch(100);
		
		System.out.printf("%s,%d,%d,%d\n", tv1.power, tv1.channel,tv1.volume,tv1.inch);
//		System.out.println( tv1.power + "," + tv1.channel +","+ tv1.volume +"," + tv1.inch);
		
		
		System.out.printf("%s,%d,%d,%d\n", tv2.power, tv2.channel,tv2.volume, tv2.inch);
		
		
		Tv tv3 = new Tv();
		System.out.println(tv3.inch);
		
		System.out.println(Tv.inch);
		//데시말(정수 10진수)// Oct( 8과 관련된거)ar number =8진수
		//4분의 1이 쿼트/
		//모노/1이다. /ex)모노폴리 /독점 
		//x : 16진수 ,, d:10진수
	}
}
