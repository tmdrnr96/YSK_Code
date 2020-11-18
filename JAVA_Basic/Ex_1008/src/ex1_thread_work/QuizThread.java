package ex1_thread_work;

import java.util.Random;
import java.util.Scanner;

public class QuizThread extends Thread {
	
	// 1 ~ 100 사이의 난수 두개를 각각 발생 시키고, 이것을 더하는 문제를 출제
	//문제를 보고 키보드에서 값을 입력받아 5문제가 정답처리 될때까지 코드를 반복
	//5문제가 정답처리되면 게임이 종료되는데, 이때 총 몇초의 시간이 걸렸는지를 화면에 출력
	//단, 데몬스레드는 사용하지 않는다.

	//1 + 35 = 36
	//정답!!
	//66 + 92 = 121
	//오답...
	//....
	//48 + 9 = 57
	//정답!!
	//결과 : 24초
	
	int su1, su2;
	int timer = 0;
	int playCount = 0;//정답을 맞힌 경우에만 1씩 증가

	boolean isCheck = true;
	Random rnd = new Random();
	Scanner sc = new Scanner(System.in);


	//문제 출제 및 정답 판별 메서드

	public void startGame() {

		while(isCheck) {
			su1 = rnd.nextInt(100)+1;
			su2 = rnd.nextInt(100)+1;

			//문제출제
			System.out.printf("%d + %d = ", su1, su2);
			
			int result = sc.nextInt();
			
			//정답체크
			if(result == su1 + su2 ) {
				System.out.println("정답!");
				playCount++;//정답을 맞힌 경우에만 playCount를 1씩 증가!!
			}else {
				System.out.println("오답...");
			}
			
			//게임 종료 체크
			
		if(playCount == 5){
			System.out.printf("결과 : %d초", timer);
			isCheck = false;
		}

		}//while

	}//startGame()

	@Override
	public void run() {

		//다섯문제가 정답처리 될때까지 시간을 계산
		while(isCheck) {

			try {
				Thread.sleep(1000);
				timer++;

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}//while

	}//run
}
