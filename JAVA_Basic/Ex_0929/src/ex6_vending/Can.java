package ex6_vending;

public class Can {
	//9�� 28�Ͽ�  �ִ� vending ��Ű�� ���ؼ� ����
	private String name;
	private int price;
	
	//�����ڷ� ������� �̸��� ������ �޴´� (setter�� ����)
	public Can(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	//����� �̸��� ������ ������ ���� 
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
