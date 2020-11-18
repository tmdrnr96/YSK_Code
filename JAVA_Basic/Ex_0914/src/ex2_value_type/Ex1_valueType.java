package ex2_value_type;

public class Ex1_valueType {

	public static void main(String[] args) {
		
		/*
		자료형(기본자료형) - 모든 자료형은 소문자로 만들어져 있다.
		논리형 : boolean
		문자형 : char
		정수형 : byte - 1byte : -128 ~ 127
			   short - 2byte : -32768 ~ 32767
			   int  - 4byte : -21억 ~ 21억
			   long  - 8byte : -900경 ~ 900경
		실수형 : float - 4.x byte
			   double  - 8.x byte 
		 */
		
		//변수 : 특정값을 저장하기 위한 저장공간
		//변수 선언 규칙
		//자료형 변수명; <-- 변수의 선언
		//변수명 = 값; <-- 대입
		//자료형 변수명 = 값; <--선언과 대입을 동시에!(초기화)
		int a = 100;
		
		//변수이름짓기 규칙!!!
		//1) 변수의 이름을 지을 때는 반드시 소문자로 시작 
		//2) _를 제외하고 특수문자를 사용하지 않는다.
		//3) 한글로 변수의 이름을 짓지 않는다.
		
		//---------------------------------------------------------------
		
		//논리형 : true, false즉, 참과 거짓의 두가지 값만 저장할 수 있다.
		boolean b;
		b = true;
		System.out.println("b : " + b);
		
		//자료형에 맞춰서 값을 넣어줘야하며, 한번 쓴 변수는 재활용이 가능하다.
		b = false;
		System.out.println("b : " + b);
		
		//같은 메서드 안에 이미 있는 별칭으로 변수를 선언하려고 하면 오류가 발생한다.(변수 중복 절대 금지)
		//boolean b -> 똑같은 별칭을 쓸 수 없다.(중복된 이름의 변수를 새로 만드는 것은 불가능하다.)
		
		boolean ba = true;
		System.out.println("ba : " + ba);

		System.out.println("---------------------------------------------------------------");
		
		//문자형 : 문자형은 반드시 홑따옴표 안에 한글자만 저장 가능한 자료형
		char ch = 'A';
		System.out.println("ch : " + ch);
		
		//10진수인 65를 아스키코드로 바꾸면 A가 나온다 (66은 B이다.)
		char ch2 = 65 + 1;
		System.out.println("ch2 : " + ch2);

	}//main
	
}
