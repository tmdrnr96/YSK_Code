package ex3_fileinput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex3_FileInput {
	public static void main(String[] args) {

		//file.txt의 내용을 읽어 회문수인지 아닌지를 판단

		String path = "C:\\YSK\\JAVA\\test.txt";
		File f = new File(path);
		byte[] read = new byte[(int)f.length()];

		FileInputStream fis = null;

		String rev = "";
		
		if(f.exists()) {
			try {
				fis = new FileInputStream(f);	
				fis.read(read);//원본데이터를 읽어서 read배열에 담는다.

				String str = new String(read);//read배열의 값을 문자열로 변경
				
				//원본을 뒤집어서 rev에 저장
				for(int i = str.length()-1; i >= 0; i--) {
					rev += str.charAt(i);	
				}//for
				
				//회문수 판단
				if(rev.equals(str)) {
					System.out.println("회문수 입니다.");
				}else {
					System.out.println("회문수가 아닙니다.");
				}

			} catch (Exception e) {

				e.printStackTrace();
				
			}finally {
				try {
					fis.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			}

		}
	}//main
}
