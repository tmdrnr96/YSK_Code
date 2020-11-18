package ex1_arraylist;

import java.util.ArrayList;

public class Ex1_ArrayList {
	public static void main(String[] args) {

		//ArrayList : 컬렉션의 한 종류로써 List를 구현하는 대표적인 자식클래스
		//index의 길이에 제한이 없고, index번호로 직접 접근이 가능하다는 장점이 있다.

		ArrayList<Integer> list = new ArrayList<Integer>();

		//stack | heap
//		--------|-------
//		 list   | 빈 터만 잡혀져 있다.

		list.add(100);
		list.add(20);
		list.add(30);
		list.add(300);
		list.remove(2); //2번째 index인 30을 제거
		//remove를 통해 해당하는 value 값을 삭제하는 set과는 다르게 arrayList는 해당 index값을 지운다.
		//링크리스트는 remove시에 삭제 인덱스를 없애기 전에 삭제할 대상의 앞뒤를 미리 연결을 해준후.. 
		//삭제를 해줘야하지만, 자바의 arrayList는  remove만 해준다면 자동으로 대상을 이어준 후에 삭제가 가능하다.(arrayList 더 편안함..)
		list.add(100);
		//arrayList는 중복된 값을 제거하는 기능을 가지고 있지 않다.(중복값 허용..)
		list.set(2, 200);//2번째 index의 데이터를 200으로 수정
		list.add(1,500);//1번째 index에 데이터 500을 추가!(원하는 index에 값을 추가할 수 있다.)
		//1번째 index에 있던 데이터부터 index가 1개씩 뒤로 밀려난다.
		//		list.clear(); //--> list가 가진 모든 내용을 제거(size()를 0으로 만든다.)

		//remove(삭제), set(수정), add(값 추가), clear(size 0으로 만들기(리스트를 전부 비우고 싶을 때 사용..))

		System.out.println(list.get(2)); //index로 접근해서 원하는 값만 출력이 가능하다.

		//stack | heap
		//		--------|-------
		//		 	    | 100 
		//		 list   | 20
		//		 	    | 30
		// 	    		| 300

		// 배열과 같이 방번호가 순차적으로 있지 않다.


		System.out.println(list);
		System.out.println("길이  : " + list.size());

		System.out.println("---------------------------------------------");

		//for문을 사용하여 리스트가 가진 모든 데이터를 화면에 출력

		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		

	}//main
}
