package ex3_fileinput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex1_FileInput {
	public static void main(String[] args) {

		//��Ʈ���� ����
		//...Stream : byte����� ��Ʈ�� : �ѹ��� 1byte���� �а� ���� �ִ�.
		//...Reader, ...Writer : char����� ��Ʈ�� : �ѹ��� 2byte�� �а� �� �� �ִ�.
		
		
		String path = "C:\\YSK\\test.txt";
		File f = new File(path);

		if(f.exists()) {

			//���ϰ� ����� �Է½�Ʈ�� ����
			try {

				FileInputStream fis = new FileInputStream(f);//f�� fis���� ��θ� �˷��ش�.
				//FileInputStream : �о���� ���� ��θ� ������ִ� Ŭ����
				
				int code = -1;

				//��Ʈ����  read()�� ����  byte������ �ƽ�Ű �ڵ尪�� �о���µ�,
				//�ݺ��� �����ϴٰ� �� �̻� ���� ���� ���� �� , -1�� �����´�.
				//������ ����(EOF(End Of File)) -1�� ������ �ݺ����� ����!
				
				while((code = fis.read()) != -1) {
					//fis.read() : �о���� �������� ������ �����ǰų� �����Ǵ� ������ ����� �ֱ� ������ IOException�� �߻��� �� �ִ�.
					//read() : �ѱ��ھ� �о���µ�, ������������ �о�´�(���ĺ� : �ƽ�Ű�ڵ��! )
					//�� ĭ�� �̵��ϸ鼭 �дٰ� ���̻� ���� ���� ���ٸ� -1(EOF)�� ��ȯ�Ѵ�.
					System.out.print((char)code);
					
				}
				//�о���� �۾��� �������Ǹ� �ݵ�� ��Ʈ���� �ݾ��ش�.
				fis.close();//ex)��������� �����߿� ���� �� ����(������ ����ϰ� �ִµ� ������ �� ����..(���������� �ݾƾ� ������ �����ϴ�.))
				
			} catch (Exception e) {//FileNotFoundException :������ ã�� ������ �� �߻��ϴ� ����(���� ��ΰ� ���� ���� ����(���������� ����))

				e.printStackTrace();

			}
			
			

		}

	}//main
}



















