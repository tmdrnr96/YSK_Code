package ex1_casting;

public class Ex1_promotion {
	public static void main(String[] args) {

		//ĳ����(����ȯ)
		//1.���θ�� ĳ����(�ڵ����� �̷������.)
		//- ū �ڷ����� ���� �ڷ����� �����ϴ� ��.
						  // �޸� ���뷮
		double d = 100.5; // 8 byte
		int n = 200; // 4 byte
		d = n;
		
		//syso : System.out.println ����Ű
		System.out.println("d : " + d );
		
		char c = 'A';// 2 byte
		int n2 = 100; // 4 byte
		n2 = c;
		
		System.out.println("n2 : " + n2);
		
		
	}//main 
}
