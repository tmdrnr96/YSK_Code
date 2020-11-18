package ex2_lotto;

import java.util.Random;

public class Ex1_work {
	public static void main(String[] args) {

		//변수 money에 10 ~ 5000원까지의 난수를 발생시켜 넣는다.

				//단, 3450, 2100...과 같이 1의 자리 숫자는 반드시 0이 되도록 생성

				// 발생한 난수 money를 동전으로 바꿨을때
				//500, 100, 50, 10원짜리 동전 각각 몇개 거슬러 지는지 판단하는
				//로직(코드)을 구현
				//
				//단, 가능한 가장 적은수의 동전으로 거슬로 주어야 하며 coin배열을
				//반드시 사용할 것.

				//결과
				//금액 : 2590 // 난수
				//500원 : 5
				//50원: 1
				//10원 : 4
		
		int[] money = {500, 100, 50, 10};
		
		int a = 0;
		
		int n = new Random().nextInt(500)+1;
		n*=10;
		System.out.println("금액 : " + n + "원 ");
		
		for(int i = 0; i < money.length; i++) {
			
			if(n > money[i]) {
				a = n / money[i];
			}//if
			
			System.out.println(money[i] + "원 : " + a  );
			n %= money[i];
		}//for
		
	}//main
}
