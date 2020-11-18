package ex7_work;

public class Threadsub implements Runnable{

	private int count;

	public void setCount(int count) {
		this.count = count;
	}

	int time = 0;
	
	@Override
	public void run() {
		while(count != 5) {

			try {
				Thread.sleep(1000);
				time++;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}//while
		System.out.println( "°á°ú : " + time + "ÃÊ");


	}

}
