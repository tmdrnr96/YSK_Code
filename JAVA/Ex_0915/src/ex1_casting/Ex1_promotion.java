package ex1_casting;

public class Ex1_promotion {
	public static void main(String[] args) {

		//캐스팅(형변환)
		//1.프로모션 캐스팅(자동으로 이루어진다.)
		//- 큰 자료형에 작은 자료형을 대입하는 것.
						  // 메모리 가용량
		double d = 100.5; // 8 byte
		int n = 200; // 4 byte
		d = n;
		
		//syso : System.out.println 단축키
		System.out.println("d : " + d );
		
		char c = 'A';// 2 byte
		int n2 = 100; // 4 byte
		n2 = c;
		
		System.out.println("n2 : " + n2);
		
		
	}//main 
}
