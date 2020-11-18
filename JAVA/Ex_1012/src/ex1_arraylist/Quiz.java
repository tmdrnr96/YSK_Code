package ex1_arraylist;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Quiz implements Runnable {

	//준비된 단어를 3초 간격으로 ArrayList에 추가하고
	//사용자가 단어를 입력하고 일치하는 값을 지워나가는
	//타자연습게임

	//[grape]
	//	>>grape
	//	[orange, banana]
	//	>>orange

	Scanner sc = new Scanner(System.in);

	ArrayList<String> list = new ArrayList<String>();
	String[] arr = {"apple", "orange", "grape", "banana"};

	boolean b = true;

	@Override
	public void run() {
		while(b) {
			int rnd = new Random().nextInt(arr.length);	
			list.add(arr[rnd]);

			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}//while
	}//run
	
	public void game() {
		while(b){	

			System.out.println(list);
			System.out.print(">> ");
			String result = sc.next();

			for(int i = 0; i < arr.length; i++) {
				if(result.equalsIgnoreCase(list.get(i))) {
					list.remove(i);
				}else if(list.size() == 0) {
					b = false;
					System.out.println("클리어");
				}
				
			}//for
		}//while


	}//game
}