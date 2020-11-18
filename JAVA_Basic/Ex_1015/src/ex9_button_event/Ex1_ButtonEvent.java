package ex9_button_event;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex1_ButtonEvent {
	public static void main(String[] args) {

		Frame f= new Frame("ButtonEvent ����!");

		f.setBounds(800, 200, 1000, 500);
		f.setLayout(new FlowLayout());

		Button btn1 = new Button("��ư1");
		Button btn2 = new Button("��ư2");
		Button btn3 = new Button("��ư3");
		Button btn4 = new Button("��ư4");

		btn1.setPreferredSize(new Dimension(200,100));
		btn2.setPreferredSize(new Dimension(200,100));
		btn3.setPreferredSize(new Dimension(200,100));
		btn4.setPreferredSize(new Dimension(200,100));

		f.add(btn1);
		f.add(btn2);
		f.add(btn3);
		f.add(btn4);
		
//-------------------------------------------------------------------
		//��ư�� �̺�Ʈ ������ ����ϱ�1
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("��ư1 Ŭ����");
			}
		});
//-------------------------------------------------------------------

		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("��ư2 Ŭ����");
			}
		});
//-------------------------------------------------------------------

		f.setVisible(true);

		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			};
		});

	}//main
}
