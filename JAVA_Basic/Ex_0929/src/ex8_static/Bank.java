package ex8_static;

public class Bank {

	//static������ �޼���� ��ü�� �ƹ��� ���� �����ص� �޸𸮻� '�� �Ѱ���' ���������.
	
	private String point; //������ġ
	private String tel; //��ȭ��ȣ
	static float interest; //������ //������ �������� static�� ȣ���Ѵ�... ���� ���..(���� => �ε�ÿ�  �ӵ��� ��������.)
	
	//static���� private�� �� ���� �ʴ´�. => Ŭ����.������ ������ �ϱ� ������.. private���� ����� ���� �Ұ�..

	//������ �����ε�
	public Bank(String point, String tel) {
		this.point = point;
		this.tel = tel;
		interest = 10;
	}

	public void getInfo() {
		System.out.println("���� : " + point);
		System.out.println("��ȭ : " + tel);
		System.out.println("������ : " + interest + "%" );
		System.out.println("--------------------------");
	
	}
	
}





























