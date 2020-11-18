package ex1_for_work;

import java.util.Scanner;

public class Ex1_single_Work {
	public static void main(String[] args) {

		//단 :8
		// 8 * 1 = 8
		// 8 * 2 = 16
		//....
		// 8 * 9 = 72

		// 1단, 10단 이상은 x

		Scanner sc = new Scanner(System.in);
		System.out.print("단 : ");
		int dan = sc.nextInt();

		if(dan > 1 && dan < 10) {

			for(int i = 1; i <= 9; i++) {
				System.out.println(dan + " * " + i + " = " + dan*i);

			}
		}else {
			System.out.println("2단~9단까지 가능합니다.");
		}
		System.out.println("------------------------");
		
		//키보드에서 정수 n에 값을 입력받는다.
				//1부터 입력받은 n까지의 합을 계산하여 결과를 출력.
				//(예를 들어 키보드에서 5를입력 받았다면 1+2+3+4+5의 결과인
				//15가 출력되면 돤다.)

				//정수 : 5
				//결과 : 15
		
		int sum = 0;
		System.out.print("정수 : ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++ ) {
			sum+=i;
		}
		System.out.println("결과 : " + sum );
		
		System.out.println("------------------------");
		
		//키보드에서 정수 n1과 n2를 각각 입력 받는다.
				//n1 ~ n2까지의 합을 계산하여 출력
				//(예를 들어 2와 5를 받았다면 2+3+4+5의 결과인 14가 출력!)

				//수1 : 2
			    //수2 : 5
				//결과 : 14
				
				//수1 : 5
				//수2 : 2
				//결과 : 14
		
		int su3 = 0;
		int res = 0;
		
		System.out.print("수1: ");
		int su1 = sc.nextInt();
		
		System.out.print("수2: ");
		int su2 = sc.nextInt();
		
		if(su1 > su2) {	
			su3 = su1;
			su1 = su2; 
			su2 = su3;		
		}//if
		
		System.out.println(su1 + "," + su2);
		
		for(int i = su1; i <= su2; i++ ) {
			res+=i;
			
		}//for
		System.out.println("결과 : " + res);
	}//main

}
