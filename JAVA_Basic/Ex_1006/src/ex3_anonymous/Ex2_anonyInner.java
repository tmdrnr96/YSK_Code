package ex3_anonymous;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex2_anonyInner {
	public static void main(String[] args) {

		Frame f = new Frame();
		Button btn = new Button("��ư");
		
		f.setSize(300, 300);
		f.add(btn);
		
		//��ư�� �̺�Ʈ ������ ���
		//�͸��� �ƴ� ��!
//		ActionListener al = new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("�ȳ�");
//			}
//		};
//		
//		btn.addActionListener(al);
		
		//�͸����� ���� ��!(�ѹ����� �޸𸮿��� ����)
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("�����մϴ�.");
				System.exit(0);//������ ����
			}
		});
		
		f.setVisible(true);
		
	}//main
}
