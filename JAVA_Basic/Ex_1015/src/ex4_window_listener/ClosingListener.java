package ex4_window_listener;

import java.awt.event.WindowEvent;

public class ClosingListener extends AllListener{

	//AllListener클래스를  상속했기 때문에 필요한 메서드만 가져다 쓸수 있다. 
	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);//정상 종료 : 0  비정상 종료 :-1
	}
	
}
