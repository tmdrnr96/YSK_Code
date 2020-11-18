package ex1_string;

public class Ex2_Stirng_Method {
	public static void main(String[] args) {

		//String 클래스의 메서드들 
		//메서드란 어떠한 작업을 수행하기 위한 명령문의 집합(모든 메서드는 소괄호"()"를 포함하고 있다.)
		String name = "Hong Gil Dong";

		//length() : 해당문자열의 길이를 알려준다(띄어쓰기 포함)
		//System.out.println("문자열 name의 길이(length) : " + name.length());
		//heap에 메모리가 할당되는 모든 객체는 .을 찍고 메서드를 사용할 수 있다.
		int index = name.length();// cntl + spacebar : String의 메서드로 int타입으로 값을 반환할 수 있다.
		//length 괄호 안에 데이터를 넣으면 오류...
		System.out.println("문자열 name의 길이(length) : " + index);

		index = name.indexOf('o'); //length를 제외한 모든 String메서드는 0번부터 시작한다.
		System.out.println("맨 처음 발견한 문자 o의 위치(indexOf) : " + index);
		//H o n g   G i l   D o  n  g
		//0 1 2 3 4 5 6 7 8 9 10 11 12

		index = name.indexOf('y'); //특정 문자를 발견하지 못했다면 -1을 반환한다.
		System.out.println("맨 처음 발견한 문자 y의 위치(indexOf) : " + index);

		index = name.indexOf("Gil");//Gil이라는 문장의 시작 위치(대소문자 구분), 특정 문자를 발견하지 못했다면 -1을 반환
		System.out.println("문장 Gil의 시작위치(indexOf) : " + index);

		index = name.lastIndexOf('o');//o의 마지막 위치
		System.out.println("마지막 문자 o의 위치(lastindexOf) : " + index);

		char c = name.charAt(5);//String 객체에서 5번째에 위치해 있는 문자를 가져온다.(한글자만 가져올 수 있다.) 
		System.out.println("추출한 5번째 위치의 문자(charAt) : " + c);

		String str = name.substring(5,10);//내가 선택한 구간을 잘라낸 문장을 가져온다.(5부터 10-1, 즉 9번째까지 가져온다.)
		System.out.println("5 ~ 9까지 잘라낸 문장(subString) : " + str);

		String fruit1 = "apple"; 
		String fruit2 = "Apple";

		if(fruit1.equals(fruit2)) {//equals는 대소문자를 구별하여 값을 비교한다. : boolean 타입으로 받아준다.
			System.out.println("equals : 값이 같습니다.");
		}else {
			System.out.println("equals : 값이 다릅니다.");
		}

		if(fruit1.equalsIgnoreCase(fruit2)){//equalsIgnoreCase는 대소문자를 무시하고 단어가 일치하면 true를 반환 : boolean 타입으로 받아준다.

			System.out.println("equalsIgnoreCase : 값이 같습니다.");
		}else {
			System.out.println("equalsIgnoreCase : 값이 다릅니다.");
		}


		String myId = " ysk ";
		
		//trim() : myId의 문장 앞뒤 의미없는 공백을 제거 단, 중간의 공백은 제거하지 못한다. 
		String result = myId.trim();
	
		if(result.equals("ysk")) {
			System.out.println("trim : 로그인 성공");
		}else {
			System.out.println("trim : 로그인 실패");
		}
		
		//숫자 형식의 문자열("10","1000".....(숫자처럼 생긴 문자열))을 실제 정수로 바꿔주는 메서드
		String number = "10";
		int n = Integer.parseInt(number);
//		Double.parseDouble("10.4"); 문자열 실수를 실제 실수로 바꿔주는 메서드
		System.out.println(n + 10);
		
		//기본자료형만 가지고는 .을 찍어서 메서드를 호출할 수 없기 때무에 wrapper클래스를 통해서 메서드를 호출할 수 있다.
			//*wrapper 클래스의 종류*
			// int와 char의 wrapper 클래스의 명을 제외하고 모두 기본자료형에서 앞글자만 대문자!
			// wrapper | 기본자료형
			//---------|--------
			// Boolean | boolean
			//---------|--------
			//  Byte   |  byte 
			//  Short  |  short
			// Integer |  int
			//  Long   |  long
			//---------|--------
			//Character|  char
			//---------|--------
			//  Float  |  float
			//  Double |  double
		
		
		
		
	}//main

}



















