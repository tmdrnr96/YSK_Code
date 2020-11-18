package ex3_thread_sleep;

public class ThreadTest extends Thread{

	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			
			try {
				
				Thread.sleep(1000);//1초 대기
				
				System.out.println("스레드 : " + i);
			} catch (InterruptedException e) {
				//강제를 1초 쉬는 동안 문제가 발생할 수 있기 떄문에... try/catch롬 묶어준다. 
				
				e.printStackTrace();
			}
		}//for
	}//run
}
