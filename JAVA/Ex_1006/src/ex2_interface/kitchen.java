package ex2_interface;

public class kitchen implements Menu1{

	@Override
	public String jjajang() {
		return "중면 + 춘장";
	}

	@Override
	public String jjambbong() {
		return "홍합 + 꼬막....";
	}

	//Menu2 : 상속처럼 메모리를 할당받는 형태이지만 인터페이스는 예외적으로
	//다중구현이 가능하다.(다중구현이 유일한 인터페이스!)
	//인터페이스는 실행능력이 없기 때문에 다중구현이 가능하다!!
	@Override
	public String boggembab() {
		return "이천쌀 + 짜장소스";
	}

	@Override
	public String tangsuyuck() {
		return "돼지고기 등등...";
	}

}
