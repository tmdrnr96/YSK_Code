package ex2_multi_array;

public class Ex4_multi_array {
	public static void main(String[] args) {
		
		//2���� �迭 arr�� ��� ��� ���� �հ� ����� ���Ͻÿ�
		int[][] arr = {{1, 2, 3},
					   {6, 13, 55, 16, 7},
					   {20, 21},
					   {11, 14, 7, 11, 9, 20}};
		
		int total = 0;
		int count = 0;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				total+=arr[i][j];
				count++;//�迭�� ���� ��� ���� ����
			}//inner
			
		}//outer
		System.out.println("���� : " + total);
		System.out.println("��� : " + total/(float)count);
		
	}//main

}
