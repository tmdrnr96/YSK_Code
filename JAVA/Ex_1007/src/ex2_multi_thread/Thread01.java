package ex2_multi_thread;

public class Thread01 extends Thread{
	
	//백그라운드 안에서 작업할 내용을 run메서드에 재정의한다.
	@Override
	public void run() {
		for(int i = 0; i< 100; i++) {
			
			System.out.print("1");
			
		}//for
	}//run
}
