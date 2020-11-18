package ex2_charStream;

import java.io.FileReader;

public class Ex3_FileReader {
	public static void main(String[] args) {
		//Ex2_FileReader���� �����ڵ�..
		//test.txt�� charStream���� �о�� ��
		//�о�� ���̴��� ���ĺ� �빮�ڿ� �ҹ��ڰ� ���� ��� �ִ��� ���!

		//�ҹ��� : 18
		//�빮�� : 10

		FileReader fr = null;
		
		
		try {
			
			fr = new FileReader("C:\\YSK\\java_0914_ysk\\test.txt");
			int read  = -1;
			int upper = 0;//�빮���� ����
			int lower = 0;//�ҹ����� ����
			
			while((read = fr.read())!= -1) {
				if(read >= 'A' && read <= 'Z') {
					upper++;//�빮�� �߰�
				}
				if(read >= 'a' && read <= 'z') {
					lower++;//�ҹ��ڹ߰�
				}
			}//while
			
			System.out.println("�빮�� : " + upper);
			System.out.println("�ҹ��� : " + lower);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}//main
}
