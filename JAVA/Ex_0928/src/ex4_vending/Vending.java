package ex4_vending;

public class Vending {

	private Can[] can = new Can[5];
	private int money;
	
	//���Ǳ⿡ ������� ����
	public void init() {
		
		for(int i = 0; i < can.length; i++ ) {
			can[i] = new Can();
		}
		
		can[0].setName("fanta");
		can[0].setPrice(1000);
		
		can[1].setName("cider");
		can[1].setPrice(1100);
		
		can[2].setName("orange");
		can[2].setPrice(1200);
		
		can[3].setName("banana");
		can[3].setPrice(1300);
		
		can[4].setName("coka");
		can[4].setPrice(1400);

		
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
