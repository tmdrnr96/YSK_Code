package ex2_choice;

import java.awt.Choice;
import java.awt.Frame;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex1_Choice {
	public static void main(String[] args) {

		Frame f = new Frame("Choice");
		
		f.setBounds(400, 200, 300, 250);
		f.setLayout(null);//자동배치 끄기
		
		//선택상자
		Choice blood = new Choice();
		blood.add("혈액형은 무엇입니까?");
		blood.add("A형");
		blood.add("B형");
		blood.add("O형");
		blood.add("AB형");
		
		//choice는 안에 쓰여져 있는 글씨의 사이즈 만큼 높이가 자동으로 설정이된다.(글씨크기의 맞춰 기본값 설정!)
		//choice객체의 높이는 안에 있는 목록의 사이즈로 결정되므로
		//0으로 넣어도 무관하다
		blood.setBounds(50, 100, 150, 0);
		
		//choice의 이벤트 감지자 등록(체크박스와 초이스의 이벤트 감지자는 같다.)
		blood.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				String str = (String)e.getItem();
				System.out.println("당신의 혈액형은 " + str);
			}
		});
		
		//frame에 Choice 컴포넌트 추가!
		f.add(blood);
		f.setVisible(true);
		
		//윈도우 창 닫기
		f.addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}//main
}
