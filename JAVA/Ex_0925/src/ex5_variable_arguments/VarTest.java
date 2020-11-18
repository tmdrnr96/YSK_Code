package ex5_variable_arguments;

public class VarTest {

	public void test(int... n1) {
		
		//variableArguments타입 : 같은 타입의 파라미터를 갯수에 상관없이
		//배열로 만들어 저장해주는 개념
		
		int[] arr = n1;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}//for
		
		System.out.println("\n----------------------");
	}
}
