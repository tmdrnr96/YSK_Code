package ex4_single_array;

public class Ex2_SingleArray {
	public static void main(String[] args) {

		//�迭�� ���� �� ����!
		char[] ch = new char[4];

		ch[0] = 'J';
		ch[1] = 'A';
		ch[2] = 'V';
		ch[3] = 'A';
		//		ch[4] = '!';

		//JAVA
		for(int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
		}

		System.out.println();

		//�迭�� ����, ����, �ʱ�ȭ �ѹ��� �ϱ�
		
		String[] str = {"�ȳ�", "�ϼ���", "�ݰ�", "����"};
		
		for(int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
			
		}//for
		
		System.out.println("-------------------------------------------");
		
		//������ for��(������ ����,���� for��...)(�迭�� 0���濡�� 3�������, �迭�� ��� index�� ����� �� ����� �� �ִ�.)
		//�ǵ������� �迭�� ��� index�� �����͸� ����ϰ��� �ϴ� �뵵�� ������� for�� 
		//�������� �迭�� �� index�� �����ϰų� ��� �Ұ��ϴ�.
		for(String s : str){ // "String s" => �迭�� �ڷ��� �����Ϳ� ������ �ڷ��� �����͸� ���ش�.
			System.out.println(s);
		}//for
		
		
	}//main
}




















