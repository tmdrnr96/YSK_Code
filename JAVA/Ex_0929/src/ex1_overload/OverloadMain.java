package ex1_overload;

public class OverloadMain {
	public static void main(String[] args) {

		OverloadTest ot = new OverloadTest();		
		ot.getResult();
		ot.getResult(100);
		ot.getResult('A');
		ot.getResult("ABC");
		ot.getResult(10, "�ȳ�");
		ot.getResult("�ȳ�", 10);
		
		System.out.println();//�����ε带 �̿��� �޼���..
	}//main
}
