package ex2_interface;

public interface Menu1 extends Menu2, Menu3{
	
	//인터페이스끼리만 상속(extends) 받을 수 있고 나머지는 구현(implements)!
	//인터페이스는 직접적인 구현 능력을 가지고 있지 않기 때문에 자바에서 유일하게 다중상속이 가능하다.
		
	public String jjajang(); 
	public String jjambbong();
	
	
}
