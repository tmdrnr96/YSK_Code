package ex4_vending;

import java.util.Scanner;

public class VendingMain {
	//사용자 입장
	public static void main(String[] args) {
		//자판기 셋팅
		Vending v = new Vending();
		//init 메서드를 통해 자판기에 음료수 셋팅
		v.init();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("insert coin : ");
		int money = sc.nextInt();
		
		v.showCans(money);

		//키보드에서 마실 음료수 선택
		System.out.print("음료 선택 : ");
		String select = sc.next();
		
		v.outCan(select);
	}//main
}
