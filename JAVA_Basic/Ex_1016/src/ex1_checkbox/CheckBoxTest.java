package ex1_checkbox;

import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CheckBoxTest {
	public static void main(String[] args) {

		Frame f = new Frame("질문");
		f.setBounds(500,100,800,250);
		f.setLayout(null);//자동배치 끄기
		//자동배치를 끌 경우에는 좌표와 위치를 지정해주지 않는다면 add를 해도 화면상에 나오지 않는다.
		//반드시 위치 좌표!! 정해주기!!(자동배치를 끌 경우!!)


		//텍스트를 표기하는 Label
		Label q1 = new Label("관심분야는?");
		//글씨체, 글씨 굵기, 글씨크기
		Font font = new Font("굴림",Font.BOLD,30);

		//라벨의 위치값과 크기
		q1.setBounds(10, 50, 180, 35);
		q1.setBackground(Color.CYAN);
		q1.setFont(font);//q1의 폰트가 들어간다.

		//체크박스 생성
		Checkbox music = new Checkbox("음악");
		Checkbox movie = new Checkbox("영화");
		Checkbox book = new Checkbox("독서");

		music.setBounds(10, 90, 50, 30);
		movie.setBounds(70, 90, 50, 30);
		book.setBounds(130, 90, 50, 30);
		
		//-----------------------------------------------------
		//체크박스에 이벤트 감지자 등록	//익명으로 생성
		//체크박스를 익명으로 만들어서 체크박스를 하나하나 처리하는 방법!
		music.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				System.out.println("선택여부 : " + e.getStateChange());

				//체크박스에 쓰여진 텍스트 가지고 오기!
				System.out.println(e.getItem().toString()); 

				//선택되었을 때 1, 아닐 땐 2	
				String str = e.getStateChange() == 1 ? "음악선택함":"음악선택해제";
				System.out.println(str);
			}
		});

		movie.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {

				String str = e.getStateChange() == 1 ? "영화선택함":"영화선택해제";
				System.out.println(str);
			}
		});
		//-----------------------------------------------------
		
		//-----------------------------------------------------
		//한번에 묶어서 할 수 있다.(ItemListener의 객체를 생성해서 여러개의 체크박스를 한번에 처리할 수 있다.)
		ItemListener it = new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getItem().toString().equals("독서")){
					String str = e.getStateChange() == 1 ? "독서선택함":"독서선택해제";
					System.out.println(str);
					
				}else if(e.getItem().toString().equals("영화")) {
					String str = e.getStateChange() == 1 ? "영화선택함":"영화선택해제";
					System.out.println(str);
				}
			}
		};

		book.addItemListener(it);
		movie.addItemListener(it);

		//-----------------------------------------------------

		f.add(q1);
		f.add(music);
		f.add(movie);
		f.add(book);

		f.setVisible(true);

		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

	}//main
}
