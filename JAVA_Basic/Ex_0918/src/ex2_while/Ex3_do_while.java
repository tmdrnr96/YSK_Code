package ex2_while;

import java.util.Random;

public class Ex3_do_while {
	public static void main(String[] args) {

		//java, jsp, android의 시험을 봤다.
		//각 과목별 점수는 랜덤으로 0 ~ 130 점을 대입
		//do-while을 통해 과목별 점수중 한가지라도
		//100점이 넘는 과목이 있다면 재실행
		//최종적으로 세 과목의 점수가 모두 100점 이하일 때 do- while을 빠져나온다.
		//점수를 화면에 출력

		//java : 87
		//jsp : 49
		//and : 100

		int java = 0;
		int jsp = 0;
		int and = 0;
		
		boolean t = true;

		do {
			//컨트롤 + 알트 + 화살표 밑에 방향 (복사) 
			java = new Random().nextInt(131);//0부터 130까지의 난수
			jsp = new Random().nextInt(131);
			and = new Random().nextInt(131);

			if(java < 100 && jsp < 100 && and < 100) {
				
				System.out.println("java : " + java);
				System.out.println("jsp : " + jsp);
				System.out.println("and : " + and);				
				t = false; 
			}
			
		}while(t);

		System.out.println("----------------------------------");
				
		do {
			
			java = new Random().nextInt(131);//0부터 130까지의 난수
			jsp = new Random().nextInt(131);
			and = new Random().nextInt(131);
			
		}while(java > 100 || jsp > 100 || and > 100); //세 과목이 100점을 넘어가면 while문 재실행..
		
		System.out.println("java : " + java);
		System.out.println("jsp : " + jsp);
		System.out.println("and : " + and);	



	}//main

}
