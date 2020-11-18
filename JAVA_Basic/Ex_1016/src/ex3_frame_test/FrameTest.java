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

		Frame frame = new Frame("���� �Է±�");

		frame.setBounds(800, 100, 250, 400);
		frame.setBackground(Color.CYAN);
		frame.setLayout(new BorderLayout());

		//��Ʈ 
		Font font = new Font(Font.SANS_SERIF, Font.PLAIN, 18);


		//���ʴ�-----------------------------------------------
		//������Ʈ���� �ϳ��� ��� �����Ѵ�! �⺻���̾ƿ��� FlowLayout���� �����Ǿ� �ִ�.
		//�ؽ�Ʈ �Է»���, ��ư
		Panel pNorth = new Panel();
		pNorth.setBackground(Color.GREEN);
		pNorth.setFont(font);

		//Ű���忡�� ���� �Է¹ޱ� ���� �Է»���	(����)
		TextField tf = new TextField(15);
		Button btn = new Button("�Է�");
		btn.setEnabled(false); //��ư ��Ȱ��ȭ(false)! ��ư Ȱ��ȭ(true)!
		pNorth.add(tf);
		pNorth.add(btn);
		//		frame.add(pNorth, "North");
		frame.add(pNorth, BorderLayout.NORTH);		
		//���ʴ�-----------------------------------------------

		//���ʴ�-----------------------------------------------
		Panel pSouth = new Panel();
		pSouth.setBackground(Color.MAGENTA);
		//��ư ����
		Button btnSave = new Button("����");
		Button btnClose = new Button("�ݱ�");

		pSouth.add(btnSave);
		pSouth.add(btnClose);

		frame.add(pSouth, BorderLayout.SOUTH);
		//���ʴ�-----------------------------------------------
		//�߾Ӵ�-----------------------------------------------
		//Ű���带 ���� �幮�� �Է¹ް��� �� �� ����ϴ� Ŭ����
		//TextArea ta = new TextArea(�ʱ⹮��,���� ����(����),���Ǳ���(����),��ũ�� ����);
		TextArea ta = new TextArea("",0,0,TextArea.SCROLLBARS_VERTICAL_ONLY);
		ta.setFont(font);
		ta.setEditable(false); //TextArea�� ���� �߰�/�����ϴ� ���� ����
		frame.add(ta, BorderLayout.CENTER);


		//�߾Ӵ�-----------------------------------------------

		//TextFile�� ���� �� ��쿡�� �Է� ��ư�� Ȱ��ȭ-------------------
		tf.addTextListener(new TextListener() {

			@Override
			public void textValueChanged(TextEvent e) {
				//tf(�ؽ�Ʈ �ʵ�)�� ������ ����ִٸ� ��ư ��Ȱ��ȭ!!
				//�ݴ�� �ִٸ� Ȱ��ȭ!
				if(tf.getText().equals("")) {
					btn.setEnabled(false);
				}else {
					btn.setEnabled(true);
				}

			}
		});
		//TextFile�� ���� �� ��쿡�� �Է� ��ư�� Ȱ��ȭ-------------------

		//�Է¹�ư Ŭ���� TextArea�� ���� �߰�----------------------------

		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//ta.append() : ta(TextArea)�� ���� �����Ǿ� ����.
				//ta�� ��� ���� ���뿡 ���ο� ���� �߰��� �̾���̴� �޼���
				ta.append(tf.getText() + "\n");//������ �ִ� ���뿡 �߰������� ����.

				//ta�� ��� ��� �ֿ��� ��°�� ��ü
				//ta.setText(tf.getText());

				//tf�ȿ� �ִ� ���� ����.
				tf.setText("");
				tf.requestFocus();//tf�� Ŀ���� �̵�

			}
		});

		//�Է¹�ư Ŭ���� TextArea�� ���� �߰�----------------------------

		//�ݱ��ư �̺�Ʈ ������ ��� ------------------------------------

		btnClose.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//					System.exit(0); -->�����ִ� ��� ������ ����
				frame.dispose(); //--> ���������Ӹ� ����!
			}
		});

		//�ݱ��ư �̺�Ʈ ������ ��� ------------------------------------
		
		//�����ư �̺�Ʈ ������ ��� ------------------------------------

		btnSave.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//ta(TextArea)�� ������ �����´�.
				String message = ta.getText(); 
				
				FileWriter fw = null;
				
				try {
					FileDialog fd = new FileDialog(frame);
					fd.setVisible(true);
					
					//���� �����ϰ� �;��ϴ� ��ΰ� ���..
//					System.out.println(���� ������ ���� ��� + ���� ���� ���� �̸�);
					System.out.println(fd.getDirectory() + fd.getFile());
					
					// �����ϰ� ���� ���!
					String path = fd.getDirectory() + fd.getFile();
					
					//path ��ο� ���!
					fw = new FileWriter(path);
					fw.write(message);
					
					//���ϸ��� �Է�������!(���ϸ��� �Է��ϰ� ������ ������ ���� ���强��!)
					if(fd.getFile() != null) {
						
//					JOptionPane.showMessageDialog(���� �����ϰ� �ִ� �ֻ���!, message);
						JOptionPane.showMessageDialog(frame, "���� ����");
					}
					
					
				} catch (Exception e2) {
					JOptionPane.showInputDialog(frame, "���� ���� \n �����ڿ��� �����ϼ���");
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
		
		//�����ư �̺�Ʈ ������ ��� ------------------------------------


		frame.setResizable(false);//ũ�� ����Ұ�
		frame.setVisible(true);

		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

	}//main
}
