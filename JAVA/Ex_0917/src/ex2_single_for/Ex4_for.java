package ex2_single_for;

import java.util.Scanner;

public class Ex4_for {
	public static void main(String[] args) {

		//키보드에서 n1, n2의 정수값을 입력받는다.
		//n1부터 n2까지의 합을 출력!
		//(예를 들어 2와 5를 받았다면 2+3+4+5인 14를 출력)
		
		//수1 : 2
		//수2 : 5
		//결과 : 14
		
		//수1: 5
		//수2: 2
		//결과 : 14
		
		Scanner sc = new Scanner(System.in);
		System.out.print("수1 : ");
		int n1 = sc.nextInt();
		
		System.out.print("수2 : ");
		int n2 = sc.nextInt();
		
		int sum = 0;
		
		//스왑(두 변수의 값을 바꾸는 코드)
		if(n1 > n2) { //n3를 지역변수로 만들어준다.(값을 임시로 저장하는 용도..)
			int n3 = n1;
			n1 = n2;
			n2 = n3;
		}//if
		
		for(int i = n1; i <= n2; i++) {		
			sum+=i;
		}//for
		System.out.println("결과 : " + sum);
		
		
		
	}//main
}

















