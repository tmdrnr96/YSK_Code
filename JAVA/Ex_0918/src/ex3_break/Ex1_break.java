package ex3_break;

public class Ex1_break {
	public static void main(String[] args) {

		//break : �ݺ��� ������ ���� ����� �ݺ����� ���������� ���� Ű����
		
		for(int i = 1; i <= 2; i++) {
			for(int j = 1; j <= 3; j++) {
			
				if(j % 2 == 0) {
					//�Ʒ����� ��� �ڵ带 �����ϰ�
					//���� ����� �ݺ����� ������ Ż��
					break;
					//break �Ʒ����� � �ڵ带 �ۼ��� �� ����.
//					System.out.println();
				}
				System.out.print(j + " ");
				
			}//inner
			
			System.out.println();
		}//outer
		
	}//main
}
