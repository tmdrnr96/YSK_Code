package ex1_arraylist;

import java.util.ArrayList;
import java.util.Random;

public class QuizMain {
	public static void main(String[] args) {
		
	Quiz q = new Quiz();
	q.game();
	Thread t = new Thread(q);
	t.start();

	
	
	}//main
}
