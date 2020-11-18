package ex1_output;

import java.io.FileOutputStream;
import java.io.IOException;

public class Ex2_FileOutput {
	public static void main(String[] args) {

		//Stream�� byte����̱� ������ ����ϱ� ���ؼ��� String�� byte�� ��ȯ������Ѵ�.
		FileOutputStream fos = null;

		try {

			fos = new FileOutputStream("C:\\YSK\\java_0914_ysk\\fileOutput.txt");
			String msg1 = "fileOutputStream�� ����!";

			//byte�迭�� �ٲ�����Ѵ�.
			//msg1.getBytes(); : ���ڿ��� byte[]�� ��ȯ�ϴ� �޼��� 
			byte[] by = msg1.getBytes();

			String msg2 = "\n���� �ι�° ���Դϴ�.";

			//fos�� ��ο� by[]�� write���ش�.
			fos.write(by);
			fos.write(msg2.getBytes()); 

		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}//main
}
