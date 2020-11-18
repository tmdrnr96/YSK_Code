package ex2_generic;

public class GenMain {
	public static void main(String[] args) {

		GenTest<String> v1 = new GenTest<>(); 
		v1.setValue("String ������");
		String s = v1.getValue();
		System.out.println(s);
		
		//���ʸ� Ÿ���� int, char �� �⺻ �ڷ����� ������ �� ����.
		//�׷��Ƿ� �ݵ�� Ŭ���� �������� �����ؾ� ���ʸ����ν� ������ �����ϴ�.
		GenTest<Integer> v2 = new GenTest<>();
		v2.setValue(100);
		//Ŭ������ �⺻�ڷ����� �Ǵ� ���� �Ұ����ϳ�, 
		//�������� ����ȯ(ĳ����)�� ���� ��ȯ�� �ؾ��ߴ�.
		//������ �ڹ� ������ �ö����� ĳ���� �ʿ� ���� ��ȯ�� ����������.
		int n = v2.getValue(); // Ŭ���� -> �⺻�ڷ���(unBoxing ��ڽ�)
		//����Ŭ������ ����ȯ���� �⺻�ڷ������� ��ȯ�̰����ϴ�.
		
		System.out.println(n);
		
		GenTest<Character> v3 = new GenTest<>();
		v3.setValue('A');
		char c = v3.getValue();
		System.out.println(c);
		
		GenTest<Float> v4 = new GenTest<>();
		v4.setValue(3.14f);
		float f = v4.getValue();
		System.out.println(f);
		
		
		
	}//main
}
