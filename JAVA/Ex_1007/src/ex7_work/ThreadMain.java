package ex7_work;

import java.util.Random;
import java.util.Scanner;

public class ThreadMain {
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
	
	public static void main(String[] args) {
		
		int count = 0;
		
		Threadsub ts = new Threadsub();
		Thread t = new Thread(ts);
		
		Scanner sc = new Scanner(System.in);
		
		 out : while(true) {
				
		int n1 = new Random().nextInt(100) + 1;
		int n2 = new Random().nextInt(100) + 1;
		
		System.out.printf("%d + %d = ", n1,n2);
		t.start();
		int result = sc.nextInt();
		
		if(result == n1 + n2) {
			System.out.println("정답!");
			count++;
			
		}else {
			System.out.println("오답...");
		}
		if(count == 5) {
			ts.setCount(count);
			break out;
		}
		}//while
	}//main

}
