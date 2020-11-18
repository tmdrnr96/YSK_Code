package ex1_overload;

public class OverloadTest {
	//오버로드, 오버로딩
	/*
	 메서드의 오버로딩
	 오버로딩은 메서드의 '중복정의'라고 하며, 하나의 클래스 내에서 같은 이름을 가진
	 메서드가 여러개 정의되는 상황을 말한다.
	 
	 @오버로딩의 규칙
	 1) 오버로딩을 위한 메서드명은 대소문자를 비롯하여 반드시 똑같이 만든다.
	 2) 파라미터의 갯수가 달라야 한다.(파라미터의 갯수가 달라야 오버로드로 인정!)
	 3) 파라미터의 갯수가 같을 경우, 타입이 달라야 오버로드로 인정!
	 4) 파라미터의 갯수와 타입이 같아도 순서가 다르면 어버로딩으로 인정!
	 
	 */
	public void getResult() {
		System.out.println("인자가 없는 메서드");
	}//getResult()

	//메서드는 대소문자도 구분한다.
	public void getResult(int n) {
		System.out.println("정수를 인자로 받는 메서드");
	}//getResult(int n)
	
	public void getResult(char n) {
		System.out.println("문자를 인자로 받는 메서드");
	}//getResult(char n)
	
	public void getResult(String str) {
		System.out.println("문장을 인자로 받는 메서드");
	}//getResult(String str)
	
	public void getResult(int num, String s) {
		System.out.println("정수, 문장을 인자로 받는 메서드");
	}//getResult(int num, String s)
	
	public void getResult(String s, int n) {
		System.out.println("문장, 정수를 인자로 받는 메서드");
	}//getResult(String s, int n)
}
