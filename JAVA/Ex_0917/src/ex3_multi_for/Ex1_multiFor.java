package ex3_multi_for;

public class Ex1_multiFor {
	public static void main(String[] args) {

		//����for�� (multi_for) : for�� �ȿ� for���� ���ԵǾ� �ִ� ���
		//1 2 3
		//1 2 3
		
		for(int i = 1; i <= 2; i++) { //y��(����)��
			for(int j = 1; j <= 3; j++) {//x��(����)��
				System.out.print(j + " ");
			}//inner
			System.out.println();//�ٹٲ� �ڵ�
		}//outer
		
		System.out.println("------------------------");
		
		//1 2 3 4 5
		//1 2 3 4 5
		//1 2 3 4 5
		
		for(int i = 1; i <= 3; i++) { 
			for(int j = 1; j <= 5; j++) {
				System.out.print(j + " ");
			}//inner
			System.out.println();
		}//outer
		
		System.out.println("------------------------");
		
		
		
		
	}//main
}
