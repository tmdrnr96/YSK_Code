package ex2_set_getter;

public class Person {

	//데이터에 함부러 접근하는 것을 방지하기 위해 private으로 처리해준다.
	 private String name;
	 private int age;
	 
	 //전역변수와 지역변수 중에서 지역변수가 우선이다.
	 public void setProperty(String name, int age) {
		 //this : 현재 클래스를 의미(Person)
		 this.name = name; //현재클래스인 Person의 전역 변수 name(this.name)
		 this.age = age;
	 }
	 
	 //보안성을 높이기 위해 private으로 변수를 선언하고,
	 //이러한 변수에 접근하기 위해서 setter와 getter를 사용한다.

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
