package ex1_interface;

public class InterMain {
	public static void main(String[] args) {

		//인터페이스나 추상클래스는 직접적으로 메모리상에 생성할 수 없고
		//참조를 통해 사용할 수 있다...
//		TestInter t = new TestInter() {
//			@Override
//			public int getValeu() {
//				// TODO Auto-generated method stub
//				return 0;
//			}
//		};
//		t.getValeu();
		
		//-----------------------------------------------------------------
		
		TestChild tc = new TestChild();
		//추상메서드는 자식이 재정의한 메서드를 사용한다.
		System.out.println(tc.getValeu());
		
		
	}//main
}
