package ex1_interface;

public interface TestInter {

	//인터페이스에는 상수와 추상메서드만 정의할 수 있다.(일반메서드는 만들 수 없다.)

	final int VALUE = 10; //상수는 대문자로 쓴다.
	//인터페이스의 상수에는 자료형 앞에 final이 생략되어있다.  
	//value = 20; 인터페이스에는 상수이기 때문에 값을 바꿀 수 없다.
	
	abstract public int getValeu();
	//abstract를 쓰지 않아도 자동으로 붙음..(생략되어있음) (눈에 보이지 않음)
}
