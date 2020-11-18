package ex6_vending;

public class Vending {

	private Can[] can = new Can[5];
	private int money;
	
	//자판기에 음료수를 세팅(생성자)
	public Vending() {
		
			can[0] = new Can("fanta", 1000);
			can[1] = new Can("cider", 1200);
			can[2] = new Can("orange", 1400);
			can[3] = new Can("banana", 1500);
			can[4] = new Can("coke", 1600);
			
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
