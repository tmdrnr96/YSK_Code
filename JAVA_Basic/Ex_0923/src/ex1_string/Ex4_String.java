package ex1_string;

import java.util.Scanner;

public class Ex4_String {
	public static void main(String[] args) {

		//Ű���忡�� �̸����� �Է¹ް� @���� id�� 6�̸� 10�ʰ��� ���
		//������ �ùٸ��� �ʴٴ� �޽��� ����ϱ�

		//���� : abc@naver.com
		//�̸��� ������ �ùٸ��� �ʽ��ϴ�.

		//���� : aabbcc@naver.con
		//aabbcc�� ȯ���մϴ�.

		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		String email = sc.next();

		String id = email.substring(0, email.indexOf('@'));
		int n = id.length();
		
		//�տ� ���ǽ��� ���̸� �ڿ��� ���� ��������...
		//�տ� ���ǽ��� �����̶�� �ڿ� ���� ����...
		if(n < 6 || n > 10 ) {
			System.out.println("�̸��� ������ �ùٸ��� �ʽ��ϴ�.");
		}else {
			System.out.println(id + "�� ȯ���մϴ�.");
		}

		
	}//main

}
