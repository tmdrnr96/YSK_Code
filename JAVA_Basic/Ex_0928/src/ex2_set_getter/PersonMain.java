package ex2_set_getter;

public class PersonMain {
	public static void main(String[] args) {

		Person p1 = new Person();
//		p1.setName("ȫ�浿");
//		p1.setAge(20);
		
		p1.setProperty("ȫ�浿", 20);
		
//		p1.setName("ȫ�μ�");
		
		Person p2 = new Person();
		p2.setName("�ڱ��");
		p2.setAge(24);
		
		System.out.println(p1.getName() + " / " + p1.getAge());
		System.out.println(p2.getName() + " / " + p2.getAge());
		
		
		
	}//main
}
