package ex6_abstract;

public abstract class Unit {

	//�߻�޼��带 �ϳ��� ������ �ִٸ� Ŭ�������� abstract�� �߰�������Ѵ�.
	//�θ��ʿ����� ������� ������ �ڽ� Ŭ���������� �������� ����� �� ���� �� ������ �߻��� ����Ѵ�.
	String name;
	int energy;
	boolean fly;
	
	//������ ������ ���ϸ� �ش� �޼��带 ȣ���ϵ��� ����!
	//��, �������� �ǰݽ� ������ ���ҷ��� �ٸ� �� �����Ƿ� �߻����� ����!
	abstract public void decEnergy();
	
	public int getEnergy() {
		return energy;
	}
	
}
