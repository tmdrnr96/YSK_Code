package ex1_arraylist;

import java.util.ArrayList;

public class Ex2_ArrayList {
	public static void main(String[] args) {

		//���� �߰��Ǿ� �ִ� list�� ������ �Ʒ��� list�� ������� ����Ͻÿ�
		//[ȫ�浿, �Ż��Ӵ�, �ڱ浿, �����]
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("ȫ�浿");
		list.add("�ڱ浿");
		list.add("�̼���");
		list.add("������");
		System.out.println(list);
		
		list.add(1,"�Ż��Ӵ�");
		list.set(3, "�����");
		list.remove(4);
		System.out.println(list);
		
	}//main
}
