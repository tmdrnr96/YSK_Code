package ex4_image;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class ImageTest2 {
	public static void main(String[] args) {

		Frame f = new Frame("image Frame");
		f.setLayout(null);
		f.setBounds(500, 200, 700, 700);

		Button btn1 = new  Button("�̹���1");
		btn1.setBounds(300, 100, 100, 70);
		f.add(btn1);

		Button btn2 = new  Button("�̹���2");
		btn2.setBounds(300, 200, 100, 70);
		f.add(btn2);

		//�̹��� �غ�(�̹��� Ǯ���Ӱ� Ȯ���ڱ��� Ȯ���ϰ� ���ش�.)
		ImageIcon img = new ImageIcon("img01.png");
		ImageIcon img2 = new ImageIcon("img02.png");

		//�̹����� Frame�� �߰��ϱ� ���ؼ� �ݵ�� JLable�� ž���ؾ��Ѵ�.
		JLabel ji = new JLabel(img);
		//����� �̹����� ���߰ų� �̹����� ��濡 ������Ѵ�.
		ji.setBounds(0, 0, 250, 373);

		//�̹����� ���� �߰�(add)�� ���� ���� ���´�.
		//���� �߰��� �̹����� �� �������� �ö�´�.
		f.add(ji);

		//��ưŬ���̺�Ʈ ������
		ActionListener al = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//getActionCommand : ��ư �ؽ�Ʈ ����
				if(e.getActionCommand().equals("�̹���1")) {
					ji.setIcon(img);
				}else {
					ji.setIcon(img2);
				}

			}
		};
		btn1.addActionListener(al);
		btn2.addActionListener(al);
		
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}//main
}
