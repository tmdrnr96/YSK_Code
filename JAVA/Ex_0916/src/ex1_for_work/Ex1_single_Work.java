package ex1_for_work;

import java.util.Scanner;

public class Ex1_single_Work {
	public static void main(String[] args) {

		//�� :8
		// 8 * 1 = 8
		// 8 * 2 = 16
		//....
		// 8 * 9 = 72

		// 1��, 10�� �̻��� x

		Scanner sc = new Scanner(System.in);
		System.out.print("�� : ");
		int dan = sc.nextInt();

		if(dan > 1 && dan < 10) {

			for(int i = 1; i <= 9; i++) {
				System.out.println(dan + " * " + i + " = " + dan*i);

			}
		}else {
			System.out.println("2��~9�ܱ��� �����մϴ�.");
		}
		System.out.println("------------------------");
		
		//Ű���忡�� ���� n�� ���� �Է¹޴´�.
				//1���� �Է¹��� n������ ���� ����Ͽ� ����� ���.
				//(���� ��� Ű���忡�� 5���Է� �޾Ҵٸ� 1+2+3+4+5�� �����
				//15�� ��µǸ� �ô�.)

				//���� : 5
				//��� : 15
		
		int sum = 0;
		System.out.print("���� : ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++ ) {
			sum+=i;
		}
		System.out.println("��� : " + sum );
		
		System.out.println("------------------------");
		
		//Ű���忡�� ���� n1�� n2�� ���� �Է� �޴´�.
				//n1 ~ n2������ ���� ����Ͽ� ���
				//(���� ��� 2�� 5�� �޾Ҵٸ� 2+3+4+5�� ����� 14�� ���!)

				//��1 : 2
			    //��2 : 5
				//��� : 14
				
				//��1 : 5
				//��2 : 2
				//��� : 14
		
		int su3 = 0;
		int res = 0;
		
		System.out.print("��1: ");
		int su1 = sc.nextInt();
		
		System.out.print("��2: ");
		int su2 = sc.nextInt();
		
		if(su1 > su2) {	
			su3 = su1;
			su1 = su2; 
			su2 = su3;		
		}//if
		
		System.out.println(su1 + "," + su2);
		
		for(int i = su1; i <= su2; i++ ) {
			res+=i;
			
		}//for
		System.out.println("��� : " + res);
	}//main

}
