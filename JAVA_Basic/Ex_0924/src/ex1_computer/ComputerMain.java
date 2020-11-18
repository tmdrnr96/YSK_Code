package ex1_computer;

public class ComputerMain {
	public static void main(String[] args) {

		Computer com1 = new Computer();
		
		// * 메모리에 com1 할당 *
		//    stack  |  heap
		// ----------|-----------
		//     	     |  hdd : 512
		//	 com1	 | 	ram : 16
		//	    	 | 	cpu : 2.5
		//		     | 	color : white
		
		//클래스는 내부로 접근이 가능! (com1.hdd)
//		System.out.println(com1.hdd);
//		System.out.println(com1.ram);
//		System.out.println(com1.cpu);
//		System.out.println(com1.color);
		
		com1.getInfo();
		
		
		Computer com2 = new Computer();
		
		// * 메모리에 com1 할당 *
		//    stack  |  heap
		// ----------|-----------
		//     	     |  hdd : 512
		//	 com1	 | 	ram : 16
		//	    	 | 	cpu : 2.5
		//		     | 	color : white
		//			 |
		//	     	 |  hdd : 512
		//	 com2	 | 	ram : 16
		//	    	 | 	cpu : 2.5
		//		     | 	color : white	
		
		//new로 만들었기 때문에 heap 메모리에 새롭게 할당 받는다.
		
//		com2.company = "apple"; //private으로 접근제한자를 사용하여 computer클래스 이외에는 사용할 수 없음(private 변수는 타 클래스에서 호출 불가!)
		com2.ram = 32;
		com2.color = "black";
		
		com2.getInfo();

		
	}//main
}
