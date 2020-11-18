package ex2_multi_array;

import java.util.Scanner;

public class Ex5_multi_array {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[][] arr; //�������� ũ�⸦ ������ 2���� �迭
		int num = 1;//���� ��
		int size = 0;//�������� ũ��
		
		int y = 0;//��
		int x = 0;//��

		System.out.print("Ȧ�� : " );
		size = sc.nextInt(); //Ű���忡�� ���� ������ �������� ũ�Ⱑ �����ȴ�.
		
		x = size / 2; //������ ����� 1�� �ֱ� ���� �ڵ�
		
		arr = new int[size][size];
		
		while(num <= size * size) {
			
			arr[y][x] = num;
			
			if(num % size == 0){
				
				y++;
			}else {
				y--;
				x++;
			}
			
			if(y < 0) {
				y = size - 1;
			}
			if(x >= size) {
				x = 0;
			}
			num++;
		}//while
		//�������� ���� ������ ����ϱ�
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++){
				System.out.printf("%02d ", arr[i][j]);
			}
			System.out.println();
		}
	}//main

}
