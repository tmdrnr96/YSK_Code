package ex2_arraylist;

import java.util.ArrayList;

public class UserAarray {
	public static void main(String[] args) {

		ArrayList<User> arr = new ArrayList<User>();
		//������ User��ü�� ������ �� �ִ� ArrayList!
		//Ŭ������ ���ʸ�Ÿ������ ����� �������� ��Ҹ� �ѹ��� ������ �� �ִٴ� �����ִ�.
		//ex) �� ����� ������ �ѹ��� ������ �� �ִ�(�̸�, ����, ��ȭ��ȣ ���..)
		//���ʸ�Ÿ������ �Ϲ� Ÿ������ ���� ������ �ѻ���� ������ ����ϱ� ���ؼ�
		//ArrayList�� ������ �ʿ�.. ����..
		
		User u1 = new User();
		u1.setName("ȫ�浿");
		u1.setAge(20);
		
		User u2 = new User();
		u2.setName("�Ӳ���");
		u2.setAge(30);
		
		arr.add(u1);
		arr.add(u2);
		
		System.out.println(arr);
		
		/*	steak    |    heap
		 * ----------|----------
		 * 	arr		 |	0  <-- u1�� �ּڰ��� �״�� �����´�.
		 * 		 	 |  1  <-- u2�� �ּڰ��� �״�� �����´�.
		 * 			 |
		 *  u1		 |  n : ȫ�浿
		 * 			 |  a : 20
		 * 			 |
		 	u2 		 | 	n : �Ӳ���
		 			 |  a : 30
		
		 * arr.get(0).getAge(); --> 20 //u1�� ���� ���
		 * arr.get(1).getAge(); --> 30 //u2�� ���� ���
		 
		 */
		
		for(int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i).getName());
			System.out.println(arr.get(i).getAge());
		}
		
		
		
		
	}//main
}
