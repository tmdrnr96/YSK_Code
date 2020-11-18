package ex4_try_catch;

import java.util.Scanner;

public class Ex3_try_catch {
	public static void main(String[] args) {

		//정수 : 10
		//결과 : 10
		
		//정수 : a10
		//정수만 입력하세요
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("정수 : ");
			int n = sc.nextInt();		
			System.out.println("결과 :" + n);
			
		} catch (Exception e) {
			System.out.println("정수만 입력하세요");
		}
		
		
		
	}//main
}
