package ex1_output;

import java.io.PrintStream;

public class Ex1_Output {
	public static void main(String[] args) {
		
//		System.out.println();�� ������... ����
		
		//Printstream�� Outputstream�� ��ǥ���� �ڽ� Ŭ���� �� �ϳ�.
		//�ܼ����� �����͸� ����ϵ��� �ϴ� Ŭ����
		PrintStream ps = null;
		
		//����ƽ! 
		ps = System.out;
		
		int first = 'A';
		int second = 'B';
		
		//�ƽ�Ű�ڵ�� ��µ�..
		//wirte�� �ش��ϴ� �ƽ�Ű�ڵ带 ����ȭ�Ͽ� �ֿܼ� ����Ѵ�.
		ps.write(first);
		ps.write(second);
		
		ps.write(49);
		ps.write(48);
		
		ps.close();
		
		
	}//main
}
