package ex2_io;

import java.io.File;

public class Ex3_File {
	public static void main(String[] args) {

		//파일클래스가 접근할 path경로
		//File 클래스에 경로를 바로 넣어도 상관없다(오버로딩 되어 있음..)
		File f = new File("C:\\YSK");

		
		//하위 목록에서 하위목록을 검색할 수 있다.
		
		if(f.isDirectory()) { //f의 접근한 경로가 폴더형식이라면..!
			//f의 하위 요소들을 File클래스 형식으로 받는다.
			File[] ar = f.listFiles();
			//file클래스를 배열로 받았을 경우, 폴더 파일, 용량, 폴더인지 파일인지 구분 가능...
			for(int i = 0; i < ar.length; i++) {

				if(ar[i].isDirectory()) {//f의 접근한 경로가 폴더형식이라면..!
					System.out.println(ar[i].getName());
				}//if
			}//for
		}
		
	}//main
}
