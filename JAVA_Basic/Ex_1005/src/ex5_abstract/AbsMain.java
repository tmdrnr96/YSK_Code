package ex5_abstract;

public class AbsMain {
	public static void main(String[] args) {

		absChild ac = new absChild();
		//자식 생성자가 만들어질 때, 부모생성자는 자동으로 생성된다.
		ac.setValue(10);
		
		
		//추상클래스는 객체생성시 인스턴스를 직접적으로 가질 수 없다.
		//추상클래스와 인터페이스 쪽에는 직접적으로 호출하지 않는다.(객체화 하지 않는다.(할 수 없다.))
		absParent ap = new absParent() {
			
			@Override
			public void setValue(int n) {
			
				
			}
		};
		
		
	}//main
}
