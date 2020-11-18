package ex3_object_stream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ScoreSave {

	public ScoreSave(RspInfo info) {
		//C:\YSK\java_0914_ysk\\RspScore\\�����̸�\\UserInfo.sav
		String path = "C:\\YSK\\java_0914_ysk\\RspScore\\" + info.getId() + "\\UserInfo.sav";
		File f = new File("C:\\YSK\\java_0914_ysk\\RspScore\\" + info.getId());
		
		//f�� ��� �ִ� ��ΰ� ���������� �������� �ʴٸ�!!
		if(!f.exists()) {
			f.mkdirs();
		}
		//����ϱ� ���� FileOutputStream!
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
	
		//���� ����(��ü����)
		try {
			fos = new FileOutputStream(path);//path��η� ��θ� �����.
			
//			ObjectStream (byte���)
//
//			ObjectStream�� ����ϸ� ����ڰ� ������ 
//			Ŀ���� Ŭ����(User, vending ���.. �����ڰ� �������� Ŭ����)�� ������ ������ �� �ִ�.
//
//			Object�������� ��� ��ü�� ������ �� �����Ƿ�, �⺻�ڷ��� �� �ƴ϶�
//			��ü����� ������� ����������.
//
//			Ư�� Ŭ������ ������ ��°�� �����ϰų�, �о� �� �� �ִٴ� ������ �ִ�.
//
			oos = new ObjectOutputStream(fos);//fos�� ��θ� �����Ѵ�.
			oos.writeObject(info); //info��ü�� ��°�� �����Ѵ�.//����Ʈ �迭�� �˾Ƽ� ������ �����Ѵ�.
			//java.io.NotSerializableException : Serializable(����ȭ)
			System.out.println("����Ϸ�");
			
		} catch (Exception e) {
			System.out.println("�������");
			e.printStackTrace();
		}finally {
			
			try {
				//�������� ��Ʈ���� ���� ���� ������ �������� �ݴ´�.
				oos.close();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}//ScoreSave(������)
	
	
		
}
