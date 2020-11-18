package ex2_generic;

public class GenTest<T> {
	
	//제너릭(Generic) 프로그래밍이란?
	//일반적인 코드를 작성하되, 이 코드를 다양한 타입의 객체로써 재활용이
	//가능하도록하는 개념!
	
	T value;
	
	public void setValue(T value) {
		this.value = value;
	}

	public T getValue() {
		return value;
	}
	
	
	
}
