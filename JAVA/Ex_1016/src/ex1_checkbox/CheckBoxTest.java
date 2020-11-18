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

		Frame f = new Frame("����");
		f.setBounds(500,100,800,250);
		f.setLayout(null);//�ڵ���ġ ����
		//�ڵ���ġ�� �� ��쿡�� ��ǥ�� ��ġ�� ���������� �ʴ´ٸ� add�� �ص� ȭ��� ������ �ʴ´�.
		//�ݵ�� ��ġ ��ǥ!! �����ֱ�!!(�ڵ���ġ�� �� ���!!)


		//�ؽ�Ʈ�� ǥ���ϴ� Label
		Label q1 = new Label("���ɺоߴ�?");
		//�۾�ü, �۾� ����, �۾�ũ��
		Font font = new Font("����",Font.BOLD,30);

		//���� ��ġ���� ũ��
		q1.setBounds(10, 50, 180, 35);
		q1.setBackground(Color.CYAN);
		q1.setFont(font);//q1�� ��Ʈ�� ����.

		//üũ�ڽ� ����
		Checkbox music = new Checkbox("����");
		Checkbox movie = new Checkbox("��ȭ");
		Checkbox book = new Checkbox("����");

		music.setBounds(10, 90, 50, 30);
		movie.setBounds(70, 90, 50, 30);
		book.setBounds(130, 90, 50, 30);
		
		//-----------------------------------------------------
		//üũ�ڽ��� �̺�Ʈ ������ ���	//�͸����� ����
		//üũ�ڽ��� �͸����� ���� üũ�ڽ��� �ϳ��ϳ� ó���ϴ� ���!
		music.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				System.out.println("���ÿ��� : " + e.getStateChange());

				//üũ�ڽ��� ������ �ؽ�Ʈ ������ ����!
				System.out.println(e.getItem().toString()); 

				//���õǾ��� �� 1, �ƴ� �� 2	
				String str = e.getStateChange() == 1 ? "���Ǽ�����":"���Ǽ�������";
				System.out.println(str);
			}
		});

		movie.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {

				String str = e.getStateChange() == 1 ? "��ȭ������":"��ȭ��������";
				System.out.println(str);
			}
		});
		//-----------------------------------------------------
		
		//-----------------------------------------------------
		//�ѹ��� ��� �� �� �ִ�.(ItemListener�� ��ü�� �����ؼ� �������� üũ�ڽ��� �ѹ��� ó���� �� �ִ�.)
		ItemListener it = new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getItem().toString().equals("����")){
					String str = e.getStateChange() == 1 ? "����������":"������������";
					System.out.println(str);
					
				}else if(e.getItem().toString().equals("��ȭ")) {
					String str = e.getStateChange() == 1 ? "��ȭ������":"��ȭ��������";
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
