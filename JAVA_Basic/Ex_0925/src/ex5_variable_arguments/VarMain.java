package ex5_variable_arguments;

public class VarMain {
	public static void main(String[] args) {
		
		//파라미터를 몇개를 보내든 상관없다.
		VarTest vt = new VarTest();
		vt.test(10);
		vt.test(100, 200);
		vt.test(1000, 2000, 3000);
	}//main
}
