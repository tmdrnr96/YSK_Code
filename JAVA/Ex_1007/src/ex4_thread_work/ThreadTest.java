package ex4_thread_work;

public class ThreadTest extends Thread{

	//�����ڷ� ���� ����!
//	int n = 0;
//
//	public ThreadTest(int n) {
//		this.n = n;
//
//	}//�����ڷ� ���� ����!
	
	//setter�� ���� ����!
	private int n;
	
	public void setN(int n) {
		this.n = n;
	}//setter�� ���� ����!

	@Override
	public void run() {
		//���ο��� ����ڰ� �Ѱ��� ���� 1�� �������� ���ҽ�Ű�� ���
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
