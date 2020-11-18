package ex3_window_listener;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FrameEvent {
	public static void main(String[] args) {

		Frame f = new Frame("우상단 이벤트");
		
		//setBounds() :Location과 size를 한번에 설정할 수 있는 메서드!
		//setBounds(x좌표,y좌표,너비width,높이height)
		f.setBounds(500,200,400,300);
		
		//프레임에서 우산단 버튼의 이벤트 감지자 등록
//		f.addWindowListener(new WindowListener); 이렇게 만들면 추상메서드를 구현해야하는 오버라이딩 메서드가 많이 나온다..(코드 복잡..) 
		f.addWindowListener(new MyTestListener());
		//window창을 눌렀을 때 자동적으로 addWindowListener에서 메서드 호출 해당 메서드가 호출되면서 이벤트 처리가 된다..
		
		
		//setVisible 일반적으로 가장 아래에 만든다.. 
		f.setVisible(true);
		
	}//main
}
