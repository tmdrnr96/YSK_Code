package ex3_fileinput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex2_FileInput {
	public static void main(String[] args) {

		String path = "C:\\YSK\\JAVA\\test.txt";
		File f = new File(path);
		byte[] read = new byte[(int)(f.length())]; 
		//byte�� �뷮�� ���缭 �迭�� �������ִ� ���� ����.(f.length)
		//���ڸ� 1byte�� �迭�� ����ְ�, �̸� �ٽ� String�� ���ڿ��� �ٲܼ� �ִ�.
		//���� ����, �׸� ���� ������ �� ���ǰ� �ѱ۷δ� ����� �߾���..
		
		FileInputStream fis = null; //���������� �����. fis.close();�� try/Catch �ۿ� ���� ���ؼ�.. 
		
		//�ش� ��α��� �����Ѵٸ� true
		if(f.exists()) {
			
			try {
				fis = new FileInputStream(f);
				//�� ��ΰ� ������ �����Ѵٴ� ������ ���⶧���� FileNotFoundException ���ɼ��� ����..
				fis.read(read);//fis�� �о�� ������ read�迭�� 1byte�� ����
				
				//read��� byte�迭�� ���ڿ� result�� ����!(�˾Ƽ� ���ڿ��� �ٲ��ش�..)
				String result = new String(read); //String�� ��ü���� �ϴ� ���...
				
				System.out.println(result);
				
				
			} catch (Exception e) {
			
				e.printStackTrace();
				
			}finally {
				
				try {
					//finally���� �ȿ��� ��Ʈ���� �ݾ��ָ�
					//���� ������ ������� ��Ʈ����  ���� �� �ֱ� ������ �����ϴ�.
					fis.close();
				} catch (IOException e) { //fis�� read�� ��, ���ڱ� ������ �������ų� �����Ǵ� ��Ȳ... (IOException�� �߻��� �� ����)
					e.printStackTrace();
				}
			}
			
		}
	}//main
}
