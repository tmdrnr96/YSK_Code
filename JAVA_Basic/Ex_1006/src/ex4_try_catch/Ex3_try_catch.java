package ex4_try_catch;

import java.util.Scanner;

public class Ex3_try_catch {
	public static void main(String[] args) {

		//���� : 10
		//��� : 10
		
		//���� : a10
		//������ �Է��ϼ���
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("���� : ");
			int n = sc.nextInt();		
			System.out.println("��� :" + n);
			
		} catch (Exception e) {
			System.out.println("������ �Է��ϼ���");
		}
		
		
		
	}//main
}
