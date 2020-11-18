package ex3_method;

public class MethodTest {

	public char select(String s) {
		//return을 만나는 순간 아래 있는 코드는 실행을 하지 못한다.
		switch(s) {
		case "1":
			return 'A';
		case "2":
			return 'B';
		default:
			return 'C';
		}//switch
	}//select
	
	public int value2(int n1) {
		n1+=200;
		System.out.println("n1 : " + n1);
		return n1;
	}
	
	public String value(int n) {
		n+=100;
		System.out.println("n : " + n);
		//반환형이 void가 아닌 경우에는 반환형 타입에 맞는 
		//데이터가 최소한 한번은 return되어야 한다.
		return "저리가"; 
	}
	
	public void test1() {
		System.out.println("test1 메서드 호출됨!! ");
		System.out.println("------------------");
	}
	
	
}
