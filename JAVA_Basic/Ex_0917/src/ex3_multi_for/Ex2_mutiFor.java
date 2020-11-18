package ex3_multi_for;

public class Ex2_mutiFor {
	public static void main(String[] args) {

		//1 2 3 4 5 6 7 8 9 10
		//2 3 4 5 6 7 8 9 10 1
		//3 4 5 6 7 8 9 10 1 2
		//         ...
		//10 1 2 3 4 5 6 7 8 9


		for(int i = 1; i <= 10; i++) {
			for(int j = i; j < 10+i; j++) {
				if(j > 10) {
					System.out.print(j - 10 + " ");
				}else {		
					System.out.print(j + " ");
				}
			}//inner
			System.out.println();
		}//outer

		System.out.println("-----------------------------");

		for(int i = 1; i <= 10; i++) {
			for(int j = 0; j < 10; j++ ) {

				int num = i + j;

				if(num > 10) {
					num-=10;
				}

				System.out.print(num+ " ");
			}//inner

			System.out.println();

		}//outer


		System.out.println("-----------------------------");


		//		  *
		//      * * * 
		//    *	* *	* *
		// 	* * * * * * *
		//* * * * * * * * *


		for(int i = 0; i <= 5; i++) {
			for(int j = 1; j <= 5 + i; j++) {
				if(i + j <= 6) {
					System.out.print("  ");
				}else {
					System.out.print("* ");
				}
			}//inner
			System.out.println();
		}//outer

		System.out.println("-----------------------------");

		for(int i = 0; i < 5; i++ ) {
			for(int j = 0; j < 5 + i; j++) {
				if(i + j <= 3) {
					System.out.print("  ");
				}else {
					System.out.print("* ");
				}
			}//inner

			System.out.println();
		}//outer


		System.out.println("-----------------------------");
	}//main
}
