package ex7_work;

import java.util.Random;
import java.util.Scanner;

public class ThreadMain {
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
	
	public static void main(String[] args) {
		
		int count = 0;
		
		Threadsub ts = new Threadsub();
		Thread t = new Thread(ts);
		
		Scanner sc = new Scanner(System.in);
		
		 out : while(true) {
				
		int n1 = new Random().nextInt(100) + 1;
		int n2 = new Random().nextInt(100) + 1;
		
		System.out.printf("%d + %d = ", n1,n2);
		t.start();
		int result = sc.nextInt();
		
		if(result == n1 + n2) {
			System.out.println("����!");
			count++;
			
		}else {
			System.out.println("����...");
		}
		if(count == 5) {
			ts.setCount(count);
			break out;
		}
		}//while
	}//main

}
