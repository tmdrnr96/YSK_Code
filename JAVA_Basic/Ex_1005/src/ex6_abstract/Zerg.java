package ex6_abstract;

public class Zerg extends Unit{

	public Zerg(String name, int energey, boolean fly) {
		super.name = name;
		super.energy = energey;
		super.fly = fly;
	}
	@Override
	public void decEnergy() {
		energy-=10;
		
	}

}
