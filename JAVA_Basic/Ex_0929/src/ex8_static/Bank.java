package ex8_static;

public class Bank {

	//static변수나 메서드는 객체를 아무리 많이 생성해도 메모리상에 '딱 한개만' 만들어진다.
	
	private String point; //은행위치
	private String tel; //전화번호
	static float interest; //이자율 //생성자 다음으로 static을 호출한다... 많이 사용..(비추 => 로드시에  속도가 느려진다.)
	
	//static에는 private을 잘 주지 않는다. => 클래스.변수로 접근을 하기 때문에.. private으로 만들면 접근 불가..

	//생성자 오버로드
	public Bank(String point, String tel) {
		this.point = point;
		this.tel = tel;
		interest = 10;
	}

	public void getInfo() {
		System.out.println("지점 : " + point);
		System.out.println("전화 : " + tel);
		System.out.println("이자율 : " + interest + "%" );
		System.out.println("--------------------------");
	
	}
	
}





























