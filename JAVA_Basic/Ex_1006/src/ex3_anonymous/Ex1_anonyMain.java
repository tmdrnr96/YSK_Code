package ex3_anonymous;

import java.util.Random;
import java.util.Scanner;

public class Ex1_anonyMain {
	public static void main(String[] args) {

		//익명클래스 : 이름(객체명을 지정하지 않은)이  없는 클래스
		//한두번 사용하고 버려지는 객체를 생성할 때 유용하게 쓰인다.
		
		Scanner sc = new Scanner(System.in);
		//sc객체를 생성하면서 메모리에 공간이 할당된다.
		sc.nextInt();
		sc.next();

		//sc라는 변수명을 가지고 얼마든지 필요할 때 쓸수있다.
		//메모리에 할당 받아 놓으면 필요할 때마다 쓴다.

		
		Random rnd = new Random();
		for(int i = 0; i < 5; i++){
			int num = rnd.nextInt(5)+1; //익명이 아님..
		}

		
		int n = new Random().nextInt(5)+1; // 익명객체
		//반복적으로 난수를 생성할 시에 메모리가 낭비된다. 하지만
		//한번만 필요하다면 익명으로 만들어 주는 것이 좋다.
		//익명은 사용직후 메모리에서 날아간다.
		
		/*   stack  | heap
		 *    n     | Random();
		 *    
		 *    n이  heap메모리를 참조하는 것이 아니라 heap에서 n으로 값을 준다.
		 * 
		 * */
	}//main
}
