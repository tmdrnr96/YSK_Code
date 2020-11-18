package ex3_override;

public class CalPlus extends Calculator {

	@Override
	public void getResult(int a, int b) {
		System.out.println("CalPlus : " + (a + b));
		
	}
}
