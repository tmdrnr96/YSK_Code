package ex1_string;

public class Ex1_String {
	public static void main(String[] args) {

		//String클래스는 두 가지의 특징을 가지고 있다.
		//1) 객체생성법이 두 가지 (암시적, 명시적) - 자바의 클래스 중에서 객체 생성방법이 2개 인것은 String이 유일하다.
		//2) 한 번 생성된 문자열의 내용은 변하지 않는다.(불변의 특징)
		
		//*중요*
		//변수 : 기본자료형을 가지고 만드는 변수 (int, boolean, byte, short..등)
		//객체 : 클래스를 통해 만들어진 모든 변수 (String, Scanner, Random... 등 )
		//heap 메모리 메모리를 할당받는 모든것은 변수 (int[] arr = new int[] 배열도 객체!)
		//String은 객체형 변수라고 불릴 수도 있다.(유일)
		
		//객체형 변수 생성!(객체 생성!)
		String s1 = "abc";
		int n = 10;
		/*
		    stack  |   heap     
		  ------------------- 
		      S1   |  "abc" (배열처럼 heap메모리에 객체 생성)(new) 
		    n(10)  |  
		          
		 */
		
		String s2 = "abc";
		String s3 = "abc";
		/*
	    stack  |   heap     
	  ------------------- 
	      s1   |   
	      s2   |  "abc" (S1,S2,S3 같은 값을 가지고 있기 떄문에 값의 주솟값을 공유한다.)
	      s3   |
	          
	     S1과 S2의 값이 같기 때문에 heap메모리의 S1의 주소값을 S2에게 공유하게 된다(재활용..) => 암시적 객체생성 
	          각 String 객체가 가지는 값이 같을 경우 앞서 생성된 객체의 주소를 재사용하는 형식 => 암시적 객체생성	 
	 */
		
		String s4 = new String("abc");// => 명시적 객체 생성
		//new라는 키워드가 사용되는 모든 코드는 "명시적 객체 생성"이된다.
		
		String s5 = new String("abc");// 명시적 객체 생성
		
		/*
		 stack  |   heap     
	  ------------------- 
	      s1   |    "abc" (S1,S2 같은 값을 가지고 있기 떄문에 값의 주솟값을 공유한다.)(암시적 객체 생성)
	      s2   | 
	      s4   |	"abc" (s3는 new로 객체 생성(명시적 객체 생성)을 하였기 때문에 heap메모리에 객체를 새롭게 생성한다.)
		  s5   |    "abc" (s3는 new로 객체 생성(명시적 객체 생성)을 하였기 때문에 heap메모리에 객체를 새롭게 생성한다.)	
		 
		 */
		
		
		//==연산자는 일반 변수를 비교할 때는 값이 같은지를 비교하는 코드지만
		//객체간의 비교에서는 주소값 비교의 코드로 사용된다.
		//아래와 같은 상황에선 s1과 s3의 값을 비교하는 것이 아니라 주솟값을 비교한다. 
		//String은 값을 비교할 때 ==을 사용하지 않는다. 
		
		if(s1 == s4) {
			System.out.println("== : 같습니다.");
		}else {
			System.out.println("== : 다릅니다.");
		}
		
		System.out.println("----------------------------------");
		
		if(s1 == s2) {
			System.out.println("같습니다.");
		}else {
			System.out.println("다릅니다.");
		}
		
		//------------------------------------------------------
		
		String s6 = "abc";
		String s7 = "Abc";		
		
		/*
	    stack  |   heap     
	  ------------------- 
	      s6   |   "abc" 
	      s7   |   "Abc"
	        
	    //새롭게 객체를 생성한다.(암시적 객체 생성)
	             
	 */
		
		
	//String클래스의 값을 비교해보자!
		
		if(s1.equals(s4)) {//eqauals():String의 값을 비교하는 메서드(기능)
			System.out.println("equals : 값이 같습니다.");
		}
		
		System.out.println("----------------------------------");
		
		System.out.println("---String의 불변적 특징---");
		String greet = "홀길동";
		greet += "안녕?";
		System.out.println(greet);
		
		/*
	    stack  |   heap     
	  ------------------- 
	    greet  |   홍길동  (홍길동이라는 객체 생성) => 쓰레기 값으로 가비지컬렉터에 의해 제거 된다.
	           |   홍길동안녕?(greet += "안녕?"이 붙으면서 객체가 새롭게 생성되면서 주솟값이 바뀐다.(홍길동 => 홍길동안녕? greet의 주솟값이 바뀐다.))
	        
	    //새롭게 객체를 생성한다.(암시적 객체 생성)
	             
	 */
		
	//이 페이지의 요점...	
	//암시적 객체생성, 명시적 객체생성, Stirng의 값 비교는 eqauls로 비교, 불변적 특징으로 쓰레기 값은 가비지컬렉터에 의해 제거된다.	
		
	}//main
}
























