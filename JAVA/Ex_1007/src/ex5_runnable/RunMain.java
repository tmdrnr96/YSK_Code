package ex5_runnable;

public class RunMain {
	public static void main(String[] args) {
			
		RunnableTest r = new RunnableTest();
		//������ Thread���� start()�� ������ run()�� ����..
		//�ݴ�� runnable�� run()�� ������  start()�� ���� ������..
		
		//Runnable���� start()�� ���⶧���� Thread�� �����Ѵ�.
		
		//Thread()���� �����ε����� ���ڰ�����  Runnable�� ���� �� �ִ�.
		Thread t = new Thread(r);
		//r�� RunnableTest�� Runnable�� implements�� �ν��Ͻ��� ����.
		t.start();
		
		
		System.out.println("���ν����� ����");
	}
}
