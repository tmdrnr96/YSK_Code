package ex1_interface;

public class TestChild implements TestInter{
	//인터페이스는 상속(extends)이 아닌 구현(implements)라고 한다.

	//메모리 표현방법은 상속과 똑같다고 생각하자!
	//(TestChild 객체 생성시에 TestInter가 먼저 생성되고 TestChild가 생성! )
	
	//인터페이스를 '구현'하려면 implements키워드를 사용한다!
	//구현한 인터페이스의 추상메서드를 반드시 오버라이딩을 해둬야한다.
	
	//인터페이스도 상속과 마찬가지로 오버라이딩을 해줘야한다.
	@Override
	public int getValeu() {
		// 인터페이스의 상수는 값을 바꿀 수 없다.
		return VALUE;
	}
	
	
	
}
