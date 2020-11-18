package ex2_multi_array;

import java.util.Scanner;

public class Ex5_multi_array {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[][] arr; //마방진의 크기를 결정할 2차원 배열
		int num = 1;//시작 수
		int size = 0;//마방진의 크기
		
		int y = 0;//행
		int x = 0;//열

		System.out.print("홀수 : " );
		size = sc.nextInt(); //키보드에서 받은 값으로 마방진의 크기가 결정된다.
		
		x = size / 2; //마방진 가운데에 1을 넣기 위한 코드
		
		arr = new int[size][size];
		
		while(num <= size * size) {
			
			arr[y][x] = num;
			
			if(num % size == 0){
				
				y++;
			}else {
				y--;
				x++;
			}
			
			if(y < 0) {
				y = size - 1;
			}
			if(x >= size) {
				x = 0;
			}
			num++;
		}//while
		//마방진에 넣은 데이터 출력하기
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++){
				System.out.printf("%02d ", arr[i][j]);
			}
			System.out.println();
		}
	}//main

}
