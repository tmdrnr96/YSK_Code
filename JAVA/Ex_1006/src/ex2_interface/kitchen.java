package ex2_interface;

public class kitchen implements Menu1{

	@Override
	public String jjajang() {
		return "�߸� + ����";
	}

	@Override
	public String jjambbong() {
		return "ȫ�� + ����....";
	}

	//Menu2 : ���ó�� �޸𸮸� �Ҵ�޴� ���������� �������̽��� ����������
	//���߱����� �����ϴ�.(���߱����� ������ �������̽�!)
	//�������̽��� ����ɷ��� ���� ������ ���߱����� �����ϴ�!!
	@Override
	public String boggembab() {
		return "��õ�� + ¥��ҽ�";
	}

	@Override
	public String tangsuyuck() {
		return "������� ���...";
	}

}
