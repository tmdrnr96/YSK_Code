package ex5_abstract;

public abstract class absParent {

	//추상클래스는 추상메서드를 한개 이상 가지고 있는 클래스를 의미한다.
	//추상클래스 역시 abstract키워드를 사용한다.
	
	
	int value = 10;
	String str = "안녕";
	
	//추상메서드
	//추상 메서드는 body가 없다..(중괄호가 없음..(몸체가 없음))
	//추상메서드는 abstract라는 키워드를 통해 생성한다.
	//몸체가 없는 추상메서드는 '미완성의 개념'이라고 하는데,
	//이렇게 미완성된 메서드를 자식이 물려받아 완성시키도록 하는 것이 조건이다.
	
	//부모에서는 쓸일이 없기 때문에 부모 클래스에서 따로 정의 하지 않는다.
	//부모클래스에서는 setValue(추상메서드)를 호출하지 않는다.
	
	abstract public void setValue(int n);
	
}
