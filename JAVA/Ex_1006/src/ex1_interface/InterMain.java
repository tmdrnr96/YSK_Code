package ex1_interface;

public class InterMain {
	public static void main(String[] args) {

		//�������̽��� �߻�Ŭ������ ���������� �޸𸮻� ������ �� ����
		//������ ���� ����� �� �ִ�...
//		TestInter t = new TestInter() {
//			@Override
//			public int getValeu() {
//				// TODO Auto-generated method stub
//				return 0;
//			}
//		};
//		t.getValeu();
		
		//-----------------------------------------------------------------
		
		TestChild tc = new TestChild();
		//�߻�޼���� �ڽ��� �������� �޼��带 ����Ѵ�.
		System.out.println(tc.getValeu());
		
		
	}//main
}
