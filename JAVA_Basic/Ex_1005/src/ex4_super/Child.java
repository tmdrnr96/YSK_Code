package ex4_super;

public class Child extends Parent{

	//super : �θ�Ŭ���� �� ��ü!
	
	public Child() {
		super(10); //Parent()
		//�ڽĻ����ڸ� ������ ��, ���� �������� ������ super(�θ�Ŭ����)�� �ڵ������� ����!(�θ� �⺻������ �� ��!)
		//�θ� Ŭ������ �Ķ���͸� �䱸�� �ÿ� super�� �Ķ���͸� �־����� ������ �ڽ� �����ڸ� ���� �� ����.
		
		//�θ�Ŭ������ super�� �ݵ�� �ڽĻ����� ���� �θ�����ڰ� ���� �����Ǿ���Ѵ�. 
		//�ڽ� �����ڰ� �����Ǳ� ���� ���� �ֻ�ܿ� �ݵ�� super�� ���� �����Ǿ�� �Ѵ�.
		System.out.println("�ڽ�Ŭ���� ������");
	}
	
	@Override
	public int getResult(int n1, int n2) {
		
		//super.getResult(n1, n2);//�θ�Ŭ������ �ִ� getResult() �޼��带 ���Ѵ�.
		//������ ���� ���� �ڵ� ������ �ӽ�������  �θ�Ŭ������ �ִ� getResult() �޼��带 ȣ����..
		return n1 + n2;
	}
	
//	int num; �ڽ����� num�� �������� ���� �θ�Ŭ�������� num�� ����
	public void setNum(int num) {
		//super.num : �θ�Ŭ������ num����
		super.num = num;
		//�θ����� ����� num�� ���� �����ϱ� ����..
	}
	
}
