package ex2_multi_array;

public class Ex1_multi_array {
	public static void main(String[] args) {
		
		//������ �迭
		//1���� �迭�� 2�� �������� 2���� �迭
		//1���� �迭�� 3�� �������� 3���� �迭

		int[][] test = new int[2][3];
		
		test[0][0] = 10;
		test[0][1] = 20;
		test[0][2] = 30;
		
		test[1][0] = 40;
		test[1][1] = 50;
		test[1][2] = 60;
		
		System.out.println(test[1][1]);
		
		System.out.println("--------------------------------------");
		
		//2���� �迭�� ��� ������ ȭ�鿡 �������
		
		for(int i = 0; i < test.length; i++) 
		{
			for(int j = 0; j < test[i].length; j++) {
				
				System.out.print(test[i][j]+ " ");
				
			}//inner
			
			System.out.println();
		}//outer
		
		
		
	}//main

}
