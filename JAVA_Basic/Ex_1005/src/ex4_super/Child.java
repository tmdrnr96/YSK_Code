package ex4_super;

public class Child extends Parent{

	//super : 부모클래스 그 자체!
	
	public Child() {
		super(10); //Parent()
		//자식생성자를 생성할 때, 눈에 보이지는 않지만 super(부모클래스)가 자동적으로 생성!(부모가 기본생성자 일 때!)
		//부모 클래스가 파라미터를 요구할 시에 super에 파라미터를 넣어주지 않으면 자식 생성자를 만들 수 없다.
		
		//부모클래스인 super는 반드시 자식생성자 보다 부모생성자가 먼저 생성되어야한다. 
		//자식 생성자가 생성되기 전에 가장 최상단에 반드시 super가 먼저 생성되어야 한다.
		System.out.println("자식클래스 생성자");
	}
	
	@Override
	public int getResult(int n1, int n2) {
		
		//super.getResult(n1, n2);//부모클래스에 있는 getResult() 메서드를 뜻한다.
		//오류를 막기 위에 자동 생성시 임시적으로  부모클래스에 있는 getResult() 메서드를 호출함..
		return n1 + n2;
	}
	
//	int num; 자식한테 num을 선언하지 말고 부모클래스에서 num을 선언
	public void setNum(int num) {
		//super.num : 부모클래스의 num변수
		super.num = num;
		//부모한테 선언된 num에 값을 전달하기 위함..
	}
	
}
