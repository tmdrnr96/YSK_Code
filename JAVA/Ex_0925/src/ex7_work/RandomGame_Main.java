package ex7_work;

import java.util.Random;
import java.util.Scanner;

public class RandomGame_Main {
	public static void main(String[] args) {

		/*
			 String[] strArr = {"CHANGE", "APPLE", "DOCTOR"}
	
			-----------------------------------------
			���� : �������� �ܾ ���õȴ�.(�ܾ �������� ���´�.)
			���� : ealpp
			ealpp�� ����!
			���� : apple
			apple ����!
		 */

		String str = "";

		String[] strArr = {"CHANGE", "APPLE", "DOCTOR"};
		int n = new Random().nextInt(strArr.length);
		
		//�������� strArr�� �ִ� �ܾ� ���
		System.out.println(strArr[n]);
		
		//strArr[n]�� �ش��ϴ� �ܾ��� ���̸�ŭ for���� ������.
		for(int i = 0; i < strArr[n].length(); i++) {

			n = new Random().nextInt(strArr[n].length());

			
		}


		System.out.println(str);

		Scanner sc = new Scanner(System.in);
		System.out.print("���� :");
		String result = sc.next();

		if(strArr[n].equalsIgnoreCase(result)) {
			System.out.println( result + "����!");
		}else {
			System.out.println(result + "����!");
		}




	}//main
}
