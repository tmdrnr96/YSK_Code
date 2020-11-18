package ex3_collection;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class Ex1_Set {
	public static void main(String[] args) {

		//컬렉션 프레임워크 ( 직접적으로 메모리상에 인스턴스를 가지고 있지 않은 인터페이스! )
		//데이터 그룹을 다루고 표현하기 위한 단일화된 구조
		//모든 컬렉션 프레임워크는 제너릭 타입이다

		//컬렉션의 종류
		//List, Set, Map

		//Set : java.util패키지에 존재하는 인터페이스
		//특정 코드에서 중복된 값을 허용하면 안되는 경우에 사용

		//Set을 구현하는 대표적인 자식클래스들
		//HashSet : 정렬이 안되고, 중복된 값을 허용하지 않는다, 인덱스가 없기때문에 값을 꺼내오기가 번거롭다.
		//TreeSet : 오름차순 정렬이 된다.(숫자, 한글, 영어 마찬가지로 오름차순으로 된다.),중복된 값을 허용하지 않는다, 인덱스가 없기때문에 값을 꺼내오기가 번거롭다.

		HashSet<Integer> hs1 = new HashSet<Integer>();
		hs1.add(3);
		hs1.add(3);
		hs1.add(2);
		hs1.add(1);
		hs1.remove(3);
		System.out.println(hs1.size());
		System.out.println(hs1);

		//HashSet은 인덱스가 없다..
		//add를 한다고 해서 순서대로 값이 추가가 되는 것이 아니다..	
		//중복된 데이더를 허용하지 않는다.(중복된 값이 들어가면 값이 들어가지 않는다.)

		System.out.println("--------------------------------------");

		//HashSet으로 로또 번호 생성기 만들기
		HashSet<Integer> lotto = new HashSet<Integer>();

		while(true) {

			int r = new Random().nextInt(45) + 1;
			lotto.add(r); //while문을 돌면서 받은 Random값을 추가한다.
			//HashSet은 중복값을 허용하지 않기 때문에 중복체크를 할 필요가 없다.

			//중복된 값이 없기 때문에 size가 6일때 while문을 빠져나온다.
			if(lotto.size() == 6) {
				break;
			}//if

		}//while

		System.out.println(lotto);

		System.out.println("-------------------------------------");

		//제네릭 타입을 String으로 지정 

		HashSet<String> hs2 = new HashSet<String>();
		hs2.add("홍길동");
		hs2.add("정용훈");
		hs2.add("송강호");

		System.out.println( hs2 );

		System.out.println("-------------------------------------");

		//TreeSet으로 로또 번호 생성기 만들기
		TreeSet<Integer> ts1 = new TreeSet<Integer>();

		while(true) {

			int v = new Random().nextInt(45)+1;
			ts1.add(v);

			if(ts1.size() == 6) {
				break;

			}//if

		}//while

		System.out.println(ts1);

		System.out.println("-------------------------------------");

		TreeSet<String> name = new TreeSet<String>();

		name.add("김혜자");
		name.add("송강호");
		name.add("마동석");

		System.out.println(name);
		
		System.out.println("-------------------------------------");
	}//main
}


















