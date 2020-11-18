package ex3_fileinput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex1_FileInput {
	public static void main(String[] args) {

		//스트림의 종류
		//...Stream : byte기반의 스트림 : 한번에 1byte씩만 읽고 쓸수 있다.
		//...Reader, ...Writer : char기반의 스트림 : 한번에 2byte씩 읽고 쓸 수 있다.
		
		
		String path = "C:\\YSK\\test.txt";
		File f = new File(path);

		if(f.exists()) {

			//파일과 연결된 입력스트림 생성
			try {

				FileInputStream fis = new FileInputStream(f);//f는 fis한테 통로를 알려준다.
				//FileInputStream : 읽어오기 위한 통로를 만들어주는 클래스
				
				int code = -1;

				//스트림은  read()를 통해  byte단위로 아스키 코드값을 읽어오는데,
				//반복을 수행하다가 더 이상 읽을 것이 없을 때 , -1을 가져온다.
				//파일의 끝인(EOF(End Of File)) -1을 만나면 반복문이 종료!
				
				while((code = fis.read()) != -1) {
					//fis.read() : 읽어오는 과정에서 파일이 삭제되거나 정정되는 오류가 생길수 있기 떄문에 IOException이 발생할 수 있다.
					//read() : 한글자씩 읽어오는데, 정수형식으로 읽어온다(알파벳 : 아스키코드로! )
					//한 칸씩 이동하면서 읽다가 더이상 읽을 곳이 없다면 -1(EOF)을 반환한다.
					System.out.print((char)code);
					
				}
				//읽어오는 작업이 마무리되면 반드시 스트림을 닫아준다.
				fis.close();//ex)모든파일은 실행중에 닫을 수 없다(엑셀을 사용하고 있는데 삭제할 수 없음..(엑셀파일을 닫아야 삭제가 가능하다.))
				
			} catch (Exception e) {//FileNotFoundException :파일을 찾지 못했을 때 발생하는 오류(위의 경로가 없을 수도 있음(예측가능한 오류))

				e.printStackTrace();

			}
			
			

		}

	}//main
}



















