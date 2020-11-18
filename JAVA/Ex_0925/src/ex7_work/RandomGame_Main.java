package ex7_work;

import java.util.Random;
import java.util.Scanner;

public class RandomGame_Main {
	public static void main(String[] args) {

		/*
			 String[] strArr = {"CHANGE", "APPLE", "DOCTOR"}
	
			-----------------------------------------
			문제 : 랜덤으로 단어가 선택된다.(단어를 랜덤으로 섞는다.)
			정답 : ealpp
			ealpp는 오답!
			정답 : apple
			apple 정답!
		 */

		String str = "";

		String[] strArr = {"CHANGE", "APPLE", "DOCTOR"};
		int n = new Random().nextInt(strArr.length);
		
		//랜덤으로 strArr에 있는 단어 출력
		System.out.println(strArr[n]);
		
		//strArr[n]에 해당하는 단어의 길이만큼 for문을 돌린다.
		for(int i = 0; i < strArr[n].length(); i++) {

			n = new Random().nextInt(strArr[n].length());

			
		}


		System.out.println(str);

		Scanner sc = new Scanner(System.in);
		System.out.print("정답 :");
		String result = sc.next();

		if(strArr[n].equalsIgnoreCase(result)) {
			System.out.println( result + "정답!");
		}else {
			System.out.println(result + "오답!");
		}




	}//main
}
