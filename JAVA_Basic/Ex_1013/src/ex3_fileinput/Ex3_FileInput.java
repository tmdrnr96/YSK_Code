package ex3_fileinput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex3_FileInput {
	public static void main(String[] args) {

		//file.txt�� ������ �о� ȸ�������� �ƴ����� �Ǵ�

		String path = "C:\\YSK\\JAVA\\test.txt";
		File f = new File(path);
		byte[] read = new byte[(int)f.length()];

		FileInputStream fis = null;

		String rev = "";
		
		if(f.exists()) {
			try {
				fis = new FileInputStream(f);	
				fis.read(read);//���������͸� �о read�迭�� ��´�.

				String str = new String(read);//read�迭�� ���� ���ڿ��� ����
				
				//������ ����� rev�� ����
				for(int i = str.length()-1; i >= 0; i--) {
					rev += str.charAt(i);	
				}//for
				
				//ȸ���� �Ǵ�
				if(rev.equals(str)) {
					System.out.println("ȸ���� �Դϴ�.");
				}else {
					System.out.println("ȸ������ �ƴմϴ�.");
				}

			} catch (Exception e) {

				e.printStackTrace();
				
			}finally {
				try {
					fis.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			}

		}
	}//main
}
