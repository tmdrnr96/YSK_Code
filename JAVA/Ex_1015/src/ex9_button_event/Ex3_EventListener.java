package ex9_button_event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex3_EventListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("��ư1")) { //�������� ��ư �߿� 1�� ��ư�� �����ٸ�..
			System.out.println("��ư 1�� Ŭ����");
		}else if(e.getActionCommand().equals("��ư2")) {
			System.out.println("��ư 2�� Ŭ����");
		}
		
	}

}
