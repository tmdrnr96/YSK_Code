package ex1_string;

import java.util.Scanner;

public class Ex5_String {
	public static void main(String[] args) {
		
		//키보드에서 값을 입력받고, 회문수 인지 아닌지 판단하기!!
		
		//회문수란?
		//앞으로 읽어도 뒤에서 읽어도 똑같이 읽히는 숫자
		
		//값 : ab11ba
		//ab11ba는 회문수 입니다.
		
		//값 : asd12
		//asd12는 회문수가 아닙니다.
		
		Scanner sc = new Scanner(System.in);		
		System.out.print("값 : ");
		
		String str = sc.next();
		String str1 = "";
		
		//lenght는 1부터 시작한다.
		for(int i = str.length()-1; i >= 0; i--) {
			
			str1+=str.charAt(i);
		}
		
		
		if(str.equals(str1)) {
			System.out.println( str1 + "은 회문수 입니다.");
		}else {
			System.out.println( str1 + "은 회문수가 아닙니다.");
		}
		
	}//main

}
