package ex2_inheritance;

public class AnimalMain {
	public static void main(String[] args) {

		//����� ����� ������ ����Ҷ� ���...
		
		Elephant ele = new Elephant();
		System.out.println("--- �ڳ��� ---");
		System.out.println("�� : " + ele.getEye());
		System.out.println("�ٸ� : " + ele.getLeg());
		System.out.println("Ư¡ : " + ele.special);
		
		Lion lion = new Lion();
		System.out.println("--- ���� ---");
		System.out.println("�� : " + lion.getEye());
		System.out.println("�ٸ� : " + lion.getLeg());
		System.out.println("Ư¡ : " + lion.special);
		
		Rabbit rab = new Rabbit();
		System.out.println("--- �䳢 ---");
		System.out.println("�� : " + rab.getEye());
		System.out.println("�ٸ� : " + rab.getLeg());
		System.out.println("Ư¡ : " + rab.special);
		
		Snake sn = new Snake();
		//�������̵����� �޼��带 ������ �ߴٸ�.. �ڽ� Ŭ�������� ������ �� �޼��尡 
		//�켱������ ȣ��ȴ�. 
		
		//�θ𿡰Լ�  �������� �޼��带 �������̵�(������)�ؼ� �޼����� ���� �ٲ� �� �ִ�. 
		System.out.println("--- �� ---");
		System.out.println("�� : " + sn.getEye());
		System.out.println("�ٸ� : " + sn.getLeg());
		System.out.println("Ư¡ : " + sn.special);
		
		Spider sp = new Spider();
		System.out.println("--- �Ź� ---");
		System.out.println("�� : " + sp.getEye());
		System.out.println("�ٸ�  : " + sp.getLeg());
		System.out.println("Ư¡ : " + sp.special);
		
	}//main
}
