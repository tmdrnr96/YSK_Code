package ex1_overload;

public class OverloadTest {
	//�����ε�, �����ε�
	/*
	 �޼����� �����ε�
	 �����ε��� �޼����� '�ߺ�����'��� �ϸ�, �ϳ��� Ŭ���� ������ ���� �̸��� ����
	 �޼��尡 ������ ���ǵǴ� ��Ȳ�� ���Ѵ�.
	 
	 @�����ε��� ��Ģ
	 1) �����ε��� ���� �޼������ ��ҹ��ڸ� ����Ͽ� �ݵ�� �Ȱ��� �����.
	 2) �Ķ������ ������ �޶�� �Ѵ�.(�Ķ������ ������ �޶�� �����ε�� ����!)
	 3) �Ķ������ ������ ���� ���, Ÿ���� �޶�� �����ε�� ����!
	 4) �Ķ������ ������ Ÿ���� ���Ƶ� ������ �ٸ��� ����ε����� ����!
	 
	 */
	public void getResult() {
		System.out.println("���ڰ� ���� �޼���");
	}//getResult()

	//�޼���� ��ҹ��ڵ� �����Ѵ�.
	public void getResult(int n) {
		System.out.println("������ ���ڷ� �޴� �޼���");
	}//getResult(int n)
	
	public void getResult(char n) {
		System.out.println("���ڸ� ���ڷ� �޴� �޼���");
	}//getResult(char n)
	
	public void getResult(String str) {
		System.out.println("������ ���ڷ� �޴� �޼���");
	}//getResult(String str)
	
	public void getResult(int num, String s) {
		System.out.println("����, ������ ���ڷ� �޴� �޼���");
	}//getResult(int num, String s)
	
	public void getResult(String s, int n) {
		System.out.println("����, ������ ���ڷ� �޴� �޼���");
	}//getResult(String s, int n)
}
