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
		//���� x��ư Ŭ���� �ڵ����� ȣ��Ǵ� �޼���!
		System.out.println("�����ư ����");
		System.exit(0);//��� ������ ����!
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		//�ּ�ȭ �� windowâ�� ������� ���ƿ��� �޼���!
		System.out.println("������� ���ƿ�..");
	}

	@Override
	public void windowIconified(WindowEvent e) {
		//�ּ�ȭ ��ư�� ������ ��, �ڵ����� ȣ��Ǵ� �޼���
		System.out.println("�ּ�ȭ ��...");
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

}
