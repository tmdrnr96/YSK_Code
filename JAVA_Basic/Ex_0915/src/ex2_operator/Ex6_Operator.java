package ex2_operator;

public class Ex6_Operator {
	public static void main(String[] args) {

		//����(����) ������
		//�ϳ��� ���ǽ��� �ΰ� ������ ���� ���� ������ ���� ����� ��� �������� �� �ֵ��� �ϴ� ������
		//���ǽ� : ��, ������ ����� ���� �� �ִ� ��� ����! 
		int a = 10;
		int b = 15;
		
		boolean res = ++a >= b ? true : false;
		System.out.println("++a >= b : " + res );
		
		int i1 = 5;
		int i2 = 10;
		int res2= (i1 += i1) == i2 ? 100 : 200; 
		
		System.out.println("(i1 += i1) == i2 : " + res2);
		
		char gender = '��';
		char res3= gender == '��' ? '��' : '��';
		System.out.println("res3 : " + res3);
		
	}//main
}
