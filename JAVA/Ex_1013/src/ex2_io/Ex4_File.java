package ex2_io;

import java.io.File;

public class Ex4_File {
	public static void main(String[] args) {
		
		String path = "C:\\YSK\\abc";
		
		File f1 = new File(path);
		
		//f1.exists : FileŬ������ �����ϰ����ϴ� ��ΰ� ��� �����Ѵٸ� true
		//C����̺� -> YSK -> abc �� ���ϳ��� ��ΰ� �������� �ʴ� �ٸ� false 
		
		//!f1.exists() : �ϳ��� �������� �ʴ� �ٸ� true
		if(!f1.exists()) {
			//f1.exists() : f1�� ���ٰ�ΰ� ����������  �����Ѵٸ� true
			System.out.println("������ �����մϴ�.");
//			f1.mkdir();//���� ���� �޼��� (�ϳ��� ������ ���� �� ���..)
			f1.mkdirs();//���� ���� �޼���(�ΰ� �̻��� ������ ���� �� ���..)
			//mkdird�� ������ ������ ���ϰ� ������ ������ ���� �� �ִ�.
		}else {
			System.out.println("�̹� �����ϴ� �����Դϴ�.");
		}
	}//main
}
