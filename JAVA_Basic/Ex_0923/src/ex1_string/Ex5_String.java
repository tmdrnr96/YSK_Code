package ex1_string;

import java.util.Scanner;

public class Ex5_String {
	public static void main(String[] args) {
		
		//Ű���忡�� ���� �Է¹ް�, ȸ���� ���� �ƴ��� �Ǵ��ϱ�!!
		
		//ȸ������?
		//������ �о �ڿ��� �о �Ȱ��� ������ ����
		
		//�� : ab11ba
		//ab11ba�� ȸ���� �Դϴ�.
		
		//�� : asd12
		//asd12�� ȸ������ �ƴմϴ�.
		
		Scanner sc = new Scanner(System.in);		
		System.out.print("�� : ");
		
		String str = sc.next();
		String str1 = "";
		
		//lenght�� 1���� �����Ѵ�.
		for(int i = str.length()-1; i >= 0; i--) {
			
			str1+=str.charAt(i);
		}
		
		
		if(str.equals(str1)) {
			System.out.println( str1 + "�� ȸ���� �Դϴ�.");
		}else {
			System.out.println( str1 + "�� ȸ������ �ƴմϴ�.");
		}
		
	}//main

}
