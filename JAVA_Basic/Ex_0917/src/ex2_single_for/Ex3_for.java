package ex2_single_for;

import java.util.Scanner;

public class Ex3_for {
	public static void main(String[] args) {

		//키보드로 정수를 입력받는다.
		//1부터 입력받은 값까지의 합을 계산하여 출력
		//예를 들어 5를 입력받았다면 1 + 2 + 3 + 4 + 5인 15를 출력해야한다.
		
		int n = 0;
		int sum = 0;//결과값을 출력할 변수
				
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			sum+=i;
		}
		System.out.println("결과 : " + sum);
		
		System.out.println("-------------------------------------");
		
		
		
	}//main
}
