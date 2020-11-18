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
		f.setLayout(null);//�ڵ���ġ ����
		
		//���û���
		Choice blood = new Choice();
		blood.add("�������� �����Դϱ�?");
		blood.add("A��");
		blood.add("B��");
		blood.add("O��");
		blood.add("AB��");
		
		//choice�� �ȿ� ������ �ִ� �۾��� ������ ��ŭ ���̰� �ڵ����� �����̵ȴ�.(�۾�ũ���� ���� �⺻�� ����!)
		//choice��ü�� ���̴� �ȿ� �ִ� ����� ������� �����ǹǷ�
		//0���� �־ �����ϴ�
		blood.setBounds(50, 100, 150, 0);
		
		//choice�� �̺�Ʈ ������ ���(üũ�ڽ��� ���̽��� �̺�Ʈ �����ڴ� ����.)
		blood.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				String str = (String)e.getItem();
				System.out.println("����� �������� " + str);
			}
		});
		
		//frame�� Choice ������Ʈ �߰�!
		f.add(blood);
		f.setVisible(true);
		
		//������ â �ݱ�
		f.addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}//main
}
