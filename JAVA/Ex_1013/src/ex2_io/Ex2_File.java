package ex2_io;

import java.io.File;

public class Ex2_File {
	public static void main(String[] args) {

		//����Ŭ������ ������ path���
		String path = "C:\\YSK"; //������ ������� ���
		File f = new File(path);
		
		//������ �ƴ� �� if���� ����
		if(!f.isFile()) { //f.isDrectory()�� ���� (���� �� �� if�� ����)  
			//FileŬ������ ���� ��ΰ� ���� �� ���
			
			//f.list():f�� ��λ� �ִ� ��������� �̸��� �����´�.
			String[] names = f.list();//String[]�� ��ȯ�ȴ�.
			//list : ���� ������ ����� ������ ���� ����� ���ĺ� ������� String�迭�� �������.
		
			for(int i = 0; i < names.length; i++) {
				
				System.out.println(names[i]);
			}
		
		}
		
		
		
	}//main
}
