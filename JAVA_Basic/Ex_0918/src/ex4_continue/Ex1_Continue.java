package ex4_continue;

public class Ex1_Continue {
	public static void main(String[] args) {

		//continue�� : �ݸ� ������ Ư�� ������ �ǳ� �� �� ����ϴ� Ű����
		
		//* for�� �ȿ����� continue�� Ư¡
		//for�� �ȿ��� �����ϴ� continue���� �⺻������ ���� ����� for���� ���������� ����.
		//for���� �������� ���ٸ� continue�� �������� �����ϰ� ���ǽ����� �ٷ� �Ѿ��.
		
		for(int i = 1; i <= 2; i++ ){

			for(int j = 1; j <= 4; j++ ) {

				if(j % 2 == 0) { //2�� ����� ������� �ʰ�, �ٷ� ���������� �ö󰣴�.
					continue;
//					continue�� �ٷ� �Ʒ����� � �ڵ嵵 �������� �ʴ´�.
//					System.out.println();
				}
				
				System.out.print(j + " ");
				j++;
				
			}//inner
			
			System.out.println();
			
		}//outer

	}//main
}
