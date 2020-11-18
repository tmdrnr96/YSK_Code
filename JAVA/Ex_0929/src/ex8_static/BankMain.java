package ex8_static;

public class BankMain {
	public static void main(String[] args) {

		Bank b1 = new Bank("강남", "02-111-1111");
		Bank b2 = new Bank("마포", "02-222-2222");
		Bank b3 = new Bank("분당", "032-333-3333");
		
//		Bank.interest = 0.1f; (권장!)
		
		b1.interest = 0.1f;//강남 지점만 이자율을 바꾼다.
		//static은 메모리상에 딱 하나만 만들어지기 때문에
		//한 지점의 이자율만 바꿔도 전체 지점의 이자율이 바뀐다.
		
		b1.getInfo();
		b2.getInfo();
		b3.getInfo();
		
		/* 일반 클래스 메모리 구조 
		 	static	|  			heap
		 -----------|-----------------------
		 	b1		| p : 강남  tel : 02...  in : 10%
		 	b2		| p : 마포  tel : 02...  in : 10%
		 	b3		| p : 분당  tel : 032...  in : 10%
		 
		 
		  */
		
		/* static 변수 메모리 구조 
	 	static	|  	     heap		   	 |		static
	 -----------|------------------------|------------------
	 	b1		| p : 강남  tel : 02... in |->	
	 	b2		| p : 마포  tel : 02... in |->   		10%
	 	b3		| p : 분당  tel : 032...in |->  (static변수나 메서드는 객체를 
	 										    아무리 많이 생성해도 메모리상에 
	 										  '딱 한개만' 만들어진다.)
	 
	 
	  */
		
		
	}//main
}
