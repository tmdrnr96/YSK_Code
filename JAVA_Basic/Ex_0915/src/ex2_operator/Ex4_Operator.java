package ex2_operator;

public class Ex4_Operator {
	public static void main(String[] args) {

		//��Ʈ������
		//�������ڿ� ���������� bit����(2����)�� ���길 �����ϴ�.
		//�Ϲ������� ����Ʈ�����ڿ� �Բ� ��ȣȭ, ��ȣȭ �۾��� ���Ǵ� ��찡 ����.
		//��ȣȭ, ��ȣȭ(���� ���·� �������� ��)
		int a = 10;  //1010
		int b = 7;   //0111
		int c =a & b;//0010
		//����(and) : 2������ ��ȯ �� �� ���� ���  1�� ���� 1, �������� 0
		System.out.println("���� : " + c);
		
		c = a | b; //1111
		//����(or) : 2������ ��ȯ�� �� ���� 0�� ���� 0, �������� 1
		System.out.println("���� : " + c);
		
		c = a ^ b;
		//��Ÿ��or : 2������ ��ȯ�� ���� ������ 0, �ٸ��� 1
		System.out.println("xor(��Ÿ�� or) : " + c);
		
		System.out.println("--------------------------------------");
		
		//����Ʈ ������
		//2���� ������ ������ �����ϵ�, �������̳� �������� �̵��� ���� ��ȭ�� �ش�.
		int n = 12;//1100
		int res = n >> 2;
		System.out.println("res : " + res);
		
		char ch = 'F';//1000110
		char ch_res = (char)(ch >> 1);
		
		System.out.println("ch_res : " + ch_res);
		
	}//main
}












