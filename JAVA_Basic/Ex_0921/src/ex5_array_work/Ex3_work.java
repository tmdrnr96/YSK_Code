package ex5_array_work;

import java.util.Random;

public class Ex3_work {
	public static void main(String[] args) {

		//숙제 !!
		//1 ~ 45사이의 난수를 발생 시켜 lotto배열에 중복되지 않게 집어넣은 후
		//화면에 출력하시오
		// 32 1 27 6 15 19
		
		int[] lotto = new int[6];
				
		out: for(int i = 0; i < lotto.length; ) {
			
			//1 ~ 45 사이의 난수를 배열의 i번째 index에 추가 
			lotto[i] = new Random().nextInt(45)+1;
			
			//중복값을 비교하는 반복문
			for(int j = 0; j < i; j++) {
			
				if(lotto[i] == lotto[j]) {
					continue out;
				}//if
				
			}//inner
			System.out.print(lotto[i] + " ");
			i++;
		}//outer
		
	
	}//main
}
