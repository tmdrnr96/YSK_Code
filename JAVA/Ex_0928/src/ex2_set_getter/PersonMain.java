package ex2_set_getter;

public class PersonMain {
	public static void main(String[] args) {

		Person p1 = new Person();
//		p1.setName("È«±æµ¿");
//		p1.setAge(20);
		
		p1.setProperty("È«±æµ¿", 20);
		
//		p1.setName("È«¹Î¼ö");
		
		Person p2 = new Person();
		p2.setName("¹Ú±æ¼ø");
		p2.setAge(24);
		
		System.out.println(p1.getName() + " / " + p1.getAge());
		System.out.println(p2.getName() + " / " + p2.getAge());
		
		
		
	}//main
}
