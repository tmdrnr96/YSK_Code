package ex3_collection;

import java.util.HashMap;
import java.util.Scanner;

public class Ex4_Map {
	public static void main(String[] args) {

//		//id : hong
//		//pwd : 3333
//		//��й�ȣ�� ��ġ���� �ʽ��ϴ�.
//		
//		//id : john
//		//pwd : 1111
//		//���̵� �������� �ʽ��ϴ�.
//		
//		//id :hong
//		//pwd :2222
//		//�α��� ����!!
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("kim", 1111);
		map.put("hong", 2222);
		map.put("lee", 3333);
		map.put("park", 4444);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("id : ");
		String id = sc.next();
		
		System.out.print("pwd : ");
		int pwd = sc.nextInt();
		
		if(map.containsKey(id)) {
			//���̵� �����ϴ� ��� ��й�ȣ ��
			if(map.get(id) == pwd ) {
				
				System.out.println("�α��� ����!!");
				
			}else {
				System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
			}
		}else {
			System.out.println("���̵� �������� �ʽ��ϴ�");
		}
	}//main
}
