package ex3_anonymous;

import java.util.Random;
import java.util.Scanner;

public class Ex1_anonyMain {
	public static void main(String[] args) {

		//�͸�Ŭ���� : �̸�(��ü���� �������� ����)��  ���� Ŭ����
		//�ѵι� ����ϰ� �������� ��ü�� ������ �� �����ϰ� ���δ�.
		
		Scanner sc = new Scanner(System.in);
		//sc��ü�� �����ϸ鼭 �޸𸮿� ������ �Ҵ�ȴ�.
		sc.nextInt();
		sc.next();

		//sc��� �������� ������ �󸶵��� �ʿ��� �� �����ִ�.
		//�޸𸮿� �Ҵ� �޾� ������ �ʿ��� ������ ����.

		
		Random rnd = new Random();
		for(int i = 0; i < 5; i++){
			int num = rnd.nextInt(5)+1; //�͸��� �ƴ�..
		}

		
		int n = new Random().nextInt(5)+1; // �͸�ü
		//�ݺ������� ������ ������ �ÿ� �޸𸮰� ����ȴ�. ������
		//�ѹ��� �ʿ��ϴٸ� �͸����� ����� �ִ� ���� ����.
		//�͸��� ������� �޸𸮿��� ���ư���.
		
		/*   stack  | heap
		 *    n     | Random();
		 *    
		 *    n��  heap�޸𸮸� �����ϴ� ���� �ƴ϶� heap���� n���� ���� �ش�.
		 * 
		 * */
	}//main
}
