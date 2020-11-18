package ex3_frame_test;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FileDialog;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class FrameTest {
	public static void main(String[] args) {

		Frame frame = new Frame("문장 입력기");

		frame.setBounds(800, 100, 250, 400);
		frame.setBackground(Color.CYAN);
		frame.setLayout(new BorderLayout());

		//폰트 
		Font font = new Font(Font.SANS_SERIF, Font.PLAIN, 18);


		//북쪽단-----------------------------------------------
		//컴포넌트들을 하나로 묶어서 관리한다! 기본레이아웃은 FlowLayout으로 설정되어 있다.
		//텍스트 입력상자, 버튼
		Panel pNorth = new Panel();
		pNorth.setBackground(Color.GREEN);
		pNorth.setFont(font);

		//키보드에서 값을 입력받기 위한 입력상자	(길이)
		TextField tf = new TextField(15);
		Button btn = new Button("입력");
		btn.setEnabled(false); //버튼 비활성화(false)! 버튼 활성화(true)!
		pNorth.add(tf);
		pNorth.add(btn);
		//		frame.add(pNorth, "North");
		frame.add(pNorth, BorderLayout.NORTH);		
		//북쪽단-----------------------------------------------

		//남쪽단-----------------------------------------------
		Panel pSouth = new Panel();
		pSouth.setBackground(Color.MAGENTA);
		//버튼 생성
		Button btnSave = new Button("저장");
		Button btnClose = new Button("닫기");

		pSouth.add(btnSave);
		pSouth.add(btnClose);

		frame.add(pSouth, BorderLayout.SOUTH);
		//남쪽단-----------------------------------------------
		//중앙단-----------------------------------------------
		//키보드를 통해 장문을 입력받고자 할 때 사용하는 클래스
		//TextArea ta = new TextArea(초기문장,행의 길이(세로),열의길이(가로),스크롤 여부);
		TextArea ta = new TextArea("",0,0,TextArea.SCROLLBARS_VERTICAL_ONLY);
		ta.setFont(font);
		ta.setEditable(false); //TextArea에 값을 추가/수정하는 것을 방지
		frame.add(ta, BorderLayout.CENTER);


		//중앙단-----------------------------------------------

		//TextFile에 값이 들어간 경우에만 입력 버튼을 활성화-------------------
		tf.addTextListener(new TextListener() {

			@Override
			public void textValueChanged(TextEvent e) {
				//tf(텍스트 필드)에 내용이 비어있다면 버튼 비활성화!!
				//반대로 있다면 활성화!
				if(tf.getText().equals("")) {
					btn.setEnabled(false);
				}else {
					btn.setEnabled(true);
				}

			}
		});
		//TextFile에 값이 들어간 경우에만 입력 버튼을 활성화-------------------

		//입력버튼 클릭시 TextArea에 내용 추가----------------------------

		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//ta.append() : ta(TextArea)에 값이 누적되어 들어간다.
				//ta에 담긴 기존 내용에 새로운 값을 추가로 이어붙이는 메서드
				ta.append(tf.getText() + "\n");//기존에 있던 내용에 추가적으로 들어간다.

				//ta에 담긴 모든 애용을 통째로 교체
				//ta.setText(tf.getText());

				//tf안에 있는 값을 비운다.
				tf.setText("");
				tf.requestFocus();//tf로 커서를 이동

			}
		});

		//입력버튼 클릭시 TextArea에 내용 추가----------------------------

		//닫기버튼 이벤트 감지자 등록 ------------------------------------

		btnClose.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//					System.exit(0); -->열려있는 모든 프레임 종료
				frame.dispose(); //--> 현재프레임만 종료!
			}
		});

		//닫기버튼 이벤트 감지자 등록 ------------------------------------
		
		//저장버튼 이벤트 감지자 등록 ------------------------------------

		btnSave.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//ta(TextArea)의 내용을 가져온다.
				String message = ta.getText(); 
				
				FileWriter fw = null;
				
				try {
					FileDialog fd = new FileDialog(frame);
					fd.setVisible(true);
					
					//내가 저장하고 싶어하는 경로가 뜬다..
//					System.out.println(내가 지정한 파일 경로 + 내가 정한 파일 이름);
					System.out.println(fd.getDirectory() + fd.getFile());
					
					// 저장하고 싶은 경로!
					String path = fd.getDirectory() + fd.getFile();
					
					//path 경로에 기록!
					fw = new FileWriter(path);
					fw.write(message);
					
					//파일명을 입력했을때!(파일명을 입력하고 저장을 눌렀을 때만 저장성공!)
					if(fd.getFile() != null) {
						
//					JOptionPane.showMessageDialog(나를 포장하고 있는 최상위!, message);
						JOptionPane.showMessageDialog(frame, "저장 성공");
					}
					
					
				} catch (Exception e2) {
					JOptionPane.showInputDialog(frame, "저장 실패 \n 관리자에게 문의하세요");
				}finally {
					try {
						fw.close();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		});
		
		//저장버튼 이벤트 감지자 등록 ------------------------------------


		frame.setResizable(false);//크기 변경불가
		frame.setVisible(true);

		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

	}//main
}
