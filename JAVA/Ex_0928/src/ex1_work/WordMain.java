package ex1_work;

import java.util.Scanner;

public class WordMain {
	public static void main(String[] args) {

		WordScramble ws = new WordScramble();
		String answer = ws.getAnswer();//������ �޴´�.

		//������ �� ������ �����ش�.
		String qustion = ws.getQuestion(answer);


		System.out.println("���� : " + qustion);

		Scanner sc = new Scanner(System.in);
		
		//����ڰ� �Է¹��� ���� ������ ������ ��ġ�ϴ��� Ȯ��
		while(true) {
			System.out.print("���� : ");
			String str = sc.next();

			if(str.equalsIgnoreCase(answer)) {
				System.out.println(str + "����!");
				break;
			}else {
				System.out.println(str + "����...");
			}
		}
	}//main

}
