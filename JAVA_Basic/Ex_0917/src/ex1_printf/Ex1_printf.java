package ex1_printf;

public class Ex1_printf {
	public static void main(String[] args) {

		int su1 = 10;
		int su2 = 20;
		//10 + 20 = 30
		System.out.println(su1 + " + " + su2 + " = " + (su1 + su2) );
		System.out.printf("%d + %d = %d\n", su1, su2, su1 + su2);//���� ���������� ���Եȴ�.
		//printf (print + form)
		System.out.println("----------------------------------");
		//printf���� ln�� ������ �ٲٴ� ����� ���� ������ "\n(�̽�������: ���͸� ���ش�(�ٹٲ�))"���� ������ ������ �ٲ��ش�.

		char blood = 'B';
		//���� �������� B���Դϴ�.
		System.out.println("���� �������� " + blood + "�� �Դϴ�.");
		System.out.printf("���� �������� %c�� �Դϴ�.\n",blood);
		
		float temp = 20.5f;
		double temp2 = 22.7;
		//���� ����� 20.5�� �Դϴ�.
		System.out.printf("���� ����� %.1f�� �Դϴ�.\n",temp);
		//%.1f �Ҽ��� ���ڸ������� ǥ��!
		//%.2f �Ҽ��� ���ڸ������� ǥ��!
		
		System.out.printf("���� ����� %f�� �Դϴ�.\n",temp2);
		
		String name = "����ġ";
		int age = 20;
		//���� ����ġ�� 20���Դϴ�.
		System.out.printf("���� %s�� %02d���Դϴ�.\n",name,age);
		//%02d ������ 2�ڸ� ���� ������ش�.
		//%03d ������ 3�ڸ� ���� ������ش�.
		
		//formatter�� �ڷ��� Ÿ��
		//%d : ���� Ÿ��
		//%c : ���� Ÿ��
		//%f : �Ǽ� Ÿ��
		//%s : ������ Ÿ��
		
	}//mian
}
