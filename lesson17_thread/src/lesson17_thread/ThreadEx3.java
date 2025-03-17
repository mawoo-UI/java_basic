package lesson17_thread;

public class ThreadEx3 {
<<<<<<< HEAD
	public static void main(String[] args) throws InterruptedException {
//		500500 
		Sum t1 = new Sum();
		Sum t2 = new Sum();
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		System.out.println(t1.sum + t2.sum);
	}
}

class Sum extends Thread {
	int sum;
	public void run() {
		for(int i = 1 ; i <= 1000 ; i++) {
			sum += i;
		}
	}
}
=======
public static void main(String[] args) throws InterruptedException{
	//500500  
	Sum t1 = new Sum();
	Sum t2 = new Sum();

	t1.start();
	t1.start();
	
	t1.join();
	t2.join();
	System.out.println(t1.sum + t2.sum);
	

}
}

class sum extends Thread{
	int sum;
	private void run() {
for(int i = 1; i <= 1000; i++) {
	sum += i;
}
	}
}
>>>>>>> b584507697e52b8b10fa82cc42cffa58f5a0582f
