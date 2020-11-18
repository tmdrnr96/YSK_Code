package ex1_string;

import java.util.Scanner;

public class Ex4_String {
	public static void main(String[] args) {

		//키보드에서 이메일을 입력받고 @앞의 id가 6미만 10초과일 경우
		//형식이 올바르지 않다는 메시지 출력하기

		//메일 : abc@naver.com
		//이메일 형식이 올바르지 않습니다.

		//메일 : aabbcc@naver.con
		//aabbcc님 환영합니다.

		Scanner sc = new Scanner(System.in);
		System.out.print("메일 : ");
		String email = sc.next();

		String id = email.substring(0, email.indexOf('@'));
		int n = id.length();
		
		//앞에 조건식이 참이면 뒤에는 실행 하지않음...
		//앞에 조건식이 거짓이라면 뒤에 식을 실행...
		if(n < 6 || n > 10 ) {
			System.out.println("이메일 형식이 올바르지 않습니다.");
		}else {
			System.out.println(id + "님 환영합니다.");
		}

		
	}//main

}
