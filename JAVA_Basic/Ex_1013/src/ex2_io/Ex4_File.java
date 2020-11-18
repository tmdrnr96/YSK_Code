package ex2_io;

import java.io.File;

public class Ex4_File {
	public static void main(String[] args) {
		
		String path = "C:\\YSK\\abc";
		
		File f1 = new File(path);
		
		//f1.exists : File클래스가 접근하고자하는 경로가 모두 존재한다면 true
		//C드라이브 -> YSK -> abc 이 중하나라도 경로가 존재하지 않는 다면 false 
		
		//!f1.exists() : 하나라도 존재하지 않는 다면 true
		if(!f1.exists()) {
			//f1.exists() : f1의 접근경로가 물리적으로  존재한다면 true
			System.out.println("폴더를 생성합니다.");
//			f1.mkdir();//폴더 생성 메서드 (하나의 폴더를 만들 때 사용..)
			f1.mkdirs();//폴더 생성 메서드(두개 이상의 폴더를 만들 때 사용..)
			//mkdird은 파일은 만들지 못하고 오로지 폴더만 만들 수 있다.
		}else {
			System.out.println("이미 존재하는 폴더입니다.");
		}
	}//main
}
