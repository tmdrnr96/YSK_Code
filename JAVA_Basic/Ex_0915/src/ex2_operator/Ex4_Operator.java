package ex2_operator;

public class Ex4_Operator {
	public static void main(String[] args) {

		//비트연산자
		//논리연산자와 유사하지만 bit단위(2진수)의 연산만 가능하다.
		//일반적으로 시프트연산자와 함께 암호화, 복호화 작업에 사용되는 경우가 많다.
		//암호화, 복호화(원래 상태로 돌려놓는 것)
		int a = 10;  //1010
		int b = 7;   //0111
		int c =a & b;//0010
		//논리곱(and) : 2진수로 변환 시 두 값이 모두  1일 때만 1, 나머지는 0
		System.out.println("논리곱 : " + c);
		
		c = a | b; //1111
		//논리합(or) : 2진수로 변환시 두 값이 0일 때만 0, 나머지는 1
		System.out.println("논리합 : " + c);
		
		c = a ^ b;
		//베타적or : 2진수로 변환시 값이 같으면 0, 다르면 1
		System.out.println("xor(베타적 or) : " + c);
		
		System.out.println("--------------------------------------");
		
		//시프트 연산자
		//2진수 단위의 연산을 수행하되, 오른쪽이나 왼쪽으로 이동해 값에 변화를 준다.
		int n = 12;//1100
		int res = n >> 2;
		System.out.println("res : " + res);
		
		char ch = 'F';//1000110
		char ch_res = (char)(ch >> 1);
		
		System.out.println("ch_res : " + ch_res);
		
	}//main
}












