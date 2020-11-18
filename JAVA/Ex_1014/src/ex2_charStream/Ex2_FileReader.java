package ex2_charStream;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Ex2_FileReader {
	public static void main(String[] args) {

		//test.txt�� charStream���� �о�� ��
		//�о�� ���̴��� ���ĺ� �빮�ڿ� �ҹ��ڰ� ���� ��� �ִ��� ���!

		//�ҹ��� : 18
		//�빮�� : 10

		FileReader fr = null;
		File f = new File("C:\\YSK\\java_0914_ysk\\test.txt");

		int lower = 0;
		int upper = 0;

		if(f.exists()) {
			
			try {
				
				fr = new FileReader(f);				
				int code = -1;
				
				//***fr.read()�� �����鼭 code���� ���� ���� �Ѱ��ش�.*** 
				while((code = fr.read()) != -1) {

					if(code >= 'a' && code <= 'z') {
						lower++;

					}else if(code >= 'A' && code <= 'Z') {
						upper++;
					}
				}
				System.out.println("�ҹ��� : " + lower);
				System.out.println("�빮�� : " + upper);
			} catch (Exception e) {
			
				e.printStackTrace();
			}finally {
				try {
					fr.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
				
			}
		}
	}//main
}
