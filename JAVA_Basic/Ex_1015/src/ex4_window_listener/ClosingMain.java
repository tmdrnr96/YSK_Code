package ex4_window_listener;

import java.awt.Frame;

public class ClosingMain {
	public static void main(String[] args) {

		Frame f = new Frame();
		f.setTitle("«¡∑π¿”");
		f.setBounds(400, 200, 300, 200);
		
		f.addWindowListener(new ClosingListener());
		
		
		f.setVisible(true);
		
	}//main
}
