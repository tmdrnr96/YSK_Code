package ex1_thread_work;

public class QuizMain {
	public static void main(String[] args) {

		QuizThread quiz = new QuizThread();
		quiz.start();//�����带 ���� �ð� ���
		quiz.startGame();
		
	}//main
}
