package ex5_runnable;

public class RunMain {
	public static void main(String[] args) {
			
		RunnableTest r = new RunnableTest();
		//하지만 Thread에는 start()는 있지만 run()가 없다..
		//반대로 runnable은 run()는 있지만  start()가 없다 때문에..
		
		//Runnable에는 start()가 없기때문에 Thread를 생성한다.
		
		//Thread()에는 오버로딩으로 인자값으로  Runnable을 넣을 수 있다.
		Thread t = new Thread(r);
		//r인 RunnableTest와 Runnable은 implements로 인스턴스가 같다.
		t.start();
		
		
		System.out.println("메인스레드 종료");
	}
}
