package ex7_flowlayout;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyFlowLayout {
	public static void main(String[] args) {

		Frame f = new Frame("flowLayout예제");
		
		f.setBounds(500, 200, 400, 300);
//		f.setBackground(Color.MAGENTA);s
		
		//프레임 레이아웃 속성을 FlowLayout으로 지정
		//FlowLayout을 지정하면 자동으로 위치를 배치해준다. 
		//또한 window창을 조절하면 window창을 조절할 때도 자동으로
		//조절이 된다..
		
		//하지만 버튼의 사이즈를 바꾸는 방법이 좀 다르다.
		
		f.setLayout(new FlowLayout());
		
		Button btn1 = new Button("버튼1"); 
		Button btn2 = new Button("버튼2"); 
		Button btn3 = new Button("버튼3"); 
		Button btn4 = new Button("버튼4"); 
		Button btn5 = new Button("버튼5"); 
		Button btn6 = new Button("버튼6"); 

		
		//btn1.setSize(200,100); 이렇게 해서 FlowLayout에서의 크기를 변경할 수 없다. 
		//FlowLayout에서의 버튼 크기 변경은 아래와 같이 한다.
		//좌표는 바꿀수 없지만 크기는 이렇게해서 바꿀 수 있다.
		btn1.setPreferredSize(new Dimension(200,100));
		
		f.add(btn1);
		f.add(btn2);
		f.add(btn3);
		f.add(btn4);
		f.add(btn5);
		f.add(btn6);
		
		//기본사이즈(최초에 정해놓은 크기 그래도 유지!!(고정))
		f.setResizable(false);//강제로 window창 크기를 조절할 수 없다.
		f.setVisible(true);
		
		f.addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			};
		});
		
	}//main
}
