package ex3_collection;

import java.util.HashMap;

public class Ex3_Map {
	public static void main(String[] args) {

		//Map : Ű(Key)�� ��(Value)�� ��� �ϳ��� �����Ѵ�.
		//Ű�� ���� ���� �˻��ϹǷ� ���� ���� �����͸� �˻��ϴµ� �־ �ſ� �پ ������ ����
		//set�� ���������� �ε����� ����.(set�� �ٸ��� key������ ���� �ε����� ���� �ʿ�� ���� �����Ƿ� ���� ���δ�.)
		//Map�� �������̽��� ���������� ��ü�� ������ �� ����.
		HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
		//map�� �����ϰ� ���� �߰��� ��, put�� ���� ���� �־��ش�(set, list�� ��� add�� ���� �߰��Ѵ�.)
		map.put(1,true);
		map.put(2,false);
		System.out.println(map.size());

		//�޸�
		//map���� put�� �� ������ key���� value���� ���� �߰��Ѵ�.

		//		1			2
		//	   true		  false

		boolean res = map.get(2);		
		System.out.println(res);

		System.out.println("---------------------------------");

		HashMap<String, String> map2 = new HashMap<String, String>();

		//map������ �ߺ��� key���� ����� �� ����.
		//Ű���� �ߺ��ȴٸ� �������� �߰��� key������ value�� ��ü�ȴ�.

		//map�� Ű���� �ߺ��� ������� ������ value�� ���� ����� �����ϴ�.
		map2.put("k1", "����  key�� k1");
		map2.put("k1", "hi");

		map2.put("k2", "����  key�� k2");
		map2.put("k3", "����  key�� k3");
		map2.put("k4", "hi");

		//remove�� ���� k2�� �����Ѵٸ�, k1�� k3�� ���� �����ϰ� k2�� ������ ����,
		//k2�� �ƹ��� �������� �ʾ� �������÷��ͷ� ���� ��������.
		map2.remove("k2");


		System.out.println(map2.size());
		System.out.println(map2.get("k3"));

		//�迭�� �ѹ��� ����ϸ� �ּڰ��� ��������, �÷����� ��� �ѹ��� ����� �����ϴ�.
		System.out.println(map2);
		//���� key���� ������ null���� ���´�.

		//map2�� k3��� key���� ������ �ֽ��ϱ�?
		//map2�� k3��� �̸��� Ű���� �����ϰ� �ִٸ� true
		if(map2.containsKey("k3")) {
			System.out.println("k3 key�� �����մϴ�");
		}
		//containsKey : Ư�� key���� �����ϰ� �ִ��� ?

		//map2�� hi��� value���� ������ �ֽ��ϱ�? ������ �ִٸ� true
		if(map2.containsValue("hi")) {
			System.out.println("hi��� value�� �����մϴ�.");
		}
		//containsValue : Ư�� value���� �����ϰ� �ִ���?
		//Ű���� �ߺ��� �� ������ value���� �ߺ��� �� �ִ�.
		//������ hi��� value���� �ߺ��ȴٰ� �������� �� Ű���� hi�� ���� key���� � key���� �˼� ����... 
	}//main
}
