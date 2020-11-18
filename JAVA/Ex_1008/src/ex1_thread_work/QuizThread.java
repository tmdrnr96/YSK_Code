package ex1_thread_work;

import java.util.Random;
import java.util.Scanner;

public class QuizThread extends Thread {
	
	// 1 ~ 100 ������ ���� �ΰ��� ���� �߻� ��Ű��, �̰��� ���ϴ� ������ ����
	//������ ���� Ű���忡�� ���� �Է¹޾� 5������ ����ó�� �ɶ����� �ڵ带 �ݺ�
	//5������ ����ó���Ǹ� ������ ����Ǵµ�, �̶� �� ������ �ð��� �ɷȴ����� ȭ�鿡 ���
	//��, ���󽺷���� ������� �ʴ´�.

	//1 + 35 = 36
	//����!!
	//66 + 92 = 121
	//����...
	//....
	//48 + 9 = 57
	//����!!
	//��� : 24��
	
	int su1, su2;
	int timer = 0;
	int playCount = 0;//������ ���� ��쿡�� 1�� ����

	boolean isCheck = true;
	Random rnd = new Random();
	Scanner sc = new Scanner(System.in);


	//���� ���� �� ���� �Ǻ� �޼���

	public void startGame() {

		while(isCheck) {
			su1 = rnd.nextInt(100)+1;
			su2 = rnd.nextInt(100)+1;

			//��������
			System.out.printf("%d + %d = ", su1, su2);
			
			int result = sc.nextInt();
			
			//����üũ
			if(result == su1 + su2 ) {
				System.out.println("����!");
				playCount++;//������ ���� ��쿡�� playCount�� 1�� ����!!
			}else {
				System.out.println("����...");
			}
			
			//���� ���� üũ
			
		if(playCount == 5){
			System.out.printf("��� : %d��", timer);
			isCheck = false;
		}

		}//while

	}//startGame()

	@Override
	public void run() {

		//�ټ������� ����ó�� �ɶ����� �ð��� ���
		while(isCheck) {

			try {
				Thread.sleep(1000);
				timer++;

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}//while

	}//run
}
