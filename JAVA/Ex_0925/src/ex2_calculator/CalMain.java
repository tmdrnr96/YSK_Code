package ex2_calculator;

import java.util.Scanner;

public class CalMain {
	public static void main(String[] args) {
		
		//수1 : 5
		//수2 : 10
		//연산자 : +
		//결과 : 15
		
		//Main클래스에서는 수1, 수2, 연산자를 입력받는 작업 후
		//결과 출력은 Cal클래스에서 한다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("수1 :");
		int su1 = sc.nextInt();
		
		System.out.print("수2 : ");
		int su2 = sc.nextInt();
		
		System.out.print("연산자 : ");
		String op = sc.next();
		
		Cal c = new Cal();
		
		c.getResult(su1, su2, op);
		

	}//main

}
