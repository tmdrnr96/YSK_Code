package ex1_frame;

import java.awt.Color;
import java.awt.Frame;

public class Ex1_Frame {
	public static void main(String[] args) {

		Frame f = new Frame("인생 첫 프레임");
		f.setSize(400,300);//프레임의 너비와 높이
		f.setLocation(500,400);//프레임의 x,y좌표
		
		f.setBackground(Color.BLUE);//static 변수 Blue..
		
		f.setVisible(true); //생성한 프레임을 노축
		
	}//main
}
