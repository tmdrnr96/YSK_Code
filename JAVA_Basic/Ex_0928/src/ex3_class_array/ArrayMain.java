package ex3_class_array;

public class ArrayMain {
	public static void main(String[] args) {
		//클래스 배열
		
		//Friend 클래스가 저장될 2개짜리 공간 '만' 확보
		Friend[] fr = new Friend[2];
		//기본자료형의 배열은 주솟값과 방까지 만들어지지만
		//클래스는 방은 만들어지지 않고 주솟값만 받는다.
		
//		System.out.println(fr[0]); -> null값이 나온다. 
		
		//실제로 2개의 방을 만들어 name, age를 메모리에 확보
//		fr[0] = new Friend();
//		fr[1] = new Friend();	
		
		for(int i = 0; i <fr.length; i++) {
			fr[i] = new Friend();
		}
		
		/* 클래스 배열은 반드시 인덱스화를 해줘야한다. (인덱스화 과정이 없다면 fr[0]은 null값이 나온다.)
		 * 메모리
		 		stack   | heap
		 ---------------|-----------------					
						|
				fr		| n :	n:
						| a :	a:
						| [0]	[1]
		 
		 */
		//여러가지 타입을 한 번에 저장하고 출력하기 위해서 클래스 배열로 만든다.
		fr[0].setName("홍길동");
		fr[0].setAge(20);
		
		fr[1].setName("박길동");
		fr[1].setAge(30);
		
		/* 클래스 배열은 반드시 인덱스화를 해줘야한다. (인덱스화 과정이 없다면 fr[0]은 null값이 나온다.)
		 * 메모리
		 		stack   | heap
		 ---------------|-----------------					
						|
				fr		| n : 홍길동	n: 박길동
						| a : 20	a: 30
						|    [0]      [1]
		 
		 */
		
		for(int i = 0; i < fr.length; i++){
			System.out.println(fr[i].getName());
			System.out.println(fr[i].getAge());
			System.out.println("---------------");
		}
		
	}//main
}
