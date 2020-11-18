package ex1_thread_work;

public class QuizMain {
	public static void main(String[] args) {

		QuizThread quiz = new QuizThread();
		quiz.start();//스레드를 통한 시간 계산
		quiz.startGame();
		
	}//main
}
