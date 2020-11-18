package ex1_casting;

public class Ex2_demotion {

	public static void main(String[] args) {
		
		//2. 디모션캐스팅
		// - 작은 자료형에 큰 자료형이 대입되는 것(자동으로 이뤄지지 않는다.)
					//메모리 가용량
		char c = 'A'; // 2 byte
		int n = c + 1; //4 byte // 여기까지는 프로모션
		
		//대입되는 자료형의 메모리 가용량이 커서 메모리 손실이 있을 수 있기 때문에 캐스팅을 수동(디모션캐스팅)으로 해주지 않으면 오류..
		c = (char)n;
		System.out.println("c : " + c);
		
		float f = 5.5f; //4.x byte
		int num = 0; // 4 byte
		
		//디모션 캐스팅은 프로모션 캐스팅과 다르게 큰 자료형 앞에 명시적으로 작은 자료형의 자료형을 써준다. 
		num = (int)f;
		System.out.println("num : " + num);
	}//mian

}
