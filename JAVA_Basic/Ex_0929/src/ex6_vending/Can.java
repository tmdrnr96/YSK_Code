package ex6_vending;

public class Can {
	//9월 28일에  있는 vending 패키지 비교해서 참고
	private String name;
	private int price;
	
	//생성자로 음료수의 이름과 가격을 받는다 (setter의 역할)
	public Can(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	//음료수 이름과 가격을 저장할 변수 
	public String getName() {
		return name;
	}
	
//	public void setName(String name) {
//		this.name = name;
//	}
	
	public int getPrice() {
		return price;
	}
	
//	public void setPrice(int price) {
//		this.price = price;
//	}
	
	
}
