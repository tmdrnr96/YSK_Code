package ex2_inheritance;

public class Snake extends Animal {

	String special = "���� ���";
	
//	public int getSnakeLeg() {
//		return 0;
//	}
	
	//�޼����� �������̵�
	//'�޼����� ������' �� �ǹ̸� ������, ��Ӱ����� ��ü����
	//�ڽ��� �θ��� �޼��带 ��������, ������ �ڽ� ������ �°� ������ �ؼ� �� �� �ֵ��� �� ��!
	//(��Ʈ�� + shift)
	
	//�θ� ������� ������� �����ϰ� �ȿ� �ִ� ���븸 �ٲٴ� ��! 
	@Override
	public int getLeg() {
		return 0;
	}
	
}
