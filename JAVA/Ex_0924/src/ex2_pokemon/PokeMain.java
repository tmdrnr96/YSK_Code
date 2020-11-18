package ex2_pokemon;

public class PokeMain {
	public static void main(String[] args) {

		Pokemon p1 = new Pokemon();
		p1.name = "피카츄";
		p1.type = "전기";
		
		System.out.println(p1.name);
		System.out.println(p1.type);
		
		
		Pokemon p2 = new Pokemon();
		p2.name="파이리";
		p2.type="불";
		
		System.out.println(p2.name);
		System.out.println(p2.type);
		
		// * 메모리에 com1 할당 *
		//    stack  |  heap
		// ----------|-----------
		//     	     |  name : null
		//	 p1		 | 	type : null
		//	    	 | 	
		// 중복된 값이 나오지 않게 하기위해 메인메서드에서 값을 지정해줄 수 있다.
		// 클래스는 하나지만 여러개의 객체를 만들 수 있다. (다형성)
		// 범주만 같다면 어떠한 객체라도 다 만들 수 있다.
		
	}//main
}
