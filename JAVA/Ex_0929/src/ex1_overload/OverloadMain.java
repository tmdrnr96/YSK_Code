package ex1_overload;

public class OverloadMain {
	public static void main(String[] args) {

		OverloadTest ot = new OverloadTest();		
		ot.getResult();
		ot.getResult(100);
		ot.getResult('A');
		ot.getResult("ABC");
		ot.getResult(10, "안녕");
		ot.getResult("안녕", 10);
		
		System.out.println();//오버로드를 이용한 메서드..
	}//main
}
