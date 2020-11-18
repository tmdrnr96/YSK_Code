package ex2_operator;

public class Ex6_Operator {
	public static void main(String[] args) {

		//삼항(조건) 연산자
		//하나의 조건식을 두고 조건이 참일 때와 거짓일 때의 결과를 모두 돌려받을 수 있도록 하는 연산자
		//조건식 : 참, 거짓의 대답을 얻을 수 있는 모든 질문! 
		int a = 10;
		int b = 15;
		
		boolean res = ++a >= b ? true : false;
		System.out.println("++a >= b : " + res );
		
		int i1 = 5;
		int i2 = 10;
		int res2= (i1 += i1) == i2 ? 100 : 200; 
		
		System.out.println("(i1 += i1) == i2 : " + res2);
		
		char gender = '남';
		char res3= gender == '여' ? '합' : '불';
		System.out.println("res3 : " + res3);
		
	}//main
}
