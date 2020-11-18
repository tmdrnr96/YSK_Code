package ex2_value_type;

public class Ex2_valueTpye {
	public static void main(String[] args) {

		//정수형 : 정수단위의 값만 저장 가능한 자료형
		//byte b = 128; <--byte 자료형의 최대값을 벗어나므로 오류
		int n = 2100000000;
		System.out.println("n : " + n);
		
		long lo = 2200000000L; // 수식어 L은  대소문자를 구분하지 않는다.
		System.out.println("lo : " + lo);
		
		System.out.println("----------------------------------------------");
		
		//실수형 : 소수점을 포함하는 값을 저장하기 위한 자료형
		float f = 3.14F;
		double d = 3.14; 
		
		System.out.println("f : " + f);
		System.out.println("d : " + d);
		
		//자료형이 실수이기 때문에 정수형을 넣으면 알아서 본인 타입에 맞게 실수형으로 바뀐다.
		f = 100;
		d = 200;
		
		System.out.println("f : " + f);
		System.out.println("d : " + d);
	}//main
}
