package ex4_window_listener;

import java.awt.event.WindowEvent;

public class ClosingListener extends AllListener{

	//AllListenerŬ������  ����߱� ������ �ʿ��� �޼��常 ������ ���� �ִ�. 
	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);//���� ���� : 0  ������ ���� :-1
	}
	
}
