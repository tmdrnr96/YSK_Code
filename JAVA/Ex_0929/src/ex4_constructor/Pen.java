package ex4_constructor;

public class Pen {

	private String color;
	private int price;

	//��������� �ʱ�ȭ..
	//��ü�� ������ ��(�����ڰ� ������� ��), ���� ���� ȣ��Ǵ� �����̱� ������ 
	//�����ڿ��� �ʱ�ȭ�ϴ� ���� �ӵ������� �� �̵��̴�.

	//��ü������ �⺻�����ڴ� �����ִ� ���·� �ڵ����� �����ȴ�.
	//������ ������ �����ε� �ߴٸ�, �⺻�����ڸ� ������. ����
	//�⺻�����ڸ� ����Ѵٸ� ��������� �⺻�����ڸ� ����� ����Ѵ�.
	
	//PenŬ���� ������!
	public Pen() {
		color = "black";
		price = 300;
	}//Pen �⺻ ������

	//������ �����ε�(����������, Setteró�� ����� �� �ִ�.(�ٸ��� : �� �ѹ��� ȣ��ȴ�.))
	public Pen(String color, int price) {
		this.color = color;
		this.price = price;
	}


	public String getColor() {
		return color;
	}

	public int getPrice() {
		return price;
	}



}
