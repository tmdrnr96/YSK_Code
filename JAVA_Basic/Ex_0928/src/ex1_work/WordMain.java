package ex1_work;

import java.util.Scanner;

public class WordMain {
	public static void main(String[] args) {

		WordScramble ws = new WordScramble();
		String answer = ws.getAnswer();//정답을 받는다.

		//가지고 온 정답을 섞어준다.
		String qustion = ws.getQuestion(answer);


		System.out.println("문제 : " + qustion);

		Scanner sc = new Scanner(System.in);
		
		//사용자가 입력받은 값과 문제의 정답이 일치하는지 확인
		while(true) {
			System.out.print("정답 : ");
			String str = sc.next();

			if(str.equalsIgnoreCase(answer)) {
				System.out.println(str + "정답!");
				break;
			}else {
				System.out.println(str + "오답...");
			}
		}
	}//main

}
