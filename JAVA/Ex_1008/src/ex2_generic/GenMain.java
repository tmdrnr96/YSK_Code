package ex2_generic;

public class GenMain {
	public static void main(String[] args) {

		GenTest<String> v1 = new GenTest<>(); 
		v1.setValue("String 데이터");
		String s = v1.getValue();
		System.out.println(s);
		
		//제너릭 타입은 int, char 등 기본 자료형을 지정할 수 없다.
		//그러므로 반드시 클래스 형식으로 지정해야 제너릭으로써 동작이 가능하다.
		GenTest<Integer> v2 = new GenTest<>();
		v2.setValue(100);
		//클래스가 기본자료형이 되는 것은 불가능하나, 
		//이전에는 형변환(캐스팅)을 통해 변환을 해야했다.
		//하지만 자바 버전이 올라감으로 캐스팅 필요 없이 변환이 가능해졌다.
		int n = v2.getValue(); // 클래스 -> 기본자료형(unBoxing 언박싱)
		//래퍼클래스는 형변환없이 기본자료형으로 변환이가능하다.
		
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
