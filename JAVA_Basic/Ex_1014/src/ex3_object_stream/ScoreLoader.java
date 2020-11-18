package ex3_object_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ScoreLoader {
	
	private RspInfo info;
	
	public RspInfo getInfo() {
		return info;
	}
	
	public ScoreLoader(String id) {
		
		String path = "C:\\YSK\\java_0914_ysk\\RspScore\\" + id + "\\UserInfo.sav";
		
		File f = new File(path);
		
		FileInputStream fis = null; //�ȿ� �ִ� ������ �о� �ü� ������, Ŭ������ �о�� �� ����...
		ObjectInputStream ois = null;//FileInputStream�� ���ٸ� ��θ� �� ���� ����.. (Ŭ������ �о�� �� �ִ�.)
		
		if(f.exists()) {
		//������ �ε��ϱ�!!
			
			try {
				
				fis = new FileInputStream(path);
				ois = new ObjectInputStream(fis);
				//ois�� ���� RspInfo��ü�� �ε�!
				info = (RspInfo)ois.readObject();//path��η� ���� Ŭ������ ������ �о�´�.
				//ois.readObject()�� ObjectŸ���̱� ������.. Object > RspInfo -> ����ȯ!
				
				//info�� ���� �������� ������ info�� null��..
				//info������ ��� ���� info�� new�� ��ü������ �����ʾƵ�, �޸𸮿� �Ҵ�ȴ�.
				
			} catch (Exception e) {
				System.out.println("�ε� ����...");
			}finally {
				try {
					//�������� �ݱ�!
					ois.close();
					fis.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}else {
			System.out.println(id + "�� ù ������ ȯ���մϴ�.");
		}
		
	}//ScoreLoader(������)
}
