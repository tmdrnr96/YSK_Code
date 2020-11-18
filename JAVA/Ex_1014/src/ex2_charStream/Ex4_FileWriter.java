package ex2_charStream;

import java.io.FileWriter;
import java.io.IOException;

public class Ex4_FileWriter {
	public static void main(String[] args) {

		//2byte�� �����͸� ����Ѵ�.
		FileWriter fw = null;

		String path = "C:\\YSK\\java_0914_ysk\\filewriter����.txt";

		try {
			
			fw = new FileWriter(path);
			
			String msg1 = "���� filewriter�� ������!!";
			String msg2 = "\n �ι�° �ٵ� ����!!";
			
			fw.write(msg1);//byte�� ���� �ʿ䰡 ����..
			fw.write(msg2);
			//fw�� close()�� ��, ������ ���������� �����ϴ� flush()�޼��尡 �ڵ�����
			//ȣ��Ǳ� ������, �ݵ�� close()�� ���� �ۼ��ϰ��� �ϴ� ������
			//���������� ����� �� �ֵ��� ó������� �Ѵ�.
			//fw.flush();
			
		} catch (Exception e) {

		}finally {
			//JVM���ؿ��� close�� ������ ������ ����� ���� �������̶�� �����ϱ� 
			//������ �����ص� �����Ͱ� ��ϵ��� �ʴ´�. 
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}//main
}
