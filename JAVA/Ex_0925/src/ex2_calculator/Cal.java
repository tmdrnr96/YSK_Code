package ex2_calculator;

public class Cal {

	public void getResult(int su1, int su2, String op) {
		//Main���� �Է¹��� ���� �����ڸ� ���� ������ ���
		
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
			System.out.println("�����ڸ� �ٽ� �Է����ּ���");
			break;
		}
		
		
	}
	
}
