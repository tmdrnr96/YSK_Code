package ex3_collection;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class Ex1_Set {
	public static void main(String[] args) {

		//�÷��� �����ӿ�ũ ( ���������� �޸𸮻� �ν��Ͻ��� ������ ���� ���� �������̽�! )
		//������ �׷��� �ٷ�� ǥ���ϱ� ���� ����ȭ�� ����
		//��� �÷��� �����ӿ�ũ�� ���ʸ� Ÿ���̴�

		//�÷����� ����
		//List, Set, Map

		//Set : java.util��Ű���� �����ϴ� �������̽�
		//Ư�� �ڵ忡�� �ߺ��� ���� ����ϸ� �ȵǴ� ��쿡 ���

		//Set�� �����ϴ� ��ǥ���� �ڽ�Ŭ������
		//HashSet : ������ �ȵǰ�, �ߺ��� ���� ������� �ʴ´�, �ε����� ���⶧���� ���� �������Ⱑ ���ŷӴ�.
		//TreeSet : �������� ������ �ȴ�.(����, �ѱ�, ���� ���������� ������������ �ȴ�.),�ߺ��� ���� ������� �ʴ´�, �ε����� ���⶧���� ���� �������Ⱑ ���ŷӴ�.

		HashSet<Integer> hs1 = new HashSet<Integer>();
		hs1.add(3);
		hs1.add(3);
		hs1.add(2);
		hs1.add(1);
		hs1.remove(3);
		System.out.println(hs1.size());
		System.out.println(hs1);

		//HashSet�� �ε����� ����..
		//add�� �Ѵٰ� �ؼ� ������� ���� �߰��� �Ǵ� ���� �ƴϴ�..	
		//�ߺ��� ���̴��� ������� �ʴ´�.(�ߺ��� ���� ���� ���� ���� �ʴ´�.)

		System.out.println("--------------------------------------");

		//HashSet���� �ζ� ��ȣ ������ �����
		HashSet<Integer> lotto = new HashSet<Integer>();

		while(true) {

			int r = new Random().nextInt(45) + 1;
			lotto.add(r); //while���� ���鼭 ���� Random���� �߰��Ѵ�.
			//HashSet�� �ߺ����� ������� �ʱ� ������ �ߺ�üũ�� �� �ʿ䰡 ����.

			//�ߺ��� ���� ���� ������ size�� 6�϶� while���� �������´�.
			if(lotto.size() == 6) {
				break;
			}//if

		}//while

		System.out.println(lotto);

		System.out.println("-------------------------------------");

		//���׸� Ÿ���� String���� ���� 

		HashSet<String> hs2 = new HashSet<String>();
		hs2.add("ȫ�浿");
		hs2.add("������");
		hs2.add("�۰�ȣ");

		System.out.println( hs2 );

		System.out.println("-------------------------------------");

		//TreeSet���� �ζ� ��ȣ ������ �����
		TreeSet<Integer> ts1 = new TreeSet<Integer>();

		while(true) {

			int v = new Random().nextInt(45)+1;
			ts1.add(v);

			if(ts1.size() == 6) {
				break;

			}//if

		}//while

		System.out.println(ts1);

		System.out.println("-------------------------------------");

		TreeSet<String> name = new TreeSet<String>();

		name.add("������");
		name.add("�۰�ȣ");
		name.add("������");

		System.out.println(name);
		
		System.out.println("-------------------------------------");
	}//main
}


















