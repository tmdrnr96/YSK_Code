package ex1_continue;

public class Ex1_Continue {
	public static void main(String[] args) {

		int n = 0;

		while(n < 10) {
			n++;

			//2�� ������ ��, �������� 0 (2�� ���)
			if(n % 2 == 0) {
				//while�� �ȿ��� �����ϴ� continue�� 
				//while���� ���ǽ����� �̵��Ѵ�.

				continue;//���� 2�� ������ while���� ���ǽ����� ���ư���.(���x)

			}//if

			System.out.println(n);

		}//while

		System.out.println("---------------------------------------");

		//switch�������� continue�� ����ϴ� ���� �Ұ���������, switch���� �ݺ��� �ȿ� ������ ��쿡��
		//switch�ȿ��� continue���� ����� �� �ִ�.
		
		int num = 0;

		while(num < 5) {

			num++;
			
			switch(num) {

			case 1 :
				System.out.println("�Ʒ��� ����");
				continue; //�ݺ��� �������� switch������ continue Ű���带 ����� �� �ִ�.
				
			case 3 :
				System.out.println("�Ʒ��� ����2");
				//�ݺ��� �ȿ����� switch�� ���� continue��
				//switch�� �����ϰ� �ִ� �ݺ����� �������̳� ���ǽ����� �̵��Ѵ�.
				continue;			
			}//switch
			
			System.out.println(num);
		}//while

	}//main

}
