package ex4_thread_work;

import java.util.Scanner;

public class ThreadMain {
	public static void main(String[] args) {

		//정수 : 5
		//5
		//4
		//3
		//2
		//1
		//0
						
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int n = sc.nextInt(); 
		
		//setter나 생성자로 값을 넘겨줄 수 있다.
		
		//생성자로 넘기는 법
//		ThreadTest t = new ThreadTest(n);
		
		ThreadTest t = new ThreadTest();
		
		//setter를 통해 값을 넘기는 법
		t.setN(n);
		t.start();
		
	}//main
}
