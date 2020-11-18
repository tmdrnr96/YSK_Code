package ex2_calculator;

public class Cal {

	public void getResult(int su1, int su2, String op) {
		//Main에서 입력받은 수와 연산자를 통한 연산결과 출력
		
		switch (op) {
		case "+":
			System.out.printf("%d + %d = %d",su1,su2,su1+su2);
			break;

		case "-":
			System.out.printf("%d - %d = %d",su1,su2,su1-su2);
			break;
					
		case "*":
			System.out.printf("%d * %d = %d",su1,su2,su1*su2);
			break;
					
		case "/":
			System.out.printf("%d / %d = %d",su1,su2,su1/su2);
			break;
						
		default:
			System.out.println("연산자를 다시 입력해주세요");
			break;
		}
		
		
	}
	
}
