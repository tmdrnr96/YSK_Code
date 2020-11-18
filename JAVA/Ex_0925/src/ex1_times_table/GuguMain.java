package ex1_times_table;

import java.util.Scanner;

public class GuguMain {
	public static void main(String[] args) {

		//´Ü : 3´Ü
		//3 * 1 = 3
		//3 * 2 = 6
		//....
		//3 * 9 = 27

		Scanner sc = new Scanner(System.in);
		System.out.print("´Ü : ");
		int dan = sc.nextInt();

		GuguClass gugudan = new GuguClass();
		
		gugudan.showTable(dan);

	}//main

}
