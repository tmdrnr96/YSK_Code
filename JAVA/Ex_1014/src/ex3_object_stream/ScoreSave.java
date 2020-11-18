package ex3_object_stream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ScoreSave {

	public ScoreSave(RspInfo info) {
		//C:\YSK\java_0914_ysk\\RspScore\\유저이름\\UserInfo.sav
		String path = "C:\\YSK\\java_0914_ysk\\RspScore\\" + info.getId() + "\\UserInfo.sav";
		File f = new File("C:\\YSK\\java_0914_ysk\\RspScore\\" + info.getId());
		
		//f가 잡고 있는 경로가 물리적으로 존재하지 않다면!!
		if(!f.exists()) {
			f.mkdirs();
		}
		//기록하기 위한 FileOutputStream!
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
	
		//파일 쓰기(객체저장)
		try {
			fos = new FileOutputStream(path);//path경로로 통로를 만든다.
			
//			ObjectStream (byte기반)
//
//			ObjectStream을 사용하면 사용자가 구현한 
//			커스텀 클래스(User, vending 등등.. 개발자가 직접만든 클래스)의 내용을 저장할 수 있다.
//
//			Object형식으로 모든 객체를 수용할 수 있으므로, 기본자료형 뿐 아니라
//			객체들까지 입출력이 가능해진다.
//
//			특정 클래스의 내용을 통째로 저장하거나, 읽어 올 수 있다는 장점이 있다.
//
			oos = new ObjectOutputStream(fos);//fos의 통로를 공유한다.
			oos.writeObject(info); //info객체를 통째로 저장한다.//바이트 배열로 알아서 나눠서 저장한다.
			//java.io.NotSerializableException : Serializable(직렬화)
			System.out.println("저장완료");
			
		} catch (Exception e) {
			System.out.println("저장실패");
			e.printStackTrace();
		}finally {
			
			try {
				//여러개의 스트림을 닫을 때는 생성된 역순으로 닫는다.
				oos.close();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}//ScoreSave(생성자)
	
	
		
}
