package ex3_collection;

import java.util.HashSet;
import java.util.Iterator;

public class Ex2_Iterator {
	public static void main(String[] args) {

		HashSet<Integer> set = new HashSet<Integer>();

		set.add(45);
		set.add(30);
		set.add(15);
		set.add(7);

		System.out.println(set);

		//Iterator(반복자) : 
		//Set구조는 특정 인덱스로 접근이 불가능하기 때문에
		//내용을 얻어오기 위해서는 Iterator라는 반복자를 사용해야 한다.

		//Iterator의 메서드
		//boolean hasNext(); -> 메소드는 읽어 올 요소가 남아있는지 확인하기 위한 메소드, 있으면 true없으면 false
		//Object next(); -> 메소드는 읽어 올 요소가 남아있는지 확인하기 위한 메소드, 있으면 true없으면 false
		//void remove(); -> next로 읽어온 요소를 삭제한다.

		//접근하고 싶은 객체의 타입으로 제너릭타입을 줘야한다.
		//Iterator는 인터페이스 이기때문에 직접적으로 객체를 생성할 수 없다.
		Iterator<Integer> it = set.iterator();
		//인덱스가 없던 set이 앞에 가상의 커서를 생성한다.

		//set에 추가된 내용을 arr의 배열에 옮겨 담는다.
		int[] arr = new int[set.size()];

		for(int i = 0; i < arr.length; i++){
			arr[i] = it.next();
			System.out.print(arr[i] + " ");
		}//for

		System.out.println( "\n"+ arr[2]);
	}//main

}
