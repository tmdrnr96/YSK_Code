package ex5_account;

public class ATM {

	private int money;

	//�Ա�
	public void in_money(int money) {
		this.money += money;
		System.out.println(money+"����  �ԱݵǾ����ϴ�.");
	}


	//���
	public void out_money(int money) {

		if(this.money > money){
			this.money -= money;
			System.out.println(money+ "���� ��ݵǾ����ϴ�.");
		}else {
			System.out.println("�ܾ��� �����մϴ�.");
		}
	}


	//�ܾ�Ȯ��
	public void moneyCheck() {
		System.out.println("���� �ܾ���" + money +"�� �Դϴ�.");
	}

}
