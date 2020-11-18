package ex2_operator;

public class Ex2_Operator {
	public static void main(String[] args) {

		//대입연산자
		//특정값을 변수에 저장하여 기억시킬 때 사용하는 연산자
		int n1 = 10;
		int n2 = 7;
		n1 += n2; // n1 = n1 + n2;
		System.out.println("'+=' 연산 : " + n1);
		
		n1 -= 2;//n1 = n1 - 2; (17 - 2)
		System.out.println("'-=' 연산 : " + n1);
		
		n1 /= 3;//n1 = n1 / 3;
		System.out.println("'/=' 연산 : " + n1);
		
		n1 %= 2;
		System.out.println("'%=' 연산 : " + n1);
		
		System.out.println("-------------------------------------------");
		
		//비교연산자
		//변수의 값을 비교하여 참과 거짓을 판단하는 연산자
		//결과는 반드시 boolean형식으로 반환된다.
		int i1 = 10;
		int i2 = 20;
		//비교연산자 부등어는 왼쪽을 기준으로 작다와 크다를 구분한다.( < (lt): 작다, > (gt): 크다)
		boolean res = i1 > i2;
		System.out.println("i1 > i2 : " + res);
		
		res = i1 <= i2;
		System.out.println("i1 <= i2 : " + res);

		res = i1 == i2;
		System.out.println("i1 == i2 : " + res);
		
		res = i1 != i2;//(java에서 !는 NOT의 의미를 가진다.)
		System.out.println("i1 != i2 : " + res);
		
	}//main
}
