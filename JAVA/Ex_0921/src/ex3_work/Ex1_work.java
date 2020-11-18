package ex3_work;

import java.util.Scanner;

public class Ex1_work {
	public static void main(String[] args) {

		//키보드에서 정수를 입력받고 입력받은 정수가 
		//소수(약수가 1과 자기 자신만 있는 수) 인지 판단하는 코드를 작성

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();

		int i = 0; 

		for(i = 2; i <= num; i++) {
			if(num % i == 0) {
				break;
			}//if
		}//for
		if(i == num) {
			System.out.println( num + "은(는) 소수 입니다.");
		}else {
			System.out.println(num + "은(는) 소수가 아닙니다.");
		}

	}//main
}
