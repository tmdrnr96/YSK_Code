package ex7_static;

public class StaticTest {

	String str1 = "�Ϲ� �������";
	static String str2 = "����ƽ ����";

	public static void getString2() {

		//static�޼��忡���� �Ϲ� ������ ����� �� ����.
		//str1 = "�ȳ�";
		str2 = "�ݰ���";

		//static�޼��� ���ο����� static���������� ������ �� ����.
		//static int num = 10;
		int num2 = 10;
	}

	public void getString() {
		//�Ϲݸ޼��忡���� static������ �Ϲ� ������ ��� ����� �� �ִ�.
		str1 = "�ȳ�";
		str2 = "�ݰ����ϴ�.";

		int num1 = 10;

		//'static'Ű���带 ���� ���������� �Ϲ� �޼��忡�� ����� �� ����.
		//static int num2 = 10; 

	}//getString()
	
	
	/*	
	 	�Ϲ� �޼��� :  static������ �Ϲ� ������ ��� ����� �� ������, static ���� ������ �Ұ��ϴ�.
	 	static �޼��� : static ������ ����� �����ϰ� �Ϻ� ������ ����� �Ұ��ϴ�. �Ϲ� ������ ������ �����ϳ�,
	 	static������ ������ �Ұ��ϴ�.
	 */




}




