package ex5_account;

import java.util.Scanner;

public class User {
	public static void main(String[] args) {

		ATM atm = new ATM();

		Scanner sc = new Scanner(System.in);

		 outer : while(true) {

			System.out.println("1. ��    ��");
			System.out.println("2. ��    ��");
			System.out.println("3. ��    ��");
			System.out.println("etc. ����");
			System.out.print(">> ");

			int select = sc.nextInt(); //�޴�����

			switch(select) {

			case 1: //�Ա�
				System.out.print("�Ա� �ݾ� : ");
				int money = sc.nextInt();
				atm.in_money(money);
				break;

			case 2: //���
				System.out.print("��� �ݾ� : ");
				money = sc.nextInt();
				atm.out_money(money);
				break;

			case 3: //�ܾ�
				atm.moneyCheck();
				break;

			default://����
				System.out.println("ATM ����� �����մϴ�.");
				break outer;
			}

		}

	}//main
}
