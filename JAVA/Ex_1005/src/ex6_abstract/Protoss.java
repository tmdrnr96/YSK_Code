package ex6_abstract;

public class Protoss extends Unit{
	//�θ� ������ �ִ� �߻�޼��带 �������̵�(������)�� ������Ѵ�.

	//��ü�� ������ �� �Ǽ��� ���Դ� ���� ������ �ϱ� ���� �����ڿ� �Ķ���͸� �־��ش�.
	public Protoss(String name, int energy, boolean fly) {
		super.name = name;
		super.energy = energy;
		super.fly = fly;
	}
	
	@Override
	public void decEnergy() {
		energy-=1;

	}


}
