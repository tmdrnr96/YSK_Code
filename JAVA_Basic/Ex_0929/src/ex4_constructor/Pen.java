package ex4_constructor;

public class Pen {

	private String color;
	private int price;

	//멤버변수를 초기화..
	//객체를 생성할 때(생성자가 만들어질 때), 가장 먼저 호출되는 영역이기 때문에 
	//생성자에서 초기화하는 것이 속도적으로 더 이득이다.

	//객체생성시 기본생성자는 숨어있는 상태로 자동으로 생성된다.
	//하지만 생성자 오버로딩 했다면, 기본생성자를 못쓴다. 만약
	//기본생성자를 써야한다면 명시적으로 기본생성자를 만들어 줘야한다.
	
	//Pen클래스 생성자!
	public Pen() {
		color = "black";
		price = 300;
	}//Pen 기본 생성자

	//생성자 오버로딩(생성자지만, Setter처럼 사용할 수 있다.(다른점 : 딱 한번만 호출된다.))
	public Pen(String color, int price) {
		this.color = color;
		this.price = price;
	}


	public String getColor() {
		return color;
	}

	public int getPrice() {
		return price;
	}



}
