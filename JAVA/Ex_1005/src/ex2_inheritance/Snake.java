package ex2_inheritance;

public class Snake extends Animal {

	String special = "혀가 길다";
	
//	public int getSnakeLeg() {
//		return 0;
//	}
	
	//메서드의 오버라이딩
	//'메서드의 재정의' 의 의미를 가지며, 상속관계의 객체에서
	//자식이 부모의 메서드를 가져오되, 내용을 자식 사정에 맞게 재정의 해서 쓸 수 있도록 한 것!
	//(컨트롤 + shift)
	
	//부모가 만들어준 껍데기는 유지하고 안에 있는 내용만 바꾸는 것! 
	@Override
	public int getLeg() {
		return 0;
	}
	
}
