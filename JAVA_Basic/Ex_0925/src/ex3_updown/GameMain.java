package ex3_updown;

import java.util.Scanner;

public class GameMain {
	public static void main(String[] args) {
		//�����̶�� �����Ǵ� ���� Ű���忡�� �Է¹޾�
		//GameClass�� check()�޼��忡�� �����ش�.
		//����ó���� �Ϸ�Ǹ� ���� Ŭ������ ���� �ݺ����� 
		//while���� ������������ �Ͻÿ�

		//���� : 25
		//DOWN!
		//���� : 10
		//UP!
		//���� : 17
		//3ȸ���� ����!!

		Scanner sc = new Scanner(System.in);		
		GameClass game = new GameClass();

		while(true) {
			System.out.print("���� : ");
			int n = sc.nextInt();

			boolean b = game.check(n);

			if(b) {// b == true
				//����ó���� �Ϸ�� ��� while Ż��!
				break;
			}

		}

	}//main

}
