package ex4_continue;

public class Ex1_Continue {
	public static void main(String[] args) {

		//continue문 : 반목문 내에서 특정 문장을 건너 뛸 때 사용하는 키워드
		
		//* for문 안에서의 continue의 특징
		//for문 안에서 동작하는 continue문은 기본적으로 가장 가까운 for문의 증감식으로 간다.
		//for문에 증감식이 없다면 continue는 증감식을 무시하고 조건식으로 바로 넘어간다.
		
		for(int i = 1; i <= 2; i++ ){

			for(int j = 1; j <= 4; j++ ) {

				if(j % 2 == 0) { //2의 배수는 출력하지 않고, 바로 증감식으로 올라간다.
					continue;
//					continue문 바로 아래에는 어떤 코드도 동작하지 않는다.
//					System.out.println();
				}
				
				System.out.print(j + " ");
				j++;
				
			}//inner
			
			System.out.println();
			
		}//outer

	}//main
}
