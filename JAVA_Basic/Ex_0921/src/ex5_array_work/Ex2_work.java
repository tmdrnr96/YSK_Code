package ex5_array_work;

import java.util.Scanner;

public class Ex2_work {
	public static void main(String[] args) {

		//배열의 길이는? : 5

		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 길이는? : ");
		int n = sc.nextInt();

		char[] ch = new char[n] ;
//		ch[0] = 'A';
		
		for(int i = 0; i < ch.length; i++ ) {
			ch[i] = (char)('A' + i);
//			ch[i] += (char)i; //ch[0]에 값을 임시로 넣었지만 ch[1]부터는 값이 없기 때문에 값이 이상하게 뜬다..
			
			System.out.print(ch[i] + " ");	
			
		}//for



	}//main
}
