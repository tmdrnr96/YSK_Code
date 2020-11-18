package ex1_output;

import java.io.PrintStream;

public class Ex1_Output {
	public static void main(String[] args) {
		
//		System.out.println();의 소중함... ㅋㅋ
		
		//Printstream은 Outputstream의 대표적인 자식 클래스 중 하나.
		//콘솔찰에 데이터를 출력하도록 하는 클래스
		PrintStream ps = null;
		
		//스테틱! 
		ps = System.out;
		
		int first = 'A';
		int second = 'B';
		
		//아스키코드로 출력됨..
		//wirte에 해당하는 아스키코드를 문자화하여 콘솔에 출력한다.
		ps.write(first);
		ps.write(second);
		
		ps.write(49);
		ps.write(48);
		
		ps.close();
		
		
	}//main
}
