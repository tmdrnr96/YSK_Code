package ex1_frame;

import java.awt.Color;
import java.awt.Frame;

public class Ex1_Frame {
	public static void main(String[] args) {

		Frame f = new Frame("�λ� ù ������");
		f.setSize(400,300);//�������� �ʺ�� ����
		f.setLocation(500,400);//�������� x,y��ǥ
		
		f.setBackground(Color.BLUE);//static ���� Blue..
		
		f.setVisible(true); //������ �������� ����
		
	}//main
}
