package ex2_single_for;

import java.util.Scanner;

public class Ex3_for {
	public static void main(String[] args) {

		//Ű����� ������ �Է¹޴´�.
		//1���� �Է¹��� �������� ���� ����Ͽ� ���
		//���� ��� 5�� �Է¹޾Ҵٸ� 1 + 2 + 3 + 4 + 5�� 15�� ����ؾ��Ѵ�.
		
		int n = 0;
		int sum = 0;//������� ����� ����
				
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			sum+=i;
		}
		System.out.println("��� : " + sum);
		
		System.out.println("-------------------------------------");
		
		
		
	}//main
}
