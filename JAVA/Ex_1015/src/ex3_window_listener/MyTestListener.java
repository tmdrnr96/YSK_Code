package ex3_window_listener;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyTestListener implements WindowListener{

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		//우상단 x버튼 클릭시 자동으로 호출되는 메서드!
		System.out.println("종료버튼 누름");
		System.exit(0);//모든 프레임 종료!
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		//최소화 된 window창이 원래대로 돌아오는 메서드!
		System.out.println("원래대로 돌아옴..");
	}

	@Override
	public void windowIconified(WindowEvent e) {
		//최소화 버튼을 눌렀을 때, 자동으로 호출되는 메서드
		System.out.println("최소화 됨...");
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

}
