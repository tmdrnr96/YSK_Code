package ex4_single_array;

public class Ex1_SingleArray {
	public static void main(String[] args) {

		//�迭 : '���� �ڷ��� ���� ��Ƶ� �ϳ��� ����'�̴�.
		//ȿ������ �ڷ� ������ ���� �ݵ�� �ʿ�

		int su1 = 100;
		int su2 = 200;
		int su3 = 300;
		int su4 = 400;

		//�ڿ�(����)�� ���ϰ� �����ϰ� �����ϱ� ���� �迭�� ���
		//1) �迭 ����
		int[] arr; // ���ȣ�� 1���� 1���� �迭, 2���� 2���� �迭...

		//2) �迭 ���� //�迭 ������ �Ϸ��ϸ� ���渶�� �ʱⰪ���� '0'�� �ڵ����� �� �ִ�. 
		arr = new int[4];//arr.length�� index�� ���� ����.

		//ex) �迭�� ����� ������ �ѹ��� �ϱ�!
		//int[] arr = new int[4];

		//3)�迭 �ʱ�ȭ 
		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 300;
		arr[3] = 400;

		//�迭�� �������� ���� �ε����� ���� �߰��ϰų� ������ �� ����.
		//arr[4] = 500; 
		System.out.println(arr[2]);//Ư�� index�� ���� ������ ����� �� �ִ�.
		
		System.out.println("-------------------------------------");
		//for���� ����� �迭 �� ���!
		
		for(int i = 0; i < arr.length; i++ ) {
			arr[i] = (i + 1) * 1000;
			System.out.println(arr[i]);
		}//for


	}//main

}
