package ex4_method;

public class MethodTest {

	public void test(int[] ar) {
		//배열의 length는 메서드가 아니라  속성이다.
		//String에서의 length는 메서드!
		
		//String을 포함해서 기본자료형의 변수가 
		//파라미터로 넘어가면 복사본이 넘어가지만
		//객체가 넘어가게 되면 복사값이 넘어가는 
		//것이 아니라 주소를 넘겨준다.(복사본 x)(주소값을 공유한다.)
		
		// 즉, 2개의 객체가 하나의 주솟값을 사용한다.
		//따라서 주소값을 공유하는 객체 중 1객체가 값이 바뀌면 같이 공유하고 있는
		//객체도 값이 바뀐다.
		
		// * 메모리에 할당 *
		//    stack  |  heap
		// ----------|-----------
		//    arr    |  
		//	 		 | 	5, 2, 3
		//	  ar   	 | 	(객체가 파라미터로 넘어가면 주솟값을 공유한다.)
		//		     | 	
		
		ar[0] = 5;
		System.out.println("test()메서드에서 호출됨");
		
		for(int i = 0; i< ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
		
		System.out.println("\n------------------");
	}
	
}
