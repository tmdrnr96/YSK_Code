package ex6_button;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ButtonTest {
	public static void main(String[] args) {

		Frame f = new Frame("프레임");
		f.setBounds(200, 200, 400, 400);
		//setLayout을 지정하지 않으면.. 프레임에 꽉 채워넣는 방식으로 컴포넌트를 배치한다.
		f.setLayout(null); // null을 해주면 "자동배치"를 끈다.
		//자동배치를 OFF(끄면)하면 컴포넌트의 위치를 하나하나 직접 지정해줘야한다.
		
		//프레임에 자동배치를 끄는 순간부터는
		//프레임에 추가될 컴포넌트들(버튼 등등..)이 
		//각각의 size와 Location속성을 가지고 있어야한다.
		
		Button btnOK = new Button("확인");
		Button btnClose = new Button("닫기");
		
		//왼쪽에서 70픽셀, 위에서 90픽셀 위치에 가로 100 세로50의 컴포넌트를 배치한다.
		btnOK.setBounds(70, 90, 100, 50);
		btnClose.setBounds(225,90,100,50);
		
		//frame에 버튼을 추가!
		f.add(btnOK); //눈에 보이는 것은 모두 다 컴포넌트!(버튼, 프레임, 체크박스 모두 다!)
		f.add(btnClose);
		
		f.setVisible(true);

		//WindowAdapter WindowListener를 구현하고 있음.. 원하는 것만 골라서 쓸 수 있음.
		f.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			};
		});

	}//main
}
