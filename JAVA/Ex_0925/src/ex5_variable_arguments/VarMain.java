package ex5_variable_arguments;

public class VarMain {
	public static void main(String[] args) {
		
		//�Ķ���͸� ��� ������ �������.
		VarTest vt = new VarTest();
		vt.test(10);
		vt.test(100, 200);
		vt.test(1000, 2000, 3000);
	}//main
}
