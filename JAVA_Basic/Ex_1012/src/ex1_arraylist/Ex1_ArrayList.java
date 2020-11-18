package ex1_arraylist;

import java.util.ArrayList;

public class Ex1_ArrayList {
	public static void main(String[] args) {

		//ArrayList : �÷����� �� �����ν� List�� �����ϴ� ��ǥ���� �ڽ�Ŭ����
		//index�� ���̿� ������ ����, index��ȣ�� ���� ������ �����ϴٴ� ������ �ִ�.

		ArrayList<Integer> list = new ArrayList<Integer>();

		//stack | heap
//		--------|-------
//		 list   | �� �͸� ������ �ִ�.

		list.add(100);
		list.add(20);
		list.add(30);
		list.add(300);
		list.remove(2); //2��° index�� 30�� ����
		//remove�� ���� �ش��ϴ� value ���� �����ϴ� set���� �ٸ��� arrayList�� �ش� index���� �����.
		//��ũ����Ʈ�� remove�ÿ� ���� �ε����� ���ֱ� ���� ������ ����� �յڸ� �̸� ������ ������.. 
		//������ �����������, �ڹ��� arrayList��  remove�� ���شٸ� �ڵ����� ����� �̾��� �Ŀ� ������ �����ϴ�.(arrayList �� �����..)
		list.add(100);
		//arrayList�� �ߺ��� ���� �����ϴ� ����� ������ ���� �ʴ�.(�ߺ��� ���..)
		list.set(2, 200);//2��° index�� �����͸� 200���� ����
		list.add(1,500);//1��° index�� ������ 500�� �߰�!(���ϴ� index�� ���� �߰��� �� �ִ�.)
		//1��° index�� �ִ� �����ͺ��� index�� 1���� �ڷ� �з�����.
		//		list.clear(); //--> list�� ���� ��� ������ ����(size()�� 0���� �����.)

		//remove(����), set(����), add(�� �߰�), clear(size 0���� �����(����Ʈ�� ���� ���� ���� �� ���..))

		System.out.println(list.get(2)); //index�� �����ؼ� ���ϴ� ���� ����� �����ϴ�.

		//stack | heap
		//		--------|-------
		//		 	    | 100 
		//		 list   | 20
		//		 	    | 30
		// 	    		| 300

		// �迭�� ���� ���ȣ�� ���������� ���� �ʴ�.


		System.out.println(list);
		System.out.println("����  : " + list.size());

		System.out.println("---------------------------------------------");

		//for���� ����Ͽ� ����Ʈ�� ���� ��� �����͸� ȭ�鿡 ���

		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		

	}//main
}
