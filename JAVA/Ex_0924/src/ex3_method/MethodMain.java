package ex3_method;

public class MethodMain {
	public static void main(String[] args) {
						//�޸� �Ҵ�
		MethodTest mt = new MethodTest();
		//��ȯ���� void��� ��� ������ Ÿ�����ε� ���� �� ����.
		mt.test1();
		
		int su = 100;
		String res = mt.value(su); //��ȯ�Ǵ� ���� String�̱� ������ String���� �޾��ش�. 
		
		System.out.println("res : " + res);
		System.out.println("su : "+ su);
		
		System.out.println("--------------------------");
		
//		int num = mt.value2(su);
		su = mt.value2(su); //������ ���� ������ �����ϴ�.
		
		System.out.println("su : " + su);
		
		System.out.println("--------------------------");
		
		char result =  mt.select("1");
		System.out.println( "result : " + result);
		
		
	}//main
}
