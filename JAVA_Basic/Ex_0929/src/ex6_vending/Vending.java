package ex6_vending;

public class Vending {

	private Can[] can = new Can[5];
	private int money;
	
	//���Ǳ⿡ ������� ����(������)
	public Vending() {
		
			can[0] = new Can("fanta", 1000);
			can[1] = new Can("cider", 1200);
			can[2] = new Can("orange", 1400);
			can[3] = new Can("banana", 1500);
			can[4] = new Can("coke", 1600);
			
	}//init
	
	//����ڰ� ������ �ݾ����� ���� �� �ִ� ���� ��� �����ֱ�
	public void showCans (int money) {
		this.money = money;
		
		for(int i = 0; i < can.length; i++ ) {
			
			if(can[i].getPrice() <= money) {
				System.out.printf("%s-%d��\n",can[i].getName(),can[i].getPrice());
			}//if
			
		}//for
			
	}//showCans
	
	
	//����ڰ� ������ ���Ḧ �����ϰ� �ܾ��� �����ִ� ���
	public void outCan(String name) {
		
		for(int i = 0; i < can.length; i++) {
			if(can[i].getName().equalsIgnoreCase(name)) {
				System.out.printf("%s������\n", name);
				System.out.printf("�ܾ� : %d", money - can[i].getPrice());
			}//if
		}//for
		
	}//outCan
	
}
