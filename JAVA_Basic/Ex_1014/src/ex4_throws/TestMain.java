package ex4_throws;

public class TestMain {
	public static void main(String[] args) {

	 Ex1_Throws e1 = new Ex1_Throws();
	 Ex2_Throws e2 = new Ex2_Throws();

	 //�� Ŭ���� ���� ���� ������ ���� ���� try/catch�� �� �ٿ� �ѹ��� ó��!!
	 //Throws�� �޼��忡 ���� ������ run()������ ���� ����.
	 try {
		e1.info();
		e2.Info();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}//main
}
