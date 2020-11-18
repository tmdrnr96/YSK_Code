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
		
		FileInputStream fis = null; //안에 있는 내용을 읽어 올수 있지만, 클래스를 읽어올 수 없다...
		ObjectInputStream ois = null;//FileInputStream이 없다면 경로를 알 수가 없다.. (클래스를 읽어올 수 있다.)
		
		if(f.exists()) {
		//데이터 로드하기!!
			
			try {
				
				fis = new FileInputStream(path);
				ois = new ObjectInputStream(fis);
				//ois을 통해 RspInfo객체를 로드!
				info = (RspInfo)ois.readObject();//path경로로 가서 클래스의 정보를 읽어온다.
				//ois.readObject()는 Object타입이기 때문에.. Object > RspInfo -> 형변환!
				
				//info에 값을 대입하지 않으면 info는 null값..
				//info대입한 경우 굳이 info를 new로 객체생성을 하지않아도, 메모리에 할당된다.
				
			} catch (Exception e) {
				System.out.println("로드 실패...");
			}finally {
				try {
					//역순으로 닫기!
					ois.close();
					fis.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}else {
			System.out.println(id + "님 첫 접속을 환영합니다.");
		}
		
	}//ScoreLoader(생성자)
}
