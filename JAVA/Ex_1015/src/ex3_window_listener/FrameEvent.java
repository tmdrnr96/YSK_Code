package ex3_window_listener;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FrameEvent {
	public static void main(String[] args) {

		Frame f = new Frame("���� �̺�Ʈ");
		
		//setBounds() :Location�� size�� �ѹ��� ������ �� �ִ� �޼���!
		//setBounds(x��ǥ,y��ǥ,�ʺ�width,����height)
		f.setBounds(500,200,400,300);
		
		//�����ӿ��� ���� ��ư�� �̺�Ʈ ������ ���
//		f.addWindowListener(new WindowListener); �̷��� ����� �߻�޼��带 �����ؾ��ϴ� �������̵� �޼��尡 ���� ���´�..(�ڵ� ����..) 
		f.addWindowListener(new MyTestListener());
		//windowâ�� ������ �� �ڵ������� addWindowListener���� �޼��� ȣ�� �ش� �޼��尡 ȣ��Ǹ鼭 �̺�Ʈ ó���� �ȴ�..
		
		
		//setVisible �Ϲ������� ���� �Ʒ��� �����.. 
		f.setVisible(true);
		
	}//main
}
