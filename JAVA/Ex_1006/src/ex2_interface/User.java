package ex2_interface;

public class User {
	public static void main(String[] args) {

		kitchen k = new kitchen();
		//실제 결과물은 주방에서!(인터페이스를 구현한 주방!)
		System.out.println(k.jjajang());
		System.out.println(k.jjambbong());
		System.out.println(k.boggembab());
		System.out.println(k.tangsuyuck());
	}//main
}
