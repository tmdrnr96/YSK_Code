package ex1_single_thread;

public class ThreadMain {
	public static void main(String[] args) {

		SingleThread t = new SingleThread();
		t.start(); //start() : 스레드의 run()메서드를 백그라운드에서 동작시키기 위한 메서드
		
		System.out.println("main스레드 종료");
		
		
	}//main
}
