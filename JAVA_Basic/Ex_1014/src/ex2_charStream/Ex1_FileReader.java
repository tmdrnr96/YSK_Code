package ex2_charStream;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Ex1_FileReader {
	public static void main(String[] args) {

		FileReader fr = null;
		String path = "C:\\YSK\\java_0914_ysk\\test.txt";
		File f = new File(path);
		
		//stram�� �ƽ�Ű �ڵ�� �����͸� �д� �ݸ鿡 reader�� ������ ������ �����ڵ�� �д´�.
		int a = 50504;
		System.out.println((char)a);
		
		//f�� ��ΰ� ���������� �����Ѵٸ�! if�� ����
		if(f.exists()) {
			try {
				
				fr = new FileReader(f);
				int read = -1;
				
				//char����� ��Ʈ���� FileReader��
				//read()�� ���� �����͸� �о�� �� 2byte������ ������ �´�.
				
				//���̻� �о�� ���� ���� ������!
				while((read = fr.read()) != -1) {
					//�ƽ�Ű �ڵ尡 �ƴ� �����ڵ�� ǥ���ȴ�.//byte[]�� ���� �ʿ� ����.
					//Reader�� 1byte�����͸� ���� �ʰ� char(����) 2byte�� �д´�.(�ѱ��� �ѱ��ھ� �����ϴ�.)
					//(char)�� ����ȯ ���شٸ�..�ѱ��� �������� ���!
					System.out.print((char)read );
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				try {
					fr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
	}//main
}
