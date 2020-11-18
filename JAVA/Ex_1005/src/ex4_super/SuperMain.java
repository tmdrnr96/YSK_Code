package ex4_super;

public class SuperMain {
	public static void main(String[] args) {

		//자식객체가 생성되었을 때 상속받은 부모클래스가 먼저 메모리에 할당받고
		//그 다음에 자식 클래스가 메모리에 할당된다.
		//때문에 자식 생성자를 호출시 부모 생성자가 먼저 생성된다.
		Child ch = new Child();
		
		
		
		
	}//main
}
