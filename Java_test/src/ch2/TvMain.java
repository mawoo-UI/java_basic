package ch2;

public class TvMain {
	public static void main(String[] args) {
		Tv tv1 = new Tv();
		Tv tv2 = new Tv();
		
		int i = 10;
		int j =20;
		
		
		tv1.powerUp();
		tv1.channelUp();
		tv1.channelDown();
		tv1.volumeUp();
		tv1.volumeDown();
		
		
		
		
		System.out.printf("%s,%d,%d\n", tv1.power, tv1.channel,tv1.volume);
		System.out.printf("%s,%d,%d\n", tv2.power, tv2.channel,tv2.volume);
	}
}
