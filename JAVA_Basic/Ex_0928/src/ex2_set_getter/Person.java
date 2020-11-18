package ex2_set_getter;

public class Person {

	//�����Ϳ� �Ժη� �����ϴ� ���� �����ϱ� ���� private���� ó�����ش�.
	 private String name;
	 private int age;
	 
	 //���������� �������� �߿��� ���������� �켱�̴�.
	 public void setProperty(String name, int age) {
		 //this : ���� Ŭ������ �ǹ�(Person)
		 this.name = name; //����Ŭ������ Person�� ���� ���� name(this.name)
		 this.age = age;
	 }
	 
	 //���ȼ��� ���̱� ���� private���� ������ �����ϰ�,
	 //�̷��� ������ �����ϱ� ���ؼ� setter�� getter�� ����Ѵ�.

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	 
	
	  
}
