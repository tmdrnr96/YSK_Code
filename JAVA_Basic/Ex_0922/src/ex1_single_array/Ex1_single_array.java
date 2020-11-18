package ex1_single_array;

import java.util.Random;

public class Ex1_single_array {
	public static void main(String[] args) {

		//변수 money에 10~ 5000원 사이의 난수를 만든다.
		//단, 3450, 2100과 같이 1의 자리 숫자는 반드시 0으로 발생되어야 한다.

		//난수 money를 동전으로 바꿧을 때
		// 500, 100, 50, 10원짜리 동전이 각각 몇개 거슬러 지는지 판단할 것.
		//단, 가능한한 적은 수의 동전으로 거슬러 주어야 한다.

		//금액 : 2590원 <--난수
		//500원 : 5
		//50원 : 1
		//10원 : 4

		int[] coin = {500, 100, 50, 10};

		int n = 0;

		int money = (new Random().nextInt(500)+1)*10;
//		money*=10;
		System.out.println("금액 : " + money);

		for(int i = 0; i < coin.length; i++) {
			
			if(coin[i] <= money) {	
				
				n = money/coin[i];				
				money%=coin[i];
				System.out.println( coin[i] + "원 : "+ n + "개");
			}//if

		}//for

			
		
	}//main












}
