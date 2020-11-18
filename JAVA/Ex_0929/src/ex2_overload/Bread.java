package ex2_overload;

public class Bread {

	public void makeBread() {
		System.out.println("빵을 만들었습니다.");
	}

	public void makeBread(int n) {
		for(int i = 0; i < n; i++) {
			System.out.println("빵을 만들었습니다.");
		}//for
		System.out.printf("요청하신 빵을 %d개 만들었습니다.\n",n);
	}
	
	public void makeBread(String s, int n) {
		for(int i = 0; i < n; i++) {
			System.out.println( s + "을(를) 만들었습니다.");
		}//for
		System.out.printf("요청하신 %s을(를) %d개 만들었습니다.\n",s,n);
	}

	
}
