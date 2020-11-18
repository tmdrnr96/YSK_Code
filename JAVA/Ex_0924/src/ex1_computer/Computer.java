package ex1_computer;

public class Computer {

	//컴퓨터를 대량생산하기 위한 설계도를 만드는 작업
	//클래스의 구성요소
	//1. 속성(변수, 멤버)
	//2. 메서드(함수, 기능)
	
	//속성, 멤버 변수
	private String company = "samsung";
	int hdd = 512;
	int ram = 16;
	float cpu = 2.5f;
	String color = "white";
	
	//컴퓨터의 정보를 출력하기 위한 메서드
	//메서드의 이름은 반드시 소문자로 만든다.
//  접근제한자  반환형    메서드명(인자, 파라미터, 아규먼트, 매개변수){ 메서드의 실행 영역 }
//	public   void  getInfo() {              }
	public void getInfo() {
		
		System.out.println("제조사 : " + company);
		System.out.println("hdd : " + hdd);
		System.out.println("ram : " + ram);
		System.out.println("cpu : " + cpu);
		System.out.println("color : " + color);
		System.out.println("----------------------");
	}
	
	//접근제한자
	//1. public : 같은 프로젝트 내의 모든 클래스에게 사용을 허가
	//2. private : 현재 클래스에서만 사용을 허가
	//3. protected : 상속관계의 객체들에게만 사용을 허가
	//4. default : 같은 패키지 내의 모든 클래스에게 사용을 허가 , 메서드에 표시를 안함..
	
	
	
}
