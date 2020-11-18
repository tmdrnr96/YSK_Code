package ex3_thread_sleep;

public class SleepMain {
	public static void main(String[] args) {

		ThreadTest t = new ThreadTest();
		
		t.start();
		
		try {
			Thread.sleep(11000);
			System.out.println("메인스레드 종료");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
	}//main
}
