package ex2_label;

public class Ex2_label_break {

	public static void main(String[] args) {

		int n = 0;

		 lab: while(true) {

			n++;

			switch(n) {
			case 2 :
				System.out.println("����ġ������ ����!");
				break lab;
				
			}//switch

			System.out.println(n);
		
		}//while

	}//main

}
