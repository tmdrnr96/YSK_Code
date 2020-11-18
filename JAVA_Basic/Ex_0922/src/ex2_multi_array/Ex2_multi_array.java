package ex2_multi_array;

public class Ex2_multi_array {
	public static void main(String[] args) {
		
		//만약에 new int[2][] 작은 방에 숫자를 쓰게 되면 정사각형 아니면 직사각형의 모양이 나올 수 밖에 없다.
		int[][] num = new int[2][];
		num[0] = new int[3];
		num[1] = new int[2];
		
		num[0][0] = 1;
		num[0][1] = 2;
		num[0][2] = 3;
		
		num[1][0] = 4;
		num[1][1] = 5;
		
		for(int i = 0; i < num.length; i++) {
			
			for(int j = 0; j < num[i].length; j++) {
				
				System.out.print(num[i][j] + " ");
		
			}//inner
			
			System.out.println();
		
		}//outer
		
		
	}//main

}
