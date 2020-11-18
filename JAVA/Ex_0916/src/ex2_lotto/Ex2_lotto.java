package ex2_lotto;

import java.util.Random;

public class Ex2_lotto {
	public static void main(String[] args) {

		int lotto[] = new int[6];
		
		out:for(int i = 0; i < lotto.length;) {
			lotto[i] = new Random().nextInt(45)+1;
			
			for(int j = 0; j < i; j++ ) {
				
				if(lotto[j] == lotto[i]) {
					System.out.print("중복된 수 : " + lotto[j]+" ");
					continue out;
				}//if				
			}//inner
			System.out.print(lotto[i] + " ");
			i++;
		}//outer
		
	}//main
}
