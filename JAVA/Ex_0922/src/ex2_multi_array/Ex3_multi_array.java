package ex2_multi_array;

public class Ex3_multi_array {
	public static void main(String[] args) {
		
		String[][] student = {{"홍길동", "J:98", "A:75"},
							  {"박길동", "J:50"}};
		
		for(int i = 0; i < student.length; i++) {
			
			for(int j = 0; j < student[i].length; j++) {
				
				System.out.print(student[i][j] + " ");
				
			}//inner
			
			System.out.println();
			
		}//outer

	}//main

}
