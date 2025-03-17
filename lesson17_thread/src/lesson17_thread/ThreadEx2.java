package lesson17_thread;

public class ThreadEx2 {
<<<<<<< HEAD
	int i ;
	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(() -> {
			for(int i = 0 ; i < 10 ; i++) {
				System.out.println(10 - i);
//				try {
////					Thread.sleep(1000);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
=======
	int i;
	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(10 - i);
//				try {
//					Thread.sleep(1000);
//				} catch (InterruptedException e) {
//					// TODO: handle exception
>>>>>>> b584507697e52b8b10fa82cc42cffa58f5a0582f
//					e.printStackTrace();
//				}
			}
			System.out.println("스레드 실행 종료");
		});
		t1.start();
		t1.interrupt();
<<<<<<< HEAD
		Thread.sleep(1000);
		System.out.println("메인 종료");
	}
}
=======
		Thread.sleep(10000);
		t1.interrupt();
		System.out.println("메인 종료");
	}
}
>>>>>>> b584507697e52b8b10fa82cc42cffa58f5a0582f
