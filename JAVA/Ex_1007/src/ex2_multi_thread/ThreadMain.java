package ex2_multi_thread;

public class ThreadMain {
	public static void main(String[] args) {

		Thread01 t1 = new Thread01();
		Thread02 t2 = new Thread02();
		Thread03 t3 = new Thread03();
		
		
		//인접한 위치(아래와 같이 비슷한 위치)에서 다수의 스레드를 실행하면 어떤 스레드가 먼저
		//동작할지, 어떤스레드가 먼저 마무리될 지 절대로 알 수 없다..
		//비슷한 순서로, 위치에서 시작을 하면 어떤것이 스레드가 먼저 끝날지 아무도 모른다..

		t1.start(); // * run()메서드를 백그라운드로 돌릴수 있다.
		t2.start();	// Thread는 run()를 직접적으로 호출하지 않는다.
		t3.start(); // 반드시 start()메서드를 통해 run()를 호출한다.
		
		//멀티스레드는 독립적으로 실행되지만 완전히 따로따로 동작하지 않는다.
		//(번갈아가면서 실행하되, 그 순서는 정해져 있지 않다.)
		
		
		
	}//main
}
