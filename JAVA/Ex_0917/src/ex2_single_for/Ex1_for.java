package ex2_single_for;

public class Ex1_for {
	public static void main(String[] args) {
		
		//for문 : 특정 명령을 원하는 만큼 반복적으로 수행하기 위한 반복문
		//for(초기식; 조건식; 증감식){
		//	조건식이 참일 때 실행되는 영역
		//}
		
		int n = 20; //전역변수
		//전역변수는 재활용이 가능하다.
		//하지만 전역변수로 사용된 변수 이름은 지역변수로 사용할 수 없다.
		
		for(int i = 0; i < 3; i++){
			
			//i와 같이 특정 영역안에서 초기화되어 만들어진 변수를 지역변수라고 부른다.
			//지역변수는 해당 영역을 빠져나가는 순간 사용할 수 없다.
			System.out.println("i : " + i);
			
		}//for
		
		/* for문
		 1. 초기식
		 2. 조건식
		 3. (조건식이 참일 경우..)for문 안으로 들어온다.
		 4. 증감식
		 5. 조건식
		 6. (조건식이 참일 경우..)for문 안으로 들어온다.
		 7. (1 ~ 6)조건식이 거짓일 때까지 반복!
		 */
		
		System.out.println("------------------------------------");
		
		for(int i = 10; i > 0; i--) {
			System.out.println("i : " + i);
		
		}//for
		
		System.out.println("------------------------------------");
		
		int a = 1;//지역변수로 초기화를 안하고 전역변수를 활용하여 값을 바꿔서 활용할 수도 있다.
		for(a = 0; a <= 3; a++) {
			System.out.println("a : " + a);
		}//for
		
		System.out.println("------------------------------------");
		
		//위의 전역변수 값을 그대로 사용해서 초기식을 넘어가고 조건식으로 넘어간다.
		//초기식, 조건식이 없는 경우도 있다.(조건식이 없으면 참으로 인식해서 무한반복..)(증감식이 없는 경우도 있음)
		for(; a >= 0; a--) {
			System.out.println("a : " + a );
			
		}//for
		
		/*(무한반복) : 
		 * for(; ; ) { System.out.println("a : " + a );
		 * 
		 * }
		 */
		
		System.out.println("-----------------------------------");
		
		//문제 : 1부터 100까지 반복하는 for문을 만들고 
		//그 안에서 3의 배수만 출력하시오!
		
		int num = 3;
		
		for(int i = 1; i <= 100; i++) {
			if(i % num == 0) {
				System.out.println(i);
			}//if
			
		}//for
		
		System.out.println("------------------------------");
		
		for(int i = 1; i <= (100/num); i++ ){
			System.out.println(i * num);
		
		}//for
		
		
		
		
		
	}//main

}





















