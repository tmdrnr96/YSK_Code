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

		//이미지 준비(이미지 풀네임과 확장자까지 확실하게 써준다.)
		ImageIcon img = new ImageIcon("img01.png");
		ImageIcon img2 = new ImageIcon("img02.png");
		
		//이미지를 Frame에 추가하기 위해선 반드시 JLable에 탑재해야한다.
		JLabel ji = new JLabel(img);
		//배경을 이미지에 맞추거나 이미지를 배경에 맞춰야한다.
		ji.setBounds(0, 0, 150, 373);
		
		
		JLabel ji2 = new JLabel(img2);
		ji2.setBounds(50, 50, 200, 250);

		//이미지는 먼저 추가(add)한 것이 위로 나온다.
		//먼저 추가한 이미지가 더 위쪽으로 올라온다.
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
