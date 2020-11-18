package ex8_borderlayout;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyBorderLayout {
	public static void main(String[] args) {

		Frame f = new Frame("BorderLayout 예제");
		f.setBounds(500, 300, 400, 300);
		
		//BorderLayout은 동,서,남,북,중앙의 다섯위치 중 어디에 배치시킬 것인지를
		//지정해서 자리를 잡아주는 레이아웃
		f.setLayout(new BorderLayout());
		
		Button btn1 = new Button("북");
		Button btn2 = new Button("서");
		Button btn3 = new Button("중앙");
		Button btn4 = new Button("동");
		Button btn5 = new Button("남");
		
		//FlowLayout과 마찬가지로 컴포넌트의 크기를 바꾸고 싶다면 아래 코드를 이용한다.!
		//btn1.setSize(400,100); 옆에 코드로 사이즈를 바꿀 수 없다.
		btn1.setPreferredSize(new Dimension(400,100));
		
		f.add(btn1, "North"); //BorderLayout없이 BorderLayout 방향을 지정할 수 있다.(단! 앞글자는 반드시 대문자!)
		f.add(btn2, BorderLayout.WEST);
		f.add(btn3, BorderLayout.CENTER);
		f.add(btn4, BorderLayout.EAST);
		f.add(btn5, BorderLayout.SOUTH);
		

		
		f.setVisible(true);
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
			System.exit(0);
			}
		});
	}//main
}
