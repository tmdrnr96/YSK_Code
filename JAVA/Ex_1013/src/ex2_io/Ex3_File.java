package ex2_io;

import java.io.File;

public class Ex3_File {
	public static void main(String[] args) {

		//����Ŭ������ ������ path���
		//File Ŭ������ ��θ� �ٷ� �־ �������(�����ε� �Ǿ� ����..)
		File f = new File("C:\\YSK");

		
		//���� ��Ͽ��� ��������� �˻��� �� �ִ�.
		
		if(f.isDirectory()) { //f�� ������ ��ΰ� ���������̶��..!
			//f�� ���� ��ҵ��� FileŬ���� �������� �޴´�.
			File[] ar = f.listFiles();
			//fileŬ������ �迭�� �޾��� ���, ���� ����, �뷮, �������� �������� ���� ����...
			for(int i = 0; i < ar.length; i++) {

				if(ar[i].isDirectory()) {//f�� ������ ��ΰ� ���������̶��..!
					System.out.println(ar[i].getName());
				}//if
			}//for
		}
		
	}//main
}
