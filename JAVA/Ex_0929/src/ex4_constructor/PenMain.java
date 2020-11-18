package ex4_constructor;

public class PenMain {
	public static void main(String[] args) {

		Pen p1 = new Pen();
		
		System.out.println(p1.getColor());
		System.out.println(p1.getPrice());
		//p1 객체가 메모리를 할당하는데 Pen() 덕분에 메모리에 할당된다.
		//생성자가 있어야 클래스가 메모리에 공간에 할당될 수 있다.
		
		//생성자는 메서드처럼 필요할때 마다 호출할 수 있는것이 아니라 딱 한번만 호출된다.
		
		//ATM[] a = new ATM[2];
		//a[0] = new ATM();
		//=> 클래스 배열에서 이런식으로 코드를 쓰는 이유! 생성자 때문!
		
		
//		System.out.println(p1.color);
//		System.out.println(p1.price);

		Pen p2 = new Pen();
		System.out.println(p2.getColor());
		System.out.println(p2.getPrice());
//		System.out.println(p2.color);
//		System.out.println(p2.price);
		
		//setter가 없어도 생성자 오버로딩을 통해 값 호출이 가능하면
		//setter를 쓸 때보다 '보안성'이 더 올라간다.
		
		//생성자는 new와 함께 최초 호출만 가능하고 이후에서 호출이 불가능하다.
		Pen p3 = new Pen("gold", 25000);
		System.out.println(p3.getColor());
		System.out.println(p3.getPrice());

	}//main
}
















