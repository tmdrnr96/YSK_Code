package ex3_collection;

import java.util.HashMap;

public class Ex3_Map {
	public static void main(String[] args) {

		//Map : 키(Key)와 값(Value)을 묶어서 하나로 저장한다.
		//키을 통해 값을 검색하므로 많은 양의 데이터를 검색하는데 있어서 매우 뛰어난 성능을 발휘
		//set과 마찬가지로 인덱스가 없다.(set과 다르게 key값으로 인해 인덱스를 굳이 필요로 하지 않으므로 많이 쓰인다.)
		//Map은 인터페이스로 직접적으로 객체를 생성할 수 없다.
		HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
		//map만 유일하게 값을 추가할 때, put을 통해 값을 넣어준다(set, list는 모두 add로 값을 추가한다.)
		map.put(1,true);
		map.put(2,false);
		System.out.println(map.size());

		//메모리
		//map에서 put을 할 때마다 key값과 value값을 같이 추가한다.

		//		1			2
		//	   true		  false

		boolean res = map.get(2);		
		System.out.println(res);

		System.out.println("---------------------------------");

		HashMap<String, String> map2 = new HashMap<String, String>();

		//map구조는 중복된 key값을 사용할 수 없다.
		//키값이 중복된다면 마지막에 추가한 key값으로 value가 대체된다.

		//map은 키값의 중복은 허용하지 않지만 value의 값은 허용이 가능하다.
		map2.put("k1", "나의  key는 k1");
		map2.put("k1", "hi");

		map2.put("k2", "나의  key는 k2");
		map2.put("k3", "나의  key는 k3");
		map2.put("k4", "hi");

		//remove를 통해 k2를 제거한다면, k1과 k3를 먼저 연결하고 k2의 연결을 끊고,
		//k2는 아무도 참조하지 않아 가비지컬렉터로 인해 지워진다.
		map2.remove("k2");


		System.out.println(map2.size());
		System.out.println(map2.get("k3"));

		//배열을 한번에 출력하면 주솟값이 나오지만, 컬렉션은 모두 한번에 출력이 가능하다.
		System.out.println(map2);
		//없는 key값을 넣으면 null값이 나온다.

		//map2에 k3라는 key값을 가지고 있습니까?
		//map2가 k3라는 이름의 키값을 포함하고 있다면 true
		if(map2.containsKey("k3")) {
			System.out.println("k3 key가 존재합니다");
		}
		//containsKey : 특정 key값을 포함하고 있는지 ?

		//map2에 hi라는 value값을 가지고 있습니까? 가지고 있다면 true
		if(map2.containsValue("hi")) {
			System.out.println("hi라는 value가 존재합니다.");
		}
		//containsValue : 특정 value값을 포함하고 있는지?
		//키값은 중복될 수 없지만 value값을 중복될 수 있다.
		//하지만 hi라는 value값이 중복된다고 가정했을 때 키값이 hi를 가진 key값이 어떤 key인지 알수 없다... 
	}//main
}
