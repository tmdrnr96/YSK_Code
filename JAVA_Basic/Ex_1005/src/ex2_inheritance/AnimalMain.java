package ex2_inheritance;

public class AnimalMain {
	public static void main(String[] args) {

		//상속은 공통된 사항을 출력할때 사용...
		
		Elephant ele = new Elephant();
		System.out.println("--- 코끼리 ---");
		System.out.println("눈 : " + ele.getEye());
		System.out.println("다리 : " + ele.getLeg());
		System.out.println("특징 : " + ele.special);
		
		Lion lion = new Lion();
		System.out.println("--- 사자 ---");
		System.out.println("눈 : " + lion.getEye());
		System.out.println("다리 : " + lion.getLeg());
		System.out.println("특징 : " + lion.special);
		
		Rabbit rab = new Rabbit();
		System.out.println("--- 토끼 ---");
		System.out.println("눈 : " + rab.getEye());
		System.out.println("다리 : " + rab.getLeg());
		System.out.println("특징 : " + rab.special);
		
		Snake sn = new Snake();
		//오버라이딩으로 메서드를 재정의 했다면.. 자식 클래스에서 재정의 된 메서드가 
		//우선적으로 호출된다. 
		
		//부모에게서  물려받은 메서드를 오버라이드(재정의)해서 메서드의 값을 바꿀 수 있다. 
		System.out.println("--- 뱀 ---");
		System.out.println("눈 : " + sn.getEye());
		System.out.println("다리 : " + sn.getLeg());
		System.out.println("특징 : " + sn.special);
		
		Spider sp = new Spider();
		System.out.println("--- 거미 ---");
		System.out.println("눈 : " + sp.getEye());
		System.out.println("다리  : " + sp.getLeg());
		System.out.println("특징 : " + sp.special);
		
	}//main
}
