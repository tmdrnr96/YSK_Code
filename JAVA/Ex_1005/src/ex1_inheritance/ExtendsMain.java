package ex1_inheritance;

import java.awt.Frame;

public class ExtendsMain {
	public static void main(String[] args) {

		Child c1 = new Child();
		
		//상속관계의 객체에서 자식클래스는 부모가 가진 속성을 마음대로 가져다가 사용할 수 있다.
		//단, 아무리 상속관계의 객체라도 부모가 private으로 지정한 속성에서는 자식도 접근이 불가하다.
//		System.out.println(c1.money); private으로 해놨기 떄문에 사용할 수 없음..
		System.out.println(c1.str);
		System.out.println(c1.car);
		
		//c1이라는 객체가 메모리에 만들어질 때, 상속관계의 객체일 때는 부모클래스의 객체가 
		//먼저 만들어지고 그 영역 안에 자식 클래스가 자리를 잡는다.
		/*	-----Parent-----
		 *  | m : 20억           |
		 *  | s : 신촌            |
		 *  | -- Child---- |
		 *  | |c:쏘나타         ||
		 *  | |           ||
		 * -----------------
	 	부모와 자식객체는 주소값이 같다(인스턴스가 같다 : 부모가 만들어질때 집주소와 자식이 만들어질 때 집주소가 시작하는 위치가 같다.(집주소가 똑같다.))
	 	인스턴트가 같다는 것은 Child는 Parent의 자식이라고 말한 것과 같다.
	 	부모의 속성에 private을 붙이면 그 속성은 상속을 할 수 없다.
		 */
		
		//(객체 instenceof 부모클래스)
		if(c1 instanceof Parent){
			System.out.println("c1과 Parent의 instence가 같다");
		}
		
		System.out.println("--------------------------------");
		
		
		//상속관계의 객체일지라도, 부모클래스는 자식의 속성을 마음대로 가져다가 사용할 수 없다!
		//자식클래스의 객체가 생성될 때, 부모 클래스가 자동으로 같이 생성되는 반면에
		//부모클래스는  생성될 때는  자식객체가 같이 생성되지 않는다 부모객체만 생성된다!
		Parent p1 = new Parent();
		System.out.println(p1.str);
		
		//자바는 단일 상속체계를 따른다..
		//부모클래스는 여러개의 자식을 만들 수 있지만, 부모는 단 하나!
		
		//Object는 모든 객체의 부모!!
		/*
		 * ------Object-------
		 * 	-----Parent----- |
		 *  | m : 20억           | |
		 *  | s : 신촌            | |
		 *  | -- Child---- | |
		 *  | |c:쏘나타         || |
		 *  | |           || |
		 * ----------------- |
		 * -------------------
		 */
		
		
		
	}//main
}
