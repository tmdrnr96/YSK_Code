package ex2_lotto;

import java.util.Random;

public class Ex1_work {
	public static void main(String[] args) {

		//���� money�� 10 ~ 5000�������� ������ �߻����� �ִ´�.

				//��, 3450, 2100...�� ���� 1�� �ڸ� ���ڴ� �ݵ�� 0�� �ǵ��� ����

				// �߻��� ���� money�� �������� �ٲ�����
				//500, 100, 50, 10��¥�� ���� ���� � �Ž��� ������ �Ǵ��ϴ�
				//����(�ڵ�)�� ����
				//
				//��, ������ ���� �������� �������� �Ž��� �־�� �ϸ� coin�迭��
				//�ݵ�� ����� ��.

				//���
				//�ݾ� : 2590 // ����
				//500�� : 5
				//50��: 1
				//10�� : 4
		
		int[] money = {500, 100, 50, 10};
		
		int a = 0;
		
		int n = new Random().nextInt(500)+1;
		n*=10;
		System.out.println("�ݾ� : " + n + "�� ");
		
		for(int i = 0; i < money.length; i++) {
			
			if(n > money[i]) {
				a = n / money[i];
			}//if
			
			System.out.println(money[i] + "�� : " + a  );
			n %= money[i];
		}//for
		
	}//main
}
