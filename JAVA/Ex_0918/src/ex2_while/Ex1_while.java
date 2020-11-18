package ex2_while;

public class Ex1_while {
	public static void main(String[] args) {

		//while문 : 간편한 구성을 가진 반복문( 선 비교 후 처리 )
		//while(조건식){
		// 조건식이 참일 때 실행되는 영역! 
		//}
		
		int num = 1;
		//조건식을 먼저 비교하고 내용을 실행..
		while( num <= 5 ) {
			System.out.println(num);
			num++;
		}//while
		
//		조건식이 언제나 true이기 때문에 무한 반복하는 코드가 된다.
//		while(true) {
//			System.out.println("1");
//		}
		
	}//main
}
