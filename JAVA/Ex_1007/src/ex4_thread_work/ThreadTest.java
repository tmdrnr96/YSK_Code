package ex4_thread_work;

public class ThreadTest extends Thread{

	//생성자로 값을 저장!
//	int n = 0;
//
//	public ThreadTest(int n) {
//		this.n = n;
//
//	}//생성자로 값을 저장!
	
	//setter로 값을 저장!
	private int n;
	
	public void setN(int n) {
		this.n = n;
	}//setter로 값을 저장!

	@Override
	public void run() {
		//메인에서 사용자가 넘겨준 값을 1초 간격으로 감소시키며 출력
		for(int i = n; i >= 0; i--) {
			
			System.out.println(i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}//for

	}//run
}
