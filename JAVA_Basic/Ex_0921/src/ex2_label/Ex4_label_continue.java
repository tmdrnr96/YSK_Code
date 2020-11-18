package ex2_label;

public class Ex4_label_continue {

	public static void main(String[] args) {
		//label을 사용할 때와 사용하지 않을 때를 구분해야한다.
		//반복문이 1개면 굳이 사용할 필요 없음. 하지만 반복문이 2개 이상이라면 사용!
		
		int n = 0;
		
		out : while( n < 10 ) {
			n++;
			
			switch(n) {
			case 2 : 
			case 4 :
				System.out.println("switch실행 @@");
				continue out;
				
				//continue를 사용할 때와 break를 사용할 때, 결과값은 다르게 나온다.
			}
			
			
			System.out.println(n + " ");
			
		}//while

	}//main

}
