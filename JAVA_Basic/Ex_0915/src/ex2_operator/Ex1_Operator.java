package ex2_operator;

public class Ex1_Operator {
	public static void main(String[] args) {

		/* 
		 연산자(Operator)
		 1. 최고연산자 : . , ()
		 2. 증감연산자 : ++ , --
		 3. 산술연산자 : + , - , * , / , %
		 4. 시프트 연산자 : >> , <<
		 5. 비교연산자 : >, < , <= , >= , == ,!=
		 6. 비트연산자 : &, |, ^
		 7. 논리연산자 : || , && , !
		 8. 삼항(조건)연산자 : ? , :
		 9. 대입연산자 : = , *= , /= , %= , += , -= 
		 */

		//산술 연산자
		//- 4칙 연산과 나머지 연산자를 포함한다.
		int n1 = 20;
		int n2 = 7;
		int n3 = n1 + n2;
		System.out.println("'+'연산 : " + n3);
		
		n3 = n1 - n2;
		System.out.println("'-'연산 : " + n3);
		
		n3 = n1 * n2;
		System.out.println("'*'연산 : " + n3);
		
		n3 = n1 / n2;//몫을 계산
		System.out.println("'/'연산 : " + n3);
		
		n3 = n1 % n2;//나머지를 계산
		System.out.println("'%'연산 (모듈러) : " + n3 );
		
		
	}//main
}
