package ex2_label;

public class Ex1_label_break {
	public static void main(String[] args) {

		//label : 가장 가까운 반복문만을 제어하는 break,continue와 달리
		//한번에 두 개 이상의 반복문을 제어할 수 있도록 하는 키워드

		outer: for(int i = 1; i <= 2; i++) {			
			for(int j = 1; j <= 5; j ++) {

				if(j % 2 == 0) {
					break outer;
				}
				System.out.print(j + " ");

			}//inner
			System.out.println();
		}//outer

	}//main

}
