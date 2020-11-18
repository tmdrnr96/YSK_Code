package ex6_daemon;

public class DaemonTest implements Runnable{

	@Override
	public void run() {
	
		while(true) {
			
			try {
				Thread.sleep(3000);
				System.out.println("자동 저장 중...");
				
			} catch (InterruptedException e) {
				e.printStackTrace();
				
			}
			
		}//while
		
	}//run

}
