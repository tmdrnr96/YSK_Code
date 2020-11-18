package ex3_method;

public class MethodMain {
	public static void main(String[] args) {
						//메모리 할당
		MethodTest mt = new MethodTest();
		//반환형이 void라면 어떠한 데이터 타입으로도 받을 수 없다.
		mt.test1();
		
		int su = 100;
		String res = mt.value(su); //반환되는 값이 String이기 때문에 String으로 받아준다. 
		
		System.out.println("res : " + res);
		System.out.println("su : "+ su);
		
		System.out.println("--------------------------");
		
//		int num = mt.value2(su);
		su = mt.value2(su); //원본의 값도 갱신이 가능하다.
		
		System.out.println("su : " + su);
		
		System.out.println("--------------------------");
		
		char result =  mt.select("1");
		System.out.println( "result : " + result);
		
		
	}//main
}
