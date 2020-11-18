package ex1_string;

import java.util.Scanner;

public class Ex3_String {
	public static void main(String[] args) {

		//키보드에서 아무값이나 마구잡이로 입력을 받는다.
		//입력받은 문장에 소문자 a가 몇 개 있는지 화면에 출력하시오.

		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		String str = sc.next();

		int count = 0;
		
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(c == 'a') {
				count++;
			}//if
			
		}//for
		System.out.println("a의 갯수 : " + count);
		
	}//main

}
