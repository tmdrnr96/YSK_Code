package ex4_method;

public class MethodMain {
	public static void main(String[] args) {

		int[] arr = {1, 2, 3};

		MethodTest mt = new MethodTest();	
		//�ּҰ��� �Ѱ��ְ� ������ arr[0]�� 5�� �ȴ�. 
		//���� ����� 5,2,3�� ������ �ȴ�.
		mt.test(arr);

		System.out.println("main���� �����");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] +" ");
		}

		System.out.println("\n------------------");
	}//main
}
