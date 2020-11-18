package ex1_single_thread;

public class SingleThread extends Thread {
//	메인스레드 이외에 서브스레드가 하나 있으면 싱글스레드
//	메인스레드 이외에 서브스레드가 두개 이상의 백그라운드 프로세스가 동작하고 있는
//	상황이라면 멀티스레드라고 부른다.
	
	//백그라운드에서 재생할 서브스레드 (스레드를 사용하기 위해선 Thread를 상속받는다.)
	//스레드는 독립적인 실행단위
	//한번에 두 가지 이상의 프로세스를 동시 다발적으로 실행 가능하게 해준다.
	
	//스레드를 상속 받았다면 반드시 run메서드를 오버라이딩 해야한다.
	
	@Override
	public void run() {
		//해당 프로세스의 독립적인 수행을 가능하게 하는 영역
		//run메서드 안에있는 for문은 백그라운드로 별도로 돌아간다.
		for(int i = 0 ; i < 10; i++) {
			System.out.println("스레드 실행");	
		}//for
		
	}//run
}
