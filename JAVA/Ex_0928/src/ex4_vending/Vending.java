package ex4_vending;

public class Vending {

	private Can[] can = new Can[5];
	private int money;
	
	//자판기에 음료수를 세팅
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
	
	//사용자가 투입한 금액으로 먹을 수 있는 음료 목록 보여주기
	public void showCans (int money) {
		this.money = money;
		
		for(int i = 0; i < can.length; i++ ) {
			
			if(can[i].getPrice() <= money) {
				System.out.printf("%s-%d원\n",can[i].getName(),can[i].getPrice());
			}//if
			
		}//for
			
	}//showCans
	
	
	//사용자가 선택한 음료를 제공하고 잔액을 돌려주는 기능
	public void outCan(String name) {
		
		for(int i = 0; i < can.length; i++) {
			if(can[i].getName().equalsIgnoreCase(name)) {
				System.out.printf("%s선택함\n", name);
				System.out.printf("잔액 : %d", money - can[i].getPrice());
			}//if
		}//for
		
	}//outCan
	
}
