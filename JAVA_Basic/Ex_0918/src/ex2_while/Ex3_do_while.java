package ex2_while;

import java.util.Random;

public class Ex3_do_while {
	public static void main(String[] args) {

		//java, jsp, android�� ������ �ô�.
		//�� ���� ������ �������� 0 ~ 130 ���� ����
		//do-while�� ���� ���� ������ �Ѱ�����
		//100���� �Ѵ� ������ �ִٸ� �����
		//���������� �� ������ ������ ��� 100�� ������ �� do- while�� �������´�.
		//������ ȭ�鿡 ���

		//java : 87
		//jsp : 49
		//and : 100

		int java = 0;
		int jsp = 0;
		int and = 0;
		
		boolean t = true;

		do {
			//��Ʈ�� + ��Ʈ + ȭ��ǥ �ؿ� ���� (����) 
			java = new Random().nextInt(131);//0���� 130������ ����
			jsp = new Random().nextInt(131);
			and = new Random().nextInt(131);

			if(java < 100 && jsp < 100 && and < 100) {
				
				System.out.println("java : " + java);
				System.out.println("jsp : " + jsp);
				System.out.println("and : " + and);				
				t = false; 
			}
			
		}while(t);

		System.out.println("----------------------------------");
				
		do {
			
			java = new Random().nextInt(131);//0���� 130������ ����
			jsp = new Random().nextInt(131);
			and = new Random().nextInt(131);
			
		}while(java > 100 || jsp > 100 || and > 100); //�� ������ 100���� �Ѿ�� while�� �����..
		
		System.out.println("java : " + java);
		System.out.println("jsp : " + jsp);
		System.out.println("and : " + and);	



	}//main

}
