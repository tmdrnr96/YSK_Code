package ex2_overload;

public class Bread {

	public void makeBread() {
		System.out.println("���� ��������ϴ�.");
	}

	public void makeBread(int n) {
		for(int i = 0; i < n; i++) {
			System.out.println("���� ��������ϴ�.");
		}//for
		System.out.printf("��û�Ͻ� ���� %d�� ��������ϴ�.\n",n);
	}
	
	public void makeBread(String s, int n) {
		for(int i = 0; i < n; i++) {
			System.out.println( s + "��(��) ��������ϴ�.");
		}//for
		System.out.printf("��û�Ͻ� %s��(��) %d�� ��������ϴ�.\n",s,n);
	}

	
}
