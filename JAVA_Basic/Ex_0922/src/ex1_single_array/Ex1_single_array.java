package ex1_single_array;

import java.util.Random;

public class Ex1_single_array {
	public static void main(String[] args) {

		//���� money�� 10~ 5000�� ������ ������ �����.
		//��, 3450, 2100�� ���� 1�� �ڸ� ���ڴ� �ݵ�� 0���� �߻��Ǿ�� �Ѵ�.

		//���� money�� �������� �مf�� ��
		// 500, 100, 50, 10��¥�� ������ ���� � �Ž��� ������ �Ǵ��� ��.
		//��, �������� ���� ���� �������� �Ž��� �־�� �Ѵ�.

		//�ݾ� : 2590�� <--����
		//500�� : 5
		//50�� : 1
		//10�� : 4

		int[] coin = {500, 100, 50, 10};

		int n = 0;

		int money = (new Random().nextInt(500)+1)*10;
//		money*=10;
		System.out.println("�ݾ� : " + money);

		for(int i = 0; i < coin.length; i++) {
			
			if(coin[i] <= money) {	
				
				n = money/coin[i];				
				money%=coin[i];
				System.out.println( coin[i] + "�� : "+ n + "��");
			}//if

		}//for

			
		
	}//main












}
