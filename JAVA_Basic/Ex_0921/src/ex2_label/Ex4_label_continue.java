package ex2_label;

public class Ex4_label_continue {

	public static void main(String[] args) {
		//label�� ����� ���� ������� ���� ���� �����ؾ��Ѵ�.
		//�ݺ����� 1���� ���� ����� �ʿ� ����. ������ �ݺ����� 2�� �̻��̶�� ���!
		
		int n = 0;
		
		out : while( n < 10 ) {
			n++;
			
			switch(n) {
			case 2 : 
			case 4 :
				System.out.println("switch���� @@");
				continue out;
				
				//continue�� ����� ���� break�� ����� ��, ������� �ٸ��� ���´�.
			}
			
			
			System.out.println(n + " ");
			
		}//while

	}//main

}
