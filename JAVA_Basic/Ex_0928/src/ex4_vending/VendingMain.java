package ex4_vending;

import java.util.Scanner;

public class VendingMain {
	//����� ����
	public static void main(String[] args) {
		//���Ǳ� ����
		Vending v = new Vending();
		//init �޼��带 ���� ���Ǳ⿡ ����� ����
		v.init();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("insert coin : ");
		int money = sc.nextInt();
		
		v.showCans(money);

		//Ű���忡�� ���� ����� ����
		System.out.print("���� ���� : ");
		String select = sc.next();
		
		v.outCan(select);
	}//main
}
