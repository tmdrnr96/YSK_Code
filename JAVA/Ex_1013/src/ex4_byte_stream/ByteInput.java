package ex4_byte_stream;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ByteInput {
	public static void main(String[] args) {

		FileInputStream fis = null;

		byte[] read = new byte[100];
		byte[] keyboard = new byte[100];

		try {
			
			System.out.print("경로 : ");
//			Scanner sc= new Scanner(System.in);//System.in : byte기반의 InputStream
			System.in.read( keyboard ); //읽은 내용을 keyboard에 담는다.
			
			String path = new String(keyboard).trim();//keyboard의 내용을 String으로 바꾸고 공백을 지워준다.
			
			fis = new FileInputStream(path);
			fis.read(read);
			
			System.out.println(new String(read).trim());
			
		} catch (Exception e) {

		}finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}//main
}
