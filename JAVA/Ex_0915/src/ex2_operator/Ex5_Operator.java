package ex2_operator;

public class Ex5_Operator {
	public static void main(String[] args) {

		//증감연산자
		//1씩 증가시키거나, 1씩 감소시키는 연산자
		//선행증감과 후행증감의 차이점을 반드시 알아둬야 한다.
		
		int a = 10;
		System.out.println("a : " + ++a); // 선행증가
		
		int b = 10;
		System.out.println("b : " + b++); // 후행증가
		System.out.println("b : " + b);
		
		--b; // 10
		--b; // 9
		b++; // 9
		b--; // 10
		++b;// 10
		b++;//9
		--b;//10
		
		System.out.println("b : " + b++);
		System.out.println("b : " + b);
		
	}//main
}
