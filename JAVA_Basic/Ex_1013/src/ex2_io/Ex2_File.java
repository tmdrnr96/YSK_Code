package ex2_io;

import java.io.File;

public class Ex2_File {
	public static void main(String[] args) {

		//파일클래스가 접근할 path경로
		String path = "C:\\YSK"; //폴더의 하위목록 출력
		File f = new File(path);
		
		//파일이 아닐 때 if문을 실행
		if(!f.isFile()) { //f.isDrectory()도 가능 (폴더 일 때 if문 실행)  
			//File클래스의 접근 경로가 폴더 일 경우
			
			//f.list():f의 경로상에 있는 하위요소의 이름만 가져온다.
			String[] names = f.list();//String[]로 반환된다.
			//list : 내가 접근한 경로의 폴더의 하위 목록을 알파벳 순서대로 String배열로 담겨진다.
		
			for(int i = 0; i < names.length; i++) {
				
				System.out.println(names[i]);
			}
		
		}
		
		
		
	}//main
}
