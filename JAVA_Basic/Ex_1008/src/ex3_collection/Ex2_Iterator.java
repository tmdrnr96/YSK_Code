package ex3_collection;

import java.util.HashSet;
import java.util.Iterator;

public class Ex2_Iterator {
	public static void main(String[] args) {

		HashSet<Integer> set = new HashSet<Integer>();

		set.add(45);
		set.add(30);
		set.add(15);
		set.add(7);

		System.out.println(set);

		//Iterator(�ݺ���) : 
		//Set������ Ư�� �ε����� ������ �Ұ����ϱ� ������
		//������ ������ ���ؼ��� Iterator��� �ݺ��ڸ� ����ؾ� �Ѵ�.

		//Iterator�� �޼���
		//boolean hasNext(); -> �޼ҵ�� �о� �� ��Ұ� �����ִ��� Ȯ���ϱ� ���� �޼ҵ�, ������ true������ false
		//Object next(); -> �޼ҵ�� �о� �� ��Ұ� �����ִ��� Ȯ���ϱ� ���� �޼ҵ�, ������ true������ false
		//void remove(); -> next�� �о�� ��Ҹ� �����Ѵ�.

		//�����ϰ� ���� ��ü�� Ÿ������ ���ʸ�Ÿ���� ����Ѵ�.
		//Iterator�� �������̽� �̱⶧���� ���������� ��ü�� ������ �� ����.
		Iterator<Integer> it = set.iterator();
		//�ε����� ���� set�� �տ� ������ Ŀ���� �����Ѵ�.

		//set�� �߰��� ������ arr�� �迭�� �Ű� ��´�.
		int[] arr = new int[set.size()];

		for(int i = 0; i < arr.length; i++){
			arr[i] = it.next();
			System.out.print(arr[i] + " ");
		}//for

		System.out.println( "\n"+ arr[2]);
	}//main

}
