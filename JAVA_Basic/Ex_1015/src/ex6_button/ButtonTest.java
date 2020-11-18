package ex6_button;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ButtonTest {
	public static void main(String[] args) {

		Frame f = new Frame("������");
		f.setBounds(200, 200, 400, 400);
		//setLayout�� �������� ������.. �����ӿ� �� ä���ִ� ������� ������Ʈ�� ��ġ�Ѵ�.
		f.setLayout(null); // null�� ���ָ� "�ڵ���ġ"�� ����.
		//�ڵ���ġ�� OFF(����)�ϸ� ������Ʈ�� ��ġ�� �ϳ��ϳ� ���� ����������Ѵ�.
		
		//�����ӿ� �ڵ���ġ�� ���� �������ʹ�
		//�����ӿ� �߰��� ������Ʈ��(��ư ���..)�� 
		//������ size�� Location�Ӽ��� ������ �־���Ѵ�.
		
		Button btnOK = new Button("Ȯ��");
		Button btnClose = new Button("�ݱ�");
		
		//���ʿ��� 70�ȼ�, ������ 90�ȼ� ��ġ�� ���� 100 ����50�� ������Ʈ�� ��ġ�Ѵ�.
		btnOK.setBounds(70, 90, 100, 50);
		btnClose.setBounds(225,90,100,50);
		
		//frame�� ��ư�� �߰�!
		f.add(btnOK); //���� ���̴� ���� ��� �� ������Ʈ!(��ư, ������, üũ�ڽ� ��� ��!)
		f.add(btnClose);
		
		f.setVisible(true);

		//WindowAdapter WindowListener�� �����ϰ� ����.. ���ϴ� �͸� ��� �� �� ����.
		f.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			};
		});

	}//main
}
