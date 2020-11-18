package ex1_arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class WordGameMain {
	public static void main(String[] args) {

		ArrayList<String> arr = new ArrayList<String>();
		String[] data = {"apple","banana","grape","pear"};
	
		Scanner sc = new Scanner(System.in);
		
		//***
		//기본자료형을 넘기면 복사본이 넘어간다.
		//객체를 넘기면 주소값이 넘어간다(복사본이 x)
		WordGame wg = new WordGame(arr, data);
		//주소값을 넘겼기(주소가 같기 때문) 때문에 여기서 arr과 data에 값이 추가된다면 
		//Main에서도 값이 바뀐다.
	
		wg.start();//스레드 동작
		//run메서드에 arr에 단어가 추가될 때, 시간이 필요하다.
		
		//* 스캐너를 이용한 시간 벌기..
//		Scanner sc = new Scanner(System.in);//값을 받기 위한 준비 하려면 시간이 필요함
		
		//*시간을 벌기 위해 Thread.sleep을 이용
		try {
			Thread.sleep(100);//0.1초 쉬기..
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
			
		while(true) {
			
			//게임종료 처리
			if(arr.size() == 0) {
				System.out.println("클리어!");
				wg.setPlaying(false);//스레드 정지!
				break;//while문을 빠져나온다.
			}
			
			
			System.out.println(arr);
			System.out.println(">> ");
			String in = sc.next();
			
			//사용자가 입력한 단어와 일치하는 값을 arr에서 검색
			for(int i = 0; i < arr.size(); i++) {
				if(in.equalsIgnoreCase(arr.get(i))) {
					arr.remove(i);
					break;
				}//if
			}
			
		}//while
		
	}//main
}
