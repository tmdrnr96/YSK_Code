package ex3_fileinput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex2_FileInput {
	public static void main(String[] args) {

		String path = "C:\\YSK\\JAVA\\test.txt";
		File f = new File(path);
		byte[] read = new byte[(int)(f.length())]; 
		//byte는 용량에 맞춰서 배열을 생성해주는 것이 좋다.(f.length)
		//글자를 1byte씩 배열로 담아주고, 이를 다시 String의 문자열로 바꿀수 있다.
		//보통 음악, 그림 등을 전송할 때 사용되고 한글로는 출력을 잘안함..
		
		FileInputStream fis = null; //전역변수로 만든다. fis.close();를 try/Catch 밖에 쓰기 위해서.. 
		
		//해당 경로까지 존재한다면 true
		if(f.exists()) {
			
			try {
				fis = new FileInputStream(f);
				//위 경로가 무조건 존재한다는 보장이 없기때문에 FileNotFoundException 가능성이 있음..
				fis.read(read);//fis가 읽어온 내용을 read배열에 1byte씩 저장
				
				//read라는 byte배열을 문자열 result로 변경!(알아서 문자열로 바꿔준다..)
				String result = new String(read); //String을 객체생성 하는 경우...
				
				System.out.println(result);
				
				
			} catch (Exception e) {
			
				e.printStackTrace();
				
			}finally {
				
				try {
					//finally영역 안에서 스트림을 닫아주면
					//예외 유무에 상관없이 스트림을  닫을 수 있기 때문에 유용하다.
					fis.close();
				} catch (IOException e) { //fis를 read할 때, 갑자기 파일이 없어지거나 정정되는 상황... (IOException이 발생할 수 있음)
					e.printStackTrace();
				}
			}
			
		}
	}//main
}
