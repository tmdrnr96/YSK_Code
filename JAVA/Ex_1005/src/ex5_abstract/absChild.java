package ex5_abstract;

public class absChild extends absParent{

	//추상클래스를 상속받은 자식클래스는
	//부모가 가진 추상메서드를 반드시 오버라이딩 해야한다.
	//추상클래스를 상속받는 자식은 부모의 미완성 메서드를 완성시키도록 조건부 상속
	
	@Override
	public void setValue(int n) {
		value = n;//부모클래스가 value를 가지고 있기 때문에 가능함..
		
		
	}

}
