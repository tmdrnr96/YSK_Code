package ex4_constructor;

public class PenMain {
	public static void main(String[] args) {

		Pen p1 = new Pen();
		
		System.out.println(p1.getColor());
		System.out.println(p1.getPrice());
		//p1 ��ü�� �޸𸮸� �Ҵ��ϴµ� Pen() ���п� �޸𸮿� �Ҵ�ȴ�.
		//�����ڰ� �־�� Ŭ������ �޸𸮿� ������ �Ҵ�� �� �ִ�.
		
		//�����ڴ� �޼���ó�� �ʿ��Ҷ� ���� ȣ���� �� �ִ°��� �ƴ϶� �� �ѹ��� ȣ��ȴ�.
		
		//ATM[] a = new ATM[2];
		//a[0] = new ATM();
		//=> Ŭ���� �迭���� �̷������� �ڵ带 ���� ����! ������ ����!
		
		
//		System.out.println(p1.color);
//		System.out.println(p1.price);

		Pen p2 = new Pen();
		System.out.println(p2.getColor());
		System.out.println(p2.getPrice());
//		System.out.println(p2.color);
//		System.out.println(p2.price);
		
		//setter�� ��� ������ �����ε��� ���� �� ȣ���� �����ϸ�
		//setter�� �� ������ '���ȼ�'�� �� �ö󰣴�.
		
		//�����ڴ� new�� �Բ� ���� ȣ�⸸ �����ϰ� ���Ŀ��� ȣ���� �Ұ����ϴ�.
		Pen p3 = new Pen("gold", 25000);
		System.out.println(p3.getColor());
		System.out.println(p3.getPrice());

	}//main
}
















