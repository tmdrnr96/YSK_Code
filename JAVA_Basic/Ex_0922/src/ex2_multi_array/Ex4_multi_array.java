package ex2_multi_array;

public class Ex4_multi_array {
	public static void main(String[] args) {
		
		//2차원 배열 arr에 담긴 모든 값의 합과 평균을 구하시오
		int[][] arr = {{1, 2, 3},
					   {6, 13, 55, 16, 7},
					   {20, 21},
					   {11, 14, 7, 11, 9, 20}};
		
		int total = 0;
		int count = 0;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				total+=arr[i][j];
				count++;//배열이 가진 모든 방의 갯수
			}//inner
			
		}//outer
		System.out.println("총합 : " + total);
		System.out.println("평균 : " + total/(float)count);
		
	}//main

}
