package ex3_work;

import java.util.Scanner;

public class Ex1_work {
	public static void main(String[] args) {

		//Ű���忡�� ������ �Է¹ް� �Է¹��� ������ 
		//�Ҽ�(����� 1�� �ڱ� �ڽŸ� �ִ� ��) ���� �Ǵ��ϴ� �ڵ带 �ۼ�

		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int num = sc.nextInt();

		int i = 0; 

		for(i = 2; i <= num; i++) {
			if(num % i == 0) {
				break;
			}//if
		}//for
		if(i == num) {
			System.out.println( num + "��(��) �Ҽ� �Դϴ�.");
		}else {
			System.out.println(num + "��(��) �Ҽ��� �ƴմϴ�.");
		}

	}//main
}
