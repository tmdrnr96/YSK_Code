package ex2_operator;

public class Ex3_Operator {
	public static void main(String[] args) {

		//�������� 
		//�񱳿����ڸ� ���� ������ �� �� �̻� ���Ǵ� ���, �̸� �����ϴ� �뵵�� ����ϴ� ������
		
		int age = 20;
		int limit = 25;
		
		//&&(and) ������ : �� ���ϳ��� �����̸� ��� false, �ΰ����� ��� true �� ��� true
		//true && true = true
		//true && false = false
		//false && true = false
		//flase && false = false
		
		//&&�� ���� ������ false�� ���� ������ �������� �ʴ´�.(�Ʒ��� �����ζ��  age�� 20�̴�.(������ �������� ����..))
		boolean res = limit - age > 5 && (age -= 2) > 20;
		
		System.out.println("&& ���� : " + res);
		System.out.println("age : " + age);
		
		int n1 = 10;
		int n2 = 20;
		//||(or) ������ : �� ������ ��� false�� ���� false �������� ���� ��� true
		//true && true = true
		//true && false = true
		//false && true = true
		//flase && false = false
		
		//&&������� �ݴ�� ��������
		//||(or)������ ���� ������ true�̸� ���� ������ �������� �ʴ´�
		res = (n1 += 10) > 20 || n2 - 10 == 11;
		System.out.println("|| ���� : " + res);
		
		//!(not)������ : ���� �������� ������ ������ ��ȯ�����ִ� ������
		System.out.println("!(not) ���� : " + !res);
		System.out.println(res);
	}//main
}
