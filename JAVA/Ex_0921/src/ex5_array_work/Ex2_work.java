package ex5_array_work;

import java.util.Scanner;

public class Ex2_work {
	public static void main(String[] args) {

		//�迭�� ���̴�? : 5

		Scanner sc = new Scanner(System.in);
		System.out.print("�迭�� ���̴�? : ");
		int n = sc.nextInt();

		char[] ch = new char[n] ;
//		ch[0] = 'A';
		
		for(int i = 0; i < ch.length; i++ ) {
			ch[i] = (char)('A' + i);
//			ch[i] += (char)i; //ch[0]�� ���� �ӽ÷� �־����� ch[1]���ʹ� ���� ���� ������ ���� �̻��ϰ� ���..
			
			System.out.print(ch[i] + " ");	
			
		}//for



	}//main
}
