package ex1_first;

public class Ex1_First {
//클래스의 첫글자는 반드시 대문자로 작성한다.
//ctrl + m 화면 크고 작게!
//ctrl + s 저장 단축키
//자바는 한줄 라인이 끝나면 반드시 세미콜론(;)을 찍어줘야한다.
//정수를 제외한 문자열을 쓸 때는 쌍따옴표("")를 써준다.
	
	public static void main(String[] args) {
		//주석 : // -> 컴파일시 컴퓨터가 인식하지 못하는 일종의 메모
		//프로그램이 실행될 때 가장 먼저 실행되는 영역!
		
		System.out.println(100);
		System.out.println(100 + 200);
		System.out.println(500 - 100);
		
		System.out.println("안녕하세요!");
		//정수가 아닌 문자일 경우 +는 문장을 이어주는 역할로 바뀐다.
		System.out.println("홍길동" + "안녕");
		
		System.out.println("독고길동" + 100);
		System.out.println("안녕" + 100 + 100);
		
		System.out.println("100 + 50 = " + (100 + 50));
		System.out.println(10 + 10 + "안녕" + 10 + 10);
		
		
		
		
	}//main메서드
}


