package ex6_abstract;

public class Terran extends Unit{

	//�θ� ������ �ִ� �߻�޼��带 �������̵�(������)�� ������Ѵ�.
	
	//��ü�� ������ �� �Ǽ��� ���Դ� ���� ������ �ϱ� ���� �����ڿ� �Ķ���͸� �־��ش�.
	public Terran(String name, int energy, boolean fly) {
		super.name = name;
		super.energy = energy;
		super.fly = fly;
	}
	
	@Override
	public void decEnergy() {
		energy-=3;
		
	}

	
}
