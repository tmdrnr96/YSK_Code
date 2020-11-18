package ex3_collection;

import java.util.HashMap;
import java.util.Scanner;

public class Ex4_Map {
	public static void main(String[] args) {

//		//id : hong
//		//pwd : 3333
//		//비밀번호가 일치하지 않습니다.
//		
//		//id : john
//		//pwd : 1111
//		//아이디가 존재하지 않습니다.
//		
//		//id :hong
//		//pwd :2222
//		//로그인 성공!!
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("kim", 1111);
		map.put("hong", 2222);
		map.put("lee", 3333);
		map.put("park", 4444);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("id : ");
		String id = sc.next();
		
		System.out.print("pwd : ");
		int pwd = sc.nextInt();
		
		if(map.containsKey(id)) {
			//아이디가 존재하는 경우 비밀번호 비교
			if(map.get(id) == pwd ) {
				
				System.out.println("로그인 성공!!");
				
			}else {
				System.out.println("비밀번호가 일치하지 않습니다.");
			}
		}else {
			System.out.println("아이디가 존재하지 않습니다");
		}
	}//main
}
