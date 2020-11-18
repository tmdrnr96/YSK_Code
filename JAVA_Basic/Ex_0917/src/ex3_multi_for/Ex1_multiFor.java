package ex3_multi_for;

public class Ex1_multiFor {
	public static void main(String[] args) {

		//다중for문 (multi_for) : for문 안에 for문이 포함되어 있는 경우
		//1 2 3
		//1 2 3
		
		for(int i = 1; i <= 2; i++) { //y출(세로)행
			for(int j = 1; j <= 3; j++) {//x축(가로)열
				System.out.print(j + " ");
			}//inner
			System.out.println();//줄바꿈 코드
		}//outer
		
		System.out.println("------------------------");
		
		//1 2 3 4 5
		//1 2 3 4 5
		//1 2 3 4 5
		
		for(int i = 1; i <= 3; i++) { 
			for(int j = 1; j <= 5; j++) {
				System.out.print(j + " ");
			}//inner
			System.out.println();
		}//outer
		
		System.out.println("------------------------");
		
		
		
		
	}//main
}
