package ex5_array_work;

import java.util.Random;

public class Ex3_work {
	public static void main(String[] args) {

		//���� !!
		//1 ~ 45������ ������ �߻� ���� lotto�迭�� �ߺ����� �ʰ� ������� ��
		//ȭ�鿡 ����Ͻÿ�
		// 32 1 27 6 15 19
		
		int[] lotto = new int[6];
				
		out: for(int i = 0; i < lotto.length; ) {
			
			//1 ~ 45 ������ ������ �迭�� i��° index�� �߰� 
			lotto[i] = new Random().nextInt(45)+1;
			
			//�ߺ����� ���ϴ� �ݺ���
			for(int j = 0; j < i; j++) {
			
				if(lotto[i] == lotto[j]) {
					continue out;
				}//if
				
			}//inner
			System.out.print(lotto[i] + " ");
			i++;
		}//outer
		
	
	}//main
}
