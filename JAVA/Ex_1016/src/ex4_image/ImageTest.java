package ex4_image;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class ImageTest {
	public static void main(String[] args) {

		Frame f = new Frame("image Frame");
		f.setLayout(null);
		f.setBounds(500, 200, 300, 300);

		//�̹��� �غ�(�̹��� Ǯ���Ӱ� Ȯ���ڱ��� Ȯ���ϰ� ���ش�.)
		ImageIcon img = new ImageIcon("img01.png");
		ImageIcon img2 = new ImageIcon("img02.png");
		
		//�̹����� Frame�� �߰��ϱ� ���ؼ� �ݵ�� JLable�� ž���ؾ��Ѵ�.
		JLabel ji = new JLabel(img);
		//����� �̹����� ���߰ų� �̹����� ��濡 ������Ѵ�.
		ji.setBounds(0, 0, 150, 373);
		
		
		JLabel ji2 = new JLabel(img2);
		ji2.setBounds(50, 50, 200, 250);

		//�̹����� ���� �߰�(add)�� ���� ���� ���´�.
		//���� �߰��� �̹����� �� �������� �ö�´�.
		f.add(ji);
		f.add(ji2);
		
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}//main
}
