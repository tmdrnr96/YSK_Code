package ex2_multi_thread;

public class Thread01 extends Thread{
	
	//��׶��� �ȿ��� �۾��� ������ run�޼��忡 �������Ѵ�.
	@Override
	public void run() {
		for(int i = 0; i< 100; i++) {
			
			System.out.print("1");
			
		}//for
	}//run
}
