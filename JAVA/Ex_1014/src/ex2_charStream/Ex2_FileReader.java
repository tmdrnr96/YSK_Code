package ex2_charStream;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Ex2_FileReader {
	public static void main(String[] args) {

		//test.txt를 charStream으로 읽어온 후
		//읽어온 데이더에 알파벳 대문자와 소문자가 각각 몇개씩 있는지 출력!

		//소문자 : 18
		//대문자 : 10

		FileReader fr = null;
		File f = new File("C:\\YSK\\java_0914_ysk\\test.txt");

		int lower = 0;
		int upper = 0;

		if(f.exists()) {
			
			try {
				
				fr = new FileReader(f);				
				int code = -1;
				
				//***fr.read()가 읽으면서 code에게 정수 값을 넘겨준다.*** 
				while((code = fr.read()) != -1) {

					if(code >= 'a' && code <= 'z') {
						lower++;

					}else if(code >= 'A' && code <= 'Z') {
						upper++;
					}
				}
				System.out.println("소문자 : " + lower);
				System.out.println("대문자 : " + upper);
			} catch (Exception e) {
			
				e.printStackTrace();
			}finally {
				try {
					fr.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
				
			}
		}
	}//main
}
