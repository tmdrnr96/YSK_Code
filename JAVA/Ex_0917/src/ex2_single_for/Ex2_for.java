package ex2_single_for;

import java.util.Scanner;

public class Ex2_for {
	public static void main(String[] args) {

		//Ű���忡�� ������ �Է¹޾�
		//�Է¹��� ���ڿ� �ش�Ǵ� �������� �������!!

		//�� : 10
		//2 ~ 9������ ���� �Է��ϼ���

		//�� : 5
		//5 * 1 = 5
		//5 * 2 = 10
		//...
		//5 * 9 = 45

		Scanner sc = new Scanner(System.in);
		System.out.print("�� : ");
		int dan = sc.nextInt();

		if(dan < 2 || dan > 9 ) {
			System.out.println("2 ~ 9������ ���� �Է��ϼ���");
		}else {
			//������
			for(int i = 1; i <= 9; i++) {
				System.out.printf("%d * %d = %d\n", dan, i, dan*i);
			}//for
		}//if

		System.out.println("----------------------------");
		
		if(dan >= 2 && dan <= 9 ) {
			for(int i = 1; i <= 9; i++) {
				System.out.printf("%d * %d = %d\n", dan, i, dan*i);
			}//for
		}else {
			System.out.println("2 ~ 9������ ���� �Է��ϼ���");
		}
		
	}//main

}














