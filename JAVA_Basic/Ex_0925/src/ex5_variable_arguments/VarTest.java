package ex5_variable_arguments;

public class VarTest {

	public void test(int... n1) {
		
		//variableArgumentsŸ�� : ���� Ÿ���� �Ķ���͸� ������ �������
		//�迭�� ����� �������ִ� ����
		
		int[] arr = n1;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}//for
		
		System.out.println("\n----------------------");
	}
}
