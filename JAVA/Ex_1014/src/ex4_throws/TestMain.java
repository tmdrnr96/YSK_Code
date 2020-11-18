package ex4_throws;

public class TestMain {
	public static void main(String[] args) {

	 Ex1_Throws e1 = new Ex1_Throws();
	 Ex2_Throws e2 = new Ex2_Throws();

	 //각 클래스 별로 같은 오류를 따로 따로 try/catch를 쓸 바에 한번에 처리!!
	 //Throws는 메서드에 쓸수 있으며 run()에서는 쓸수 없다.
	 try {
		e1.info();
		e2.Info();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}//main
}
