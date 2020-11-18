package ex4_single_array;

public class Ex2_SingleArray {
	public static void main(String[] args) {

		//배열의 선언 및 생성!
		char[] ch = new char[4];

		ch[0] = 'J';
		ch[1] = 'A';
		ch[2] = 'V';
		ch[3] = 'A';
		//		ch[4] = '!';

		//JAVA
		for(int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
		}

		System.out.println();

		//배열의 선언, 생성, 초기화 한번에 하기
		
		String[] str = {"안녕", "하세요", "반가", "워요"};
		
		for(int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
			
		}//for
		
		System.out.println("-------------------------------------------");
		
		//개선된 for문(개선된 루프,향상된 for문...)(배열의 0번방에서 3번방까지, 배열의 모든 index를 출력할 때 사용할 수 있다.)
		//의도적으로 배열의 모든 index의 데이터를 출력하고자 하는 용도로 만들어진 for문 
		//편리하지만 배열의 각 index를 수정하거나 제어가 불가하다.
		for(String s : str){ // "String s" => 배열의 자료형 데이터와 동일한 자료형 데이터를 써준다.
			System.out.println(s);
		}//for
		
		
	}//main
}




















