package ex6_graph;

import java.util.Random;

public class Graph {
	public static void main(String[] args) {

		//0 ~ 9������ ������ 100�� �����.
		//������� ������ ���� 0 ~ 9�� ���� ��� ���ԵǾ� �ִ��� �׷���ȭ �Ͻÿ�.

		//1231654846523121......
		//0�� ���� : ########## 10
		//1�� ���� : ######### 7
		//....
		//9�� ���� : #### 4

		String numbers = "";
		for(int i = 0; i < 100; i++) {			
			numbers+= new Random().nextInt(10);
			
		}//for

		System.out.println(numbers);
		
		int[] arr = new int[10]; //int�� �迭�� ���� ���� ������ 0���� �ʱ�ȭ�ȴ�.
		
		for(int i = 0; i < numbers.length(); i++) {
			//"42104375505792386459247932..."
			String s = "" + numbers.charAt(i); //0���� �� �ִ� �� 4!
			arr[Integer.parseInt(s)]++; //s = 4  arr[4] -> 4�� ��¥ ������ ������ش�.
			//���� ä�� �ִ´�.
		}//for
		
		PrintGraph pg = new PrintGraph();
		pg.print(arr);
		
	}//main
}





