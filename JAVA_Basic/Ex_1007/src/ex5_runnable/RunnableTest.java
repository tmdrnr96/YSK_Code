package ex5_runnable;


public class RunnableTest implements Runnable {

	//Runnable : Thread�� ����ؾ��ϴµ� �̹� extends(���)�� �Ǿ��ִ� ��Ȳ����
	//            extends�� �ι� ����� �� ���� ������ �׶��� implements�� �̿��Ѵ�.
//				���� Runnable�̶�� �������̽����� start()�� ����.

	@Override
	public void run() {
		for(int i = 0; i < 10; i++) 
			try {
				Thread.sleep(1000);
				System.out.println(i);

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}


