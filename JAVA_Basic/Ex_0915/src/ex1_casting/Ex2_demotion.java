package ex1_casting;

public class Ex2_demotion {

	public static void main(String[] args) {
		
		//2. ����ĳ����
		// - ���� �ڷ����� ū �ڷ����� ���ԵǴ� ��(�ڵ����� �̷����� �ʴ´�.)
					//�޸� ���뷮
		char c = 'A'; // 2 byte
		int n = c + 1; //4 byte // ��������� ���θ��
		
		//���ԵǴ� �ڷ����� �޸� ���뷮�� Ŀ�� �޸� �ս��� ���� �� �ֱ� ������ ĳ������ ����(����ĳ����)���� ������ ������ ����..
		c = (char)n;
		System.out.println("c : " + c);
		
		float f = 5.5f; //4.x byte
		int num = 0; // 4 byte
		
		//���� ĳ������ ���θ�� ĳ���ð� �ٸ��� ū �ڷ��� �տ� ��������� ���� �ڷ����� �ڷ����� ���ش�. 
		num = (int)f;
		System.out.println("num : " + num);
	}//mian

}
