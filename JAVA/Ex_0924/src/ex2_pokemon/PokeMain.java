package ex2_pokemon;

public class PokeMain {
	public static void main(String[] args) {

		Pokemon p1 = new Pokemon();
		p1.name = "��ī��";
		p1.type = "����";
		
		System.out.println(p1.name);
		System.out.println(p1.type);
		
		
		Pokemon p2 = new Pokemon();
		p2.name="���̸�";
		p2.type="��";
		
		System.out.println(p2.name);
		System.out.println(p2.type);
		
		// * �޸𸮿� com1 �Ҵ� *
		//    stack  |  heap
		// ----------|-----------
		//     	     |  name : null
		//	 p1		 | 	type : null
		//	    	 | 	
		// �ߺ��� ���� ������ �ʰ� �ϱ����� ���θ޼��忡�� ���� �������� �� �ִ�.
		// Ŭ������ �ϳ����� �������� ��ü�� ���� �� �ִ�. (������)
		// ���ָ� ���ٸ� ��� ��ü�� �� ���� �� �ִ�.
		
	}//main
}
