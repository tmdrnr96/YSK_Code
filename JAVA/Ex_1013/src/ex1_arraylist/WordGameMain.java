package ex1_arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class WordGameMain {
	public static void main(String[] args) {

		ArrayList<String> arr = new ArrayList<String>();
		String[] data = {"apple","banana","grape","pear"};
	
		Scanner sc = new Scanner(System.in);
		
		//***
		//�⺻�ڷ����� �ѱ�� ���纻�� �Ѿ��.
		//��ü�� �ѱ�� �ּҰ��� �Ѿ��(���纻�� x)
		WordGame wg = new WordGame(arr, data);
		//�ּҰ��� �Ѱ��(�ּҰ� ���� ����) ������ ���⼭ arr�� data�� ���� �߰��ȴٸ� 
		//Main������ ���� �ٲ��.
	
		wg.start();//������ ����
		//run�޼��忡 arr�� �ܾ �߰��� ��, �ð��� �ʿ��ϴ�.
		
		//* ��ĳ�ʸ� �̿��� �ð� ����..
//		Scanner sc = new Scanner(System.in);//���� �ޱ� ���� �غ� �Ϸ��� �ð��� �ʿ���
		
		//*�ð��� ���� ���� Thread.sleep�� �̿�
		try {
			Thread.sleep(100);//0.1�� ����..
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
			
		while(true) {
			
			//�������� ó��
			if(arr.size() == 0) {
				System.out.println("Ŭ����!");
				wg.setPlaying(false);//������ ����!
				break;//while���� �������´�.
			}
			
			
			System.out.println(arr);
			System.out.println(">> ");
			String in = sc.next();
			
			//����ڰ� �Է��� �ܾ�� ��ġ�ϴ� ���� arr���� �˻�
			for(int i = 0; i < arr.size(); i++) {
				if(in.equalsIgnoreCase(arr.get(i))) {
					arr.remove(i);
					break;
				}//if
			}
			
		}//while
		
	}//main
}
