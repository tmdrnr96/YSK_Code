package ex2_operator;

public class Ex5_Operator {
	public static void main(String[] args) {

		//����������
		//1�� ������Ű�ų�, 1�� ���ҽ�Ű�� ������
		//���������� ���������� �������� �ݵ�� �˾Ƶ־� �Ѵ�.
		
		int a = 10;
		System.out.println("a : " + ++a); // ��������
		
		int b = 10;
		System.out.println("b : " + b++); // ��������
		System.out.println("b : " + b);
		
		--b; // 10
		--b; // 9
		b++; // 9
		b--; // 10
		++b;// 10
		b++;//9
		--b;//10
		
		System.out.println("b : " + b++);
		System.out.println("b : " + b);
		
	}//main
}
