package ex3_class_array;

public class ArrayMain {
	public static void main(String[] args) {
		//Ŭ���� �迭
		
		//Friend Ŭ������ ����� 2��¥�� ���� '��' Ȯ��
		Friend[] fr = new Friend[2];
		//�⺻�ڷ����� �迭�� �ּڰ��� ����� �����������
		//Ŭ������ ���� ��������� �ʰ� �ּڰ��� �޴´�.
		
//		System.out.println(fr[0]); -> null���� ���´�. 
		
		//������ 2���� ���� ����� name, age�� �޸𸮿� Ȯ��
//		fr[0] = new Friend();
//		fr[1] = new Friend();	
		
		for(int i = 0; i <fr.length; i++) {
			fr[i] = new Friend();
		}
		
		/* Ŭ���� �迭�� �ݵ�� �ε���ȭ�� ������Ѵ�. (�ε���ȭ ������ ���ٸ� fr[0]�� null���� ���´�.)
		 * �޸�
		 		stack   | heap
		 ---------------|-----------------					
						|
				fr		| n :	n:
						| a :	a:
						| [0]	[1]
		 
		 */
		//�������� Ÿ���� �� ���� �����ϰ� ����ϱ� ���ؼ� Ŭ���� �迭�� �����.
		fr[0].setName("ȫ�浿");
		fr[0].setAge(20);
		
		fr[1].setName("�ڱ浿");
		fr[1].setAge(30);
		
		/* Ŭ���� �迭�� �ݵ�� �ε���ȭ�� ������Ѵ�. (�ε���ȭ ������ ���ٸ� fr[0]�� null���� ���´�.)
		 * �޸�
		 		stack   | heap
		 ---------------|-----------------					
						|
				fr		| n : ȫ�浿	n: �ڱ浿
						| a : 20	a: 30
						|    [0]      [1]
		 
		 */
		
		for(int i = 0; i < fr.length; i++){
			System.out.println(fr[i].getName());
			System.out.println(fr[i].getAge());
			System.out.println("---------------");
		}
		
	}//main
}
