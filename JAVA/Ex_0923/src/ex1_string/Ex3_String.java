package ex1_string;

import java.util.Scanner;

public class Ex3_String {
	public static void main(String[] args) {

		//Ű���忡�� �ƹ����̳� �������̷� �Է��� �޴´�.
		//�Է¹��� ���忡 �ҹ��� a�� �� �� �ִ��� ȭ�鿡 ����Ͻÿ�.

		Scanner sc = new Scanner(System.in);
		System.out.print("�Է� : ");
		String str = sc.next();

		int count = 0;
		
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(c == 'a') {
				count++;
			}//if
			
		}//for
		System.out.println("a�� ���� : " + count);
		
	}//main

}
