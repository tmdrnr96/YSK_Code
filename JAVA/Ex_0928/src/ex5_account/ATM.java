package ex5_account;

public class ATM {

	private int money;

	//입금
	public void in_money(int money) {
		this.money += money;
		System.out.println(money+"원이  입금되었습니다.");
	}


	//출금
	public void out_money(int money) {

		if(this.money > money){
			this.money -= money;
			System.out.println(money+ "원이 출금되었습니다.");
		}else {
			System.out.println("잔액이 부족합니다.");
		}
	}


	//잔액확인
	public void moneyCheck() {
		System.out.println("현재 잔액은" + money +"원 입니다.");
	}

}
