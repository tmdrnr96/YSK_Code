package ex2_value_type;

public class Ex2_valueTpye {
	public static void main(String[] args) {

		//������ : ���������� ���� ���� ������ �ڷ���
		//byte b = 128; <--byte �ڷ����� �ִ밪�� ����Ƿ� ����
		int n = 2100000000;
		System.out.println("n : " + n);
		
		long lo = 2200000000L; // ���ľ� L��  ��ҹ��ڸ� �������� �ʴ´�.
		System.out.println("lo : " + lo);
		
		System.out.println("----------------------------------------------");
		
		//�Ǽ��� : �Ҽ����� �����ϴ� ���� �����ϱ� ���� �ڷ���
		float f = 3.14F;
		double d = 3.14; 
		
		System.out.println("f : " + f);
		System.out.println("d : " + d);
		
		//�ڷ����� �Ǽ��̱� ������ �������� ������ �˾Ƽ� ���� Ÿ�Կ� �°� �Ǽ������� �ٲ��.
		f = 100;
		d = 200;
		
		System.out.println("f : " + f);
		System.out.println("d : " + d);
	}//main
}
