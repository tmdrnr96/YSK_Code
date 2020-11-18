package ex2_arraylist;

import java.util.ArrayList;

public class UserAarray {
	public static void main(String[] args) {

		ArrayList<User> arr = new ArrayList<User>();
		//오로지 User객체만 저장할 수 있는 ArrayList!
		//클래스로 제너릭타입으로 만들면 여러가지 요소를 한번에 저장할 수 있다는 장점있다.
		//ex) 한 사람의 정보를 한번에 저장할 수 있다(이름, 나이, 전화번호 등등..)
		//제너릭타입으로 일반 타입으로 집어 넣으면 한사람의 정보를 출력하기 위해선
		//ArrayList가 여러개 필요.. 낭비..
		
		User u1 = new User();
		u1.setName("홍길동");
		u1.setAge(20);
		
		User u2 = new User();
		u2.setName("임꺽정");
		u2.setAge(30);
		
		arr.add(u1);
		arr.add(u2);
		
		System.out.println(arr);
		
		/*	steak    |    heap
		 * ----------|----------
		 * 	arr		 |	0  <-- u1의 주솟값을 그대로 가져온다.
		 * 		 	 |  1  <-- u2의 주솟값을 그대로 가져온다.
		 * 			 |
		 *  u1		 |  n : 홍길동
		 * 			 |  a : 20
		 * 			 |
		 	u2 		 | 	n : 임꺽정
		 			 |  a : 30
		
		 * arr.get(0).getAge(); --> 20 //u1의 나이 출력
		 * arr.get(1).getAge(); --> 30 //u2의 나이 출력
		 
		 */
		
		for(int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i).getName());
			System.out.println(arr.get(i).getAge());
		}
		
		
		
		
	}//main
}
