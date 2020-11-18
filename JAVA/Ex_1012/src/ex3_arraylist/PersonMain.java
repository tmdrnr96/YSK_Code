package ex3_arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonMain {
	public static void main(String[] args) {

		//		id :aaa
		//		pwd : 1111
		//		aaa, 1111
		//		----------------------------
		//		id :bbb
		//		pwd : 2222
		//		aaa, 1111
		//		bbb, 2222
		//		----------------------------
		//		id:bbb
		//		pwd:3333
		//		�̹� ��ϵ� ���̵� �Դϴ�.
		//		----------------------------
		//		id :

		ArrayList<Person> arr = new ArrayList<Person>();

		Scanner sc = new Scanner(System.in);

		//		Person p1 = new Person(); //1) �Ʒ� �ִ� �޸� ���� Ȯ�� 

		out:while(true) {
			Person p1 = new Person(); //2) �Ʒ� �ִ� �޸� ���� Ȯ��

			System.out.print("id :" );
			p1.setId(sc.next());

			System.out.print("pwd : ");
			p1.setPwd(sc.nextInt());

			//���̵� �ߺ�üũ
			for(int i = 0; i < arr.size(); i++) {
				if(p1.getId().equalsIgnoreCase(arr.get(i).getId())) {
					System.out.println("�̹� ��ϵ� ���̵� �Դϴ�.");
					continue out;
				}//if
			}//for

			arr.add(p1);

			for(int i = 0; i < arr.size(); i++) {					
				System.out.printf("%s, %d\n", arr.get(i).getId(), arr.get(i).getPwd());
			}//for

			System.out.println("----------------------------");
		}//while

		/* 1) �޸� ����
		 * stack   | heap
		 * --------|-----------
		 * arr     | 0 <---arr ���ο� ���� �����Ǹ鼭 �ּڰ� ����
		 *         | 1 <---arr ���� p1�� �����ϰԵȴ�..(�ּҸ� �����ϰ� �Ǿ..)
		 *         | 		���� arr�ȿ��� ��� p1�� �ּڰ��� �����ϰ� �ȴ�.
		 *         |
		 * p1      | id : aaa	<-- ���� ��� �ٲ�鼭 ��� �ε����� ���� �����Ѵ�..
		 *         | pwd :1111
		 * 
		 */

		/* 2) �޸� ����
		 * stack   | heap
		 * --------|-----------
		 * arr     | 0  <---arr ���ο� ���� �����Ǹ鼭 �ּڰ� ����
		 *         | 1  <-- ���Ӱ� ��ü������ �� p1�� ���ο� ���ּҸ� �����޴´�.
		 *         | 		
		 *         |
		 * p1      | id : aaa	<- p1�� ���ּҰ� �ٲ���µ��� �ұ��ϰ� arr[0]���� �����ϱ� ������
		 *         | pwd :1111		�������÷��Ϳ� ���� ���ŵ��� �ʰ� ���� �����ȴ�.
		 *         |
		 * p1      | id : aaa	<-while���� ���鼭 ���Ӱ� p1�� ���Ӱ� ��ü������ �ϱ� ������ ���� ���ּҴ�
		 *         | pwd :1111		�ذ� ���ο� �ּҷ� ���������.
		 *         
		 * 
		 */


	}//main
}
