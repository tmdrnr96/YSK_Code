package ex9_button_event;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex2_ButtonEvent {
	public static void main(String[] args) {

		Frame f= new Frame("ButtonEvent 예제!");

		f.setBounds(800, 200, 1000, 500);
		f.setLayout(new FlowLayout());

		Button btn1 = new Button("버튼1");
		Button btn2 = new Button("버튼2");
		Button btn3 = new Button("버튼3");
		Button btn4 = new Button("버튼4");

		btn1.setPreferredSize(new Dimension(200,100));
		btn2.setPreferredSize(new Dimension(200,100));
		btn3.setPreferredSize(new Dimension(200,100));
		btn4.setPreferredSize(new Dimension(200,100));

		f.add(btn1);
		f.add(btn2);
		f.add(btn3);
		f.add(btn4);

		//-------------------------------------------------------------------
		//버튼에 이벤트 감지자 등록하기2
		//인터페이스는 원래 직접 객체를 생성하지 못하지만 ActionListener는 가능하다!
		ActionListener al = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				//System.out.println(e);//e라는 객체한테 클릭한 객체의 정보가 담긴다.
				//				System.out.println(e.getActionCommand());//e.getActionCommanda 버튼에 있는 텍스트를 읽는다.
				//System.out.println("버튼 클릭됨..");
				switch(e.getActionCommand()) {
				case "버튼1":
					System.out.println("안녕");
					break;
					
				case "버튼2":
					Frame f2 = new Frame();
					f2.setBounds(100, 100, 200, 200);
					f2.setVisible(true);
					
					f2.addWindowListener(new WindowAdapter() {
						@Override
						public void windowClosing(WindowEvent e) {
//							System.exit(0);//모든 프레임 종료
							//새로 띄운 특정프레임만 종료하고 싶을때!
							f2.dispose();//해당 프레임만 종료!(f2라는 프레임만 골라서 꺼진다.)
						};
					});
					
					break;
				}

			}
		};

		//반드시 ActionListener의 객체보다 아래에 만들어야한다.
		btn1.addActionListener(al);//btn1의 addActionListener을 실행하면 ActionListener의 메서드 자동실행
		btn2.addActionListener(al);
		btn3.addActionListener(al);
		btn4.addActionListener(al);

		//장점 : 코드가 짧아진다.
		//단점 : 서로 다른 작업을 하지 못하고 하나의 메서드만을 실행..

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
