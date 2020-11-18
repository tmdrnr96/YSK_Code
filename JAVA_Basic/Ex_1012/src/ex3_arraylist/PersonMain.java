package ex3_arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonMain {
	public static void main(String[] args) {

		//		id :aaa
		//		pwd : 1111
		//		aaa, 1111
		//		----------------------------
		//		id :bbb
		//		pwd : 2222
		//		aaa, 1111
		//		bbb, 2222
		//		----------------------------
		//		id:bbb
		//		pwd:3333
		//		이미 등록된 아이디 입니다.
		//		----------------------------
		//		id :

		ArrayList<Person> arr = new ArrayList<Person>();

		Scanner sc = new Scanner(System.in);

		//		Person p1 = new Person(); //1) 아래 있는 메모리 구조 확인 

		out:while(true) {
			Person p1 = new Person(); //2) 아래 있는 메모리 구조 확인

			System.out.print("id :" );
			p1.setId(sc.next());

			System.out.print("pwd : ");
			p1.setPwd(sc.nextInt());

			//아이디 중복체크
			for(int i = 0; i < arr.size(); i++) {
				if(p1.getId().equalsIgnoreCase(arr.get(i).getId())) {
					System.out.println("이미 등록된 아이디 입니다.");
					continue out;
				}//if
			}//for

			arr.add(p1);

			for(int i = 0; i < arr.size(); i++) {					
				System.out.printf("%s, %d\n", arr.get(i).getId(), arr.get(i).getPwd());
			}//for

			System.out.println("----------------------------");
		}//while

		/* 1) 메모리 구조
		 * stack   | heap
		 * --------|-----------
		 * arr     | 0 <---arr 새로운 방이 성생되면서 주솟값 공유
		 *         | 1 <---arr 또한 p1은 공유하게된다..(주소를 참조하게 되어서..)
		 *         | 		따라서 arr안에는 모두 p1의 주솟값을 공유하게 된다.
		 *         |
		 * p1      | id : aaa	<-- 값이 계속 바뀌면서 모든 인덱스에 값을 공유한다..
		 *         | pwd :1111
		 * 
		 */

		/* 2) 메모리 구조
		 * stack   | heap
		 * --------|-----------
		 * arr     | 0  <---arr 새로운 방이 성생되면서 주솟값 공유
		 *         | 1  <-- 새롭게 객체생성을 한 p1의 새로운 집주소를 공유받는다.
		 *         | 		
		 *         |
		 * p1      | id : aaa	<- p1이 집주소가 바뀌었는데도 불구하고 arr[0]에서 참조하기 때문에
		 *         | pwd :1111		가비지컬렉터에 의해 제거되지 않고 값이 유지된다.
		 *         |
		 * p1      | id : aaa	<-while문을 돌면서 새롭게 p1은 새롭게 객체생성을 하기 때문에 이전 집주소는
		 *         | pwd :1111		잊고 새로운 주소로 만들어진다.
		 *         
		 * 
		 */


	}//main
}
