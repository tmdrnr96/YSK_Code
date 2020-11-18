package ex9_button_event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex3_EventListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("버튼1")) { //여러개의 버튼 중에 1번 버튼을 눌렀다면..
			System.out.println("버튼 1번 클릭함");
		}else if(e.getActionCommand().equals("버튼2")) {
			System.out.println("버튼 2번 클릭함");
		}
		
	}

}
