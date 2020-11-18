package ex6_daemon;

public class DaemonMain {
	public static void main(String[] args) {

		//����(Daemon)������
		//���󽺷���� ���ν������� �۾��� ���� �������� ������ �����ϱ� ���� �������.
		//���󽺷��带 ȣ����(����(start)��Ų) �����尡 ����Ǹ�, ���󽺷��嵵 �Բ� ����ȴ�.
		
		DaemonTest r = new DaemonTest();
		Thread t = new Thread(r);
		t.setDaemon(true);
		t.start();
		
		for(int i = 0; i < 20; i++) {
			try {
				Thread.sleep(1000);
				System.out.println("���� ��..." + i);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		System.out.println("���α׷� ����!");
		
		
		
	}//main
}
