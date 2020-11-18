package ex2_charStream;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Ex1_FileReader {
	public static void main(String[] args) {

		FileReader fr = null;
		String path = "C:\\YSK\\java_0914_ysk\\test.txt";
		File f = new File(path);
		
		//stram은 아스키 코드로 데이터를 읽는 반면에 reader는 파일을 읽을때 유니코드로 읽는다.
		int a = 50504;
		System.out.println((char)a);
		
		//f의 경로가 물리적으로 존재한다면! if문 실행
		if(f.exists()) {
			try {
				
				fr = new FileReader(f);
				int read = -1;
				
				//char기반의 스트림인 FileReader는
				//read()를 통해 데이터를 읽어올 때 2byte단위로 가지고 온다.
				
				//더이상 읽어올 것이 없을 때까지!
				while((read = fr.read()) != -1) {
					//아스키 코드가 아닌 유니코드로 표현된다.//byte[]에 담을 필요 없다.
					//Reader는 1byte데이터를 읽지 않고 char(문자) 2byte씩 읽는다.(한글이 한글자씩 가능하다.)
					//(char)로 형변환 해준다면..한글이 문제없이 출력!
					System.out.print((char)read );
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				try {
					fr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
	}//main
}
