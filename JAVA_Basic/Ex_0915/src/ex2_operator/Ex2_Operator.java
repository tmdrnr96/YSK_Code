package ex2_operator;

public class Ex2_Operator {
	public static void main(String[] args) {

		//���Կ�����
		//Ư������ ������ �����Ͽ� ����ų �� ����ϴ� ������
		int n1 = 10;
		int n2 = 7;
		n1 += n2; // n1 = n1 + n2;
		System.out.println("'+=' ���� : " + n1);
		
		n1 -= 2;//n1 = n1 - 2; (17 - 2)
		System.out.println("'-=' ���� : " + n1);
		
		n1 /= 3;//n1 = n1 / 3;
		System.out.println("'/=' ���� : " + n1);
		
		n1 %= 2;
		System.out.println("'%=' ���� : " + n1);
		
		System.out.println("-------------------------------------------");
		
		//�񱳿�����
		//������ ���� ���Ͽ� ���� ������ �Ǵ��ϴ� ������
		//����� �ݵ�� boolean�������� ��ȯ�ȴ�.
		int i1 = 10;
		int i2 = 20;
		//�񱳿����� �ε��� ������ �������� �۴ٿ� ũ�ٸ� �����Ѵ�.( < (lt): �۴�, > (gt): ũ��)
		boolean res = i1 > i2;
		System.out.println("i1 > i2 : " + res);
		
		res = i1 <= i2;
		System.out.println("i1 <= i2 : " + res);

		res = i1 == i2;
		System.out.println("i1 == i2 : " + res);
		
		res = i1 != i2;//(java���� !�� NOT�� �ǹ̸� ������.)
		System.out.println("i1 != i2 : " + res);
		
	}//main
}
