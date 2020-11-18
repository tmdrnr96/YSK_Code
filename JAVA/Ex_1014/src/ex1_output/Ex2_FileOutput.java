package ex1_output;

import java.io.FileOutputStream;
import java.io.IOException;

public class Ex2_FileOutput {
	public static void main(String[] args) {

		//Stream은 byte기반이기 떄문에 출력하기 위해서는 String을 byte로 변환해줘야한다.
		FileOutputStream fos = null;

		try {

			fos = new FileOutputStream("C:\\YSK\\java_0914_ysk\\fileOutput.txt");
			String msg1 = "fileOutputStream의 예제!";

			//byte배열로 바꿔줘야한다.
			//msg1.getBytes(); : 문자열을 byte[]로 변환하는 메서드 
			byte[] by = msg1.getBytes();

			String msg2 = "\n나는 두번째 줄입니다.";

			//fos의 경로에 by[]을 write해준다.
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
