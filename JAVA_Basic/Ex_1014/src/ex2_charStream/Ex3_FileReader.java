package ex2_charStream;

import java.io.FileReader;

public class Ex3_FileReader {
	public static void main(String[] args) {
		//Ex2_FileReader문제 강사코드..
		//test.txt를 charStream으로 읽어온 후
		//읽어온 데이더에 알파벳 대문자와 소문자가 각각 몇개씩 있는지 출력!

		//소문자 : 18
		//대문자 : 10

		FileReader fr = null;
		
		
		try {
			
			fr = new FileReader("C:\\YSK\\java_0914_ysk\\test.txt");
			int read  = -1;
			int upper = 0;//대문자의 갯수
			int lower = 0;//소문자의 갯수
			
			while((read = fr.read())!= -1) {
				if(read >= 'A' && read <= 'Z') {
					upper++;//대문자 발견
				}
				if(read >= 'a' && read <= 'z') {
					lower++;//소문자발견
				}
			}//while
			
			System.out.println("대문자 : " + upper);
			System.out.println("소문자 : " + lower);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}//main
}
