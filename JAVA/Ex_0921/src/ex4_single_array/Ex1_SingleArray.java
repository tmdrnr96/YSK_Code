package ex4_single_array;

public class Ex1_SingleArray {
	public static void main(String[] args) {

		//배열 : '같은 자료형 끼리 모아둔 하나의 묶음'이다.
		//효율적인 자료 관리를 위해 반드시 필요

		int su1 = 100;
		int su2 = 200;
		int su3 = 300;
		int su4 = 400;

		//자원(변수)을 편하게 관리하고 제어하기 위해 배열을 사용
		//1) 배열 선언
		int[] arr; // 대괄호가 1개면 1차원 배열, 2개면 2차원 배열...

		//2) 배열 생성 //배열 생성을 완료하면 각방마다 초기값으로 '0'이 자동으로 들어가 있다. 
		arr = new int[4];//arr.length는 index의 수와 같다.

		//ex) 배열의 선언과 생성을 한번에 하기!
		//int[] arr = new int[4];

		//3)배열 초기화 
		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 300;
		arr[3] = 400;

		//배열에 존재하지 않은 인덱스에 값을 추가하거나 변경할 수 없다.
		//arr[4] = 500; 
		System.out.println(arr[2]);//특정 index의 값만 꺼내서 사용할 수 있다.
		
		System.out.println("-------------------------------------");
		//for문을 사용한 배열 값 출력!
		
		for(int i = 0; i < arr.length; i++ ) {
			arr[i] = (i + 1) * 1000;
			System.out.println(arr[i]);
		}//for


	}//main

}
