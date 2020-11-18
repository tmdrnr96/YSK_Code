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

		Button btn1 = new  Button("이미지1");
		btn1.setBounds(300, 100, 100, 70);
		f.add(btn1);

		Button btn2 = new  Button("이미지2");
		btn2.setBounds(300, 200, 100, 70);
		f.add(btn2);

		//이미지 준비(이미지 풀네임과 확장자까지 확실하게 써준다.)
		ImageIcon img = new ImageIcon("img01.png");
		ImageIcon img2 = new ImageIcon("img02.png");

		//이미지를 Frame에 추가하기 위해선 반드시 JLable에 탑재해야한다.
		JLabel ji = new JLabel(img);
		//배경을 이미지에 맞추거나 이미지를 배경에 맞춰야한다.
		ji.setBounds(0, 0, 250, 373);

		//이미지는 먼저 추가(add)한 것이 위로 나온다.
		//먼저 추가한 이미지가 더 위쪽으로 올라온다.
		f.add(ji);

		//버튼클릭이벤트 감지자
		ActionListener al = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//getActionCommand : 버튼 텍스트 감지
				if(e.getActionCommand().equals("이미지1")) {
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
