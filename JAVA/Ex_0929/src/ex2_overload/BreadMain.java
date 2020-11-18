package ex2_overload;

public class BreadMain {
	public static void main(String[] args) {

		Bread bread = new Bread();
		
		//빵을 만들었습니다.
		bread.makeBread();
		System.out.println("---------------");
		
		//빵을 만들었습니다.
		//빵을 만들었습니다.
		//요청하신 빵을 2개 만들었습니다.
		bread.makeBread(2);
		System.out.println("---------------");
		
		//크림빵을 만들었습니다.
		//크림빵을 만들었습니다.
		//요청하신 크림빵을 2개 만들었습니다.
		bread.makeBread("팥빵",3);
		System.out.println("---------------");
		
	}//main
}
