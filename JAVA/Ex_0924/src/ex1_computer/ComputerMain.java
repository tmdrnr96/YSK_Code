package ex1_computer;

public class ComputerMain {
	public static void main(String[] args) {

		Computer com1 = new Computer();
		
		// * �޸𸮿� com1 �Ҵ� *
		//    stack  |  heap
		// ----------|-----------
		//     	     |  hdd : 512
		//	 com1	 | 	ram : 16
		//	    	 | 	cpu : 2.5
		//		     | 	color : white
		
		//Ŭ������ ���η� ������ ����! (com1.hdd)
//		System.out.println(com1.hdd);
//		System.out.println(com1.ram);
//		System.out.println(com1.cpu);
//		System.out.println(com1.color);
		
		com1.getInfo();
		
		
		Computer com2 = new Computer();
		
		// * �޸𸮿� com1 �Ҵ� *
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
		
		//new�� ������� ������ heap �޸𸮿� ���Ӱ� �Ҵ� �޴´�.
		
//		com2.company = "apple"; //private���� ���������ڸ� ����Ͽ� computerŬ���� �̿ܿ��� ����� �� ����(private ������ Ÿ Ŭ�������� ȣ�� �Ұ�!)
		com2.ram = 32;
		com2.color = "black";
		
		com2.getInfo();

		
	}//main
}
