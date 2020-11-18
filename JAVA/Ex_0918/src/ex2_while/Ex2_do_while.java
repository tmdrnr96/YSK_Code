package ex2_while;

public class Ex2_do_while {
	public static void main(String[] args) {

		//do-while : 선처리, 후 비교
		// 제어문 중에 유일하게 세미콜론(;)으로 끝난다.
		int i = 8;
		//문법
		do{
			
			System.out.println(i++);

		}while(i <= 10);
		
	}//main
}
