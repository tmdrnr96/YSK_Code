package ex1_interface;

public class TestChild implements TestInter{
	//�������̽��� ���(extends)�� �ƴ� ����(implements)��� �Ѵ�.

	//�޸� ǥ������� ��Ӱ� �Ȱ��ٰ� ��������!
	//(TestChild ��ü �����ÿ� TestInter�� ���� �����ǰ� TestChild�� ����! )
	
	//�������̽��� '����'�Ϸ��� implementsŰ���带 ����Ѵ�!
	//������ �������̽��� �߻�޼��带 �ݵ�� �������̵��� �ص־��Ѵ�.
	
	//�������̽��� ��Ӱ� ���������� �������̵��� ������Ѵ�.
	@Override
	public int getValeu() {
		// �������̽��� ����� ���� �ٲ� �� ����.
		return VALUE;
	}
	
	
	
}
