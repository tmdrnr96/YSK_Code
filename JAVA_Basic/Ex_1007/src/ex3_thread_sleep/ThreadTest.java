package ex3_thread_sleep;

public class ThreadTest extends Thread{

	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			
			try {
				
				Thread.sleep(1000);//1�� ���
				
				System.out.println("������ : " + i);
			} catch (InterruptedException e) {
				//������ 1�� ���� ���� ������ �߻��� �� �ֱ� ������... try/catch�� �����ش�. 
				
				e.printStackTrace();
			}
		}//for
	}//run
}
