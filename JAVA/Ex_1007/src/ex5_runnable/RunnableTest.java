package ex5_runnable;


public class RunnableTest implements Runnable {

	//Runnable : Thread를 사용해야하는데 이미 extends(상속)이 되어있는 상황에서
	//            extends를 두번 사용할 수 없기 때문에 그때는 implements를 이용한다.
//				또한 Runnable이라는 인터페이스에는 start()가 없다.

	@Override
	public void run() {
		for(int i = 0; i < 10; i++) 
			try {
				Thread.sleep(1000);
				System.out.println(i);

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}


