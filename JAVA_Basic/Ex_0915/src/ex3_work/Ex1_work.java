package ex3_work;

public class Ex1_work {
	public static void main(String[] args) {

		int a = 10;
		int b = 12;
		char res = ++a >= b || 2 + b - 5 <= b  && 13 - b >= 0 && (a += b)-(a % b) > 10 ? 'o' : 'x';
		System.out.println("res : " + res );
		
	}//main
}
