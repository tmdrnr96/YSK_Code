package ex3_override;

public class CalMain {
	public static void main(String[] args) {

		CalPlus cp = new CalPlus();
		cp.getResult(10, 20);//30
		
		CalMinus cm = new CalMinus();
		cm.getResult(20, 10);//10
		
	}//main
}
