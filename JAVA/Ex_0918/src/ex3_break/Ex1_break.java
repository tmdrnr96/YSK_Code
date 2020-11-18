package ex3_break;

public class Ex1_break {
	public static void main(String[] args) {

		//break : 반복문 내에서 가장 가까운 반복문을 빠져나가기 위한 키워드
		
		for(int i = 1; i <= 2; i++) {
			for(int j = 1; j <= 3; j++) {
			
				if(j % 2 == 0) {
					//아랫쪽의 모든 코드를 무시하고
					//가장 가까운 반복문을 강제로 탈출
					break;
					//break 아래에는 어떤 코드를 작성할 수 없다.
//					System.out.println();
				}
				System.out.print(j + " ");
				
			}//inner
			
			System.out.println();
		}//outer
		
	}//main
}
