package ex5_window_adapter;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AdapterMain {
	public static void main(String[] args) {

		Frame f = new Frame("프레임");
		f.setBounds(400, 300, 400, 400);
		
		//WindowAdapter WindowListener를 구현하고 있음.. 원하는 것만 골라서 쓸 수 있음.
		f.addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			};
		});
		
		f.setVisible(true);
	}//main
}
