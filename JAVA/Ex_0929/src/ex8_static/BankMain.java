package ex8_static;

public class BankMain {
	public static void main(String[] args) {

		Bank b1 = new Bank("����", "02-111-1111");
		Bank b2 = new Bank("����", "02-222-2222");
		Bank b3 = new Bank("�д�", "032-333-3333");
		
//		Bank.interest = 0.1f; (����!)
		
		b1.interest = 0.1f;//���� ������ �������� �ٲ۴�.
		//static�� �޸𸮻� �� �ϳ��� ��������� ������
		//�� ������ �������� �ٲ㵵 ��ü ������ �������� �ٲ��.
		
		b1.getInfo();
		b2.getInfo();
		b3.getInfo();
		
		/* �Ϲ� Ŭ���� �޸� ���� 
		 	static	|  			heap
		 -----------|-----------------------
		 	b1		| p : ����  tel : 02...  in : 10%
		 	b2		| p : ����  tel : 02...  in : 10%
		 	b3		| p : �д�  tel : 032...  in : 10%
		 
		 
		  */
		
		/* static ���� �޸� ���� 
	 	static	|  	     heap		   	 |		static
	 -----------|------------------------|------------------
	 	b1		| p : ����  tel : 02... in |->	
	 	b2		| p : ����  tel : 02... in |->   		10%
	 	b3		| p : �д�  tel : 032...in |->  (static������ �޼���� ��ü�� 
	 										    �ƹ��� ���� �����ص� �޸𸮻� 
	 										  '�� �Ѱ���' ���������.)
	 
	 
	  */
		
		
	}//main
}
