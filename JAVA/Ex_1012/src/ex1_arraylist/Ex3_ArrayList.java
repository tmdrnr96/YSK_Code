package ex1_arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex3_ArrayList {
	public static void main(String[] args) {

		//id: aaa
		//[aaa]
		//arrayList�� ���� �߰�..
		//while���� ���鼭 id�� �߰�!
		//id : bbb
		//[aaa, bbb]
		//.....
		//id : aaa
		//�ߺ��� ���̵�
		//id : ccc
		//[aaa, bbb, ccc]


		Scanner sc = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<>();

		 out: while(true) {
			System.out.print("id : " );
			String str = sc.next();

			//�ߺ�üũ
//			if(list.contains(str)) {
//				System.out.println("���̵� �ߺ�");
//				continue out;
//			}
						
			//�ߺ�üũ
			for(int i = 0; i < list.size(); i++) {
				if(str.equals(list.get(i))) {
					System.out.println(str + "�� �ߺ��� ���̵� �Դϴ�.");
					continue out;
				}//if
			}//for
			list.add(str);	
			System.out.println(list);

		}//while


	}//main
}
