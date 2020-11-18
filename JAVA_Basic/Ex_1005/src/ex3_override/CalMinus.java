package ex3_override;

public class CalMinus extends Calculator {

	@Override
	public void getResult(int a, int b) {
		System.out.println("CalMinus : " + (a - b));
	}
}
