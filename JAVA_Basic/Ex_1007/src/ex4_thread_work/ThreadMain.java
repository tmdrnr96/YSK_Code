package ex4_thread_work;

import java.util.Scanner;

public class ThreadMain {
	public static void main(String[] args) {

		//���� : 5
		//5
		//4
		//3
		//2
		//1
		//0
						
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int n = sc.nextInt(); 
		
		//setter�� �����ڷ� ���� �Ѱ��� �� �ִ�.
		
		//�����ڷ� �ѱ�� ��
//		ThreadTest t = new ThreadTest(n);
		
		ThreadTest t = new ThreadTest();
		
		//setter�� ���� ���� �ѱ�� ��
		t.setN(n);
		t.start();
		
	}//main
}
