package ex1_random;

import java.util.Random;

public class Ex1_Random {
	public static void main(String[] args) {
		
		//1 ~ 5������ ����
		//new Random().nextInt(������ ����) + ���ۼ�;
		int num = new Random().nextInt(5) + 1;

		System.out.println(num);
		
		//2 ~ 4������ ����
		//new Random().nextInt(������ ����) + ���ۼ�;
		num = new Random().nextInt(3) + 2;
		
		System.out.println(num);
		
		//4 ~ 10������ ����
		//new Random().nextInt(������ ����) + ���ۼ�;
		num = new Random().nextInt(7) + 4;
				
		System.out.println(num);
		
		//14321 ~ 22148������ ����
		//new Random().nextInt(������ ����) + ���ۼ�;
		//new Random().nextInt(ū �� - ���� �� + 1) + ���ۼ�;
		num = new Random().nextInt(22148 - 14321 + 1) + 14321;
						
		System.out.println(num);
		
		System.out.println("----------------------------------");
		//������ ���ĺ� �빮�ڵ� �� �ϳ��� �������
		//��� : 
		
		int rnd = new Random().nextInt(26) + 65;
		char ch = (char)rnd;
		System.out.println(ch);
		
		System.out.println("----------------------------------");
		
		int random = new Random().nextInt('Z'-'A') + 'A';
		System.out.println((char)random);
		
		System.out.println("----------------------------------");
		
	}//main

}
