package ex1_continue;

public class Ex1_Continue {
	public static void main(String[] args) {

		int n = 0;

		while(n < 10) {
			n++;

			//2를 나눴을 때, 나머지가 0 (2의 배수)
			if(n % 2 == 0) {
				//while문 안에서 동작하는 continue는 
				//while문의 조건식으로 이동한다.

				continue;//만약 2의 배수라면 while문의 조건식으로 돌아간다.(출력x)

			}//if

			System.out.println(n);

		}//while

		System.out.println("---------------------------------------");

		//switch문에서는 continue를 사용하는 것이 불가능하지만, switch문이 반복문 안에 존재할 경우에는
		//switch안에서 continue문을 사용할 수 있다.
		
		int num = 0;

		while(num < 5) {

			num++;
			
			switch(num) {

			case 1 :
				System.out.println("아랫줄 무시");
				continue; //반복문 내에서는 switch문에도 continue 키워드를 사용할 수 있다.
				
			case 3 :
				System.out.println("아랫줄 무시2");
				//반복문 안에서의 switch가 가진 continue는
				//switch를 포장하고 있는 반복문의 증감식이나 조건식으로 이동한다.
				continue;			
			}//switch
			
			System.out.println(num);
		}//while

	}//main

}
