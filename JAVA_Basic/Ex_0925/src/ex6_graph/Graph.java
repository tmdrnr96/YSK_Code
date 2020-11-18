package ex6_graph;

import java.util.Random;

public class Graph {
	public static void main(String[] args) {

		//0 ~ 9사이의 난수를 100개 만든다.
		//만들어진 난수를 보고 0 ~ 9가 각각 몇개씩 포함되어 있는지 그래프화 하시오.

		//1231654846523121......
		//0의 갯수 : ########## 10
		//1의 갯수 : ######### 7
		//....
		//9의 갯수 : #### 4

		String numbers = "";
		for(int i = 0; i < 100; i++) {			
			numbers+= new Random().nextInt(10);
			
		}//for

		System.out.println(numbers);
		
		int[] arr = new int[10]; //int의 배열은 값을 넣지 않으면 0으로 초기화된다.
		
		for(int i = 0; i < numbers.length(); i++) {
			//"42104375505792386459247932..."
			String s = "" + numbers.charAt(i); //0번쨰 에 있는 값 4!
			arr[Integer.parseInt(s)]++; //s = 4  arr[4] -> 4를 진짜 정수로 만들어준다.
			//값을 채워 넣는다.
		}//for
		
		PrintGraph pg = new PrintGraph();
		pg.print(arr);
		
	}//main
}





