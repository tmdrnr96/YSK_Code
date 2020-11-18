package ex1_arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex3_ArrayList {
	public static void main(String[] args) {

		//id: aaa
		//[aaa]
		//arrayList에 값을 추가..
		//while문을 돌면서 id를 추가!
		//id : bbb
		//[aaa, bbb]
		//.....
		//id : aaa
		//중복된 아이디
		//id : ccc
		//[aaa, bbb, ccc]


		Scanner sc = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<>();

		 out: while(true) {
			System.out.print("id : " );
			String str = sc.next();

			//중복체크
//			if(list.contains(str)) {
//				System.out.println("아이디 중복");
//				continue out;
//			}
						
			//중복체크
			for(int i = 0; i < list.size(); i++) {
				if(str.equals(list.get(i))) {
					System.out.println(str + "은 중복된 아이디 입니다.");
					continue out;
				}//if
			}//for
			list.add(str);	
			System.out.println(list);

		}//while


	}//main
}
