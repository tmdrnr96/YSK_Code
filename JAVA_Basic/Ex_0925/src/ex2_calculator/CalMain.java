package ex2_calculator;

import java.util.Scanner;

public class CalMain {
	public static void main(String[] args) {
		
		//��1 : 5
		//��2 : 10
		//������ : +
		//��� : 15
		
		//MainŬ���������� ��1, ��2, �����ڸ� �Է¹޴� �۾� ��
		//��� ����� CalŬ�������� �Ѵ�.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��1 :");
		int su1 = sc.nextInt();
		
		System.out.print("��2 : ");
		int su2 = sc.nextInt();
		
		System.out.print("������ : ");
		String op = sc.next();
		
		Cal c = new Cal();
		
		c.getResult(su1, su2, op);
		

	}//main

}
