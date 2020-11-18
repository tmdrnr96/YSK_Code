package ex7_static;

public class StaticTest {

	String str1 = "일반 멤버변수";
	static String str2 = "스테틱 변수";

	public static void getString2() {

		//static메서드에서는 일반 변수를 사용할 수 없다.
		//str1 = "안녕";
		str2 = "반가워";

		//static메서드 내부에서는 static지역변수를 생성할 수 없다.
		//static int num = 10;
		int num2 = 10;
	}

	public void getString() {
		//일반메서드에서는 static변수와 일반 변수를 모두 사용할 수 있다.
		str1 = "안녕";
		str2 = "반갑습니다.";

		int num1 = 10;

		//'static'키워드를 가진 지역변수는 일반 메서드에서 사용할 수 없다.
		//static int num2 = 10; 

	}//getString()
	
	
	/*	
	 	일반 메서드 :  static변수와 일반 변수를 모두 사용할 수 있으며, static 변수 선언은 불가하다.
	 	static 메서드 : static 변수만 사용이 가능하고 일변 변수는 사용이 불가하다. 일반 변수는 선언이 가능하나,
	 	static변수는 선어이 불가하다.
	 */




}




