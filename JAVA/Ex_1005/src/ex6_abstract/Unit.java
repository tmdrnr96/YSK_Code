package ex6_abstract;

public abstract class Unit {

	//추상메서드를 하나라도 가지고 있다면 클래스에도 abstract를 추가해줘야한다.
	//부모쪽에서는 사용하지 않지만 자식 클래스에서는 언젠가는 써먹을 수 있을 것 같으면 추상을 사용한다.
	String name;
	int energy;
	boolean fly;
	
	//유닛을 공격을 당하면 해당 메서드를 호출하도록 하자!
	//단, 종족별로 피격시 에너지 감소량이 다를 수 있으므로 추상으로 정의!
	abstract public void decEnergy();
	
	public int getEnergy() {
		return energy;
	}
	
}
