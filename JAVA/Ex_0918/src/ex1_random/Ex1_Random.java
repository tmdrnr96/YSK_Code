package ex1_random;

import java.util.Random;

public class Ex1_Random {
	public static void main(String[] args) {
		
		//1 ~ 5사이의 난수
		//new Random().nextInt(난수의 범위) + 시작수;
		int num = new Random().nextInt(5) + 1;

		System.out.println(num);
		
		//2 ~ 4사이의 난수
		//new Random().nextInt(난수의 범위) + 시작수;
		num = new Random().nextInt(3) + 2;
		
		System.out.println(num);
		
		//4 ~ 10사이의 난수
		//new Random().nextInt(난수의 범위) + 시작수;
		num = new Random().nextInt(7) + 4;
				
		System.out.println(num);
		
		//14321 ~ 22148사이의 난수
		//new Random().nextInt(난수의 범위) + 시작수;
		//new Random().nextInt(큰 수 - 작은 수 + 1) + 시작수;
		num = new Random().nextInt(22148 - 14321 + 1) + 14321;
						
		System.out.println(num);
		
		System.out.println("----------------------------------");
		//난수로 알파벳 대문자들 중 하나를 출력하자
		//결과 : 
		
		int rnd = new Random().nextInt(26) + 65;
		char ch = (char)rnd;
		System.out.println(ch);
		
		System.out.println("----------------------------------");
		
		int random = new Random().nextInt('Z'-'A') + 'A';
		System.out.println((char)random);
		
		System.out.println("----------------------------------");
		
	}//main

}
