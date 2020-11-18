package ex6_abstract;

public class Protoss extends Unit{
	//부모가 가지고 있는 추상메서드를 오버라이딩(재정의)을 해줘야한다.

	//객체를 생성할 때 실수를 빼먹는 일이 없도록 하기 위해 생성자에 파라미터를 넣어준다.
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
