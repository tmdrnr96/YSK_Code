package ex3_multi_for;

public class Ex3_multiFor {
	public static void main(String[] args) {

		//A B C D
		//E F G H
		//I J K L

		char ch = 'A';
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.print(ch++ + " ");
				
			}//inner

			System.out.println();
			
		}//outer
		
		System.out.println("-------------------------------");
		
		char c = 65;
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.print(c++ + " ");
			}//inner
			System.out.println();
	
		}//outer
		
		System.out.println("-------------------------------");
		
		
		
	}//main
}
