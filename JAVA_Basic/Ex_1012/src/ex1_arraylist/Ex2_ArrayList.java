package ex1_arraylist;

import java.util.ArrayList;

public class Ex2_ArrayList {
	public static void main(String[] args) {

		//현재 추가되어 있는 list의 순서를 아래의 list의 순서대로 출력하시오
		//[홍길동, 신사임당, 박길동, 김순신]
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("홍길동");
		list.add("박길동");
		list.add("이순신");
		list.add("강감찬");
		System.out.println(list);
		
		list.add(1,"신사임당");
		list.set(3, "김순신");
		list.remove(4);
		System.out.println(list);
		
	}//main
}
