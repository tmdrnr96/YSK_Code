package ex3_object_stream;

import java.util.Random;
import java.util.Scanner;

public class RspMain {
	public static void main(String[] args) {

		//RspInfoŬ������ Ȱ���Ͽ� ���������� ������ ����

		//id : aa
		//����(s) | ����(r) | ��(p) : r
		//����� �̰���ϴ�.
		//1�� 0�� 0��
		//�ٽ� �Ͻðڽ��ϱ�? y | n : y
		//����(s) | ����(r) | ��(p) : r
		//����� �̰���ϴ�.
		//2�� 0�� 0��
		//�ٽ� �Ͻðڽ��ϱ�? y | n : n
		//������ �����մϴ�.

		RspInfo info = new RspInfo();
		Scanner sc = new Scanner(System.in);

		String id = "";
		int win = 0;
		int lose = 0;
		int draw = 0;

		//		String comResult = "";

		System.out.print("id :");
		id = sc.next();
		info.setId(id);

		//�ε� ��ġ
		ScoreLoader sl = new ScoreLoader(id);
		try {			
			//ó������ ���� ���� ������ ... �ȿ� ���� ����..
			win = sl.getInfo().getWin();
			lose = sl.getInfo().getLose();
			draw = sl.getInfo().getDraw();
			
			info.setWin(win);
			info.setLose(lose);
			info.setDraw(draw);
			
		} catch (Exception e) {

		}

		System.out.printf("%d�� | %d��| %d�� \n", win, lose, draw );

		while(true) {
			//0:����, 1:����, 2:��
			int random = new Random().nextInt(3);
			//****************
			//���� �̱�� ��Ȳ
			//�� : 1  2  0  
			//�� : 0  1  2

			//���� ��Ȳ
			//�� : 1  0  2
			//�� : 1  0  2

			//�������� ��� ���� ��Ȳ..
			//*****************
			System.out.print("����(s) | ����(r) | ��(p) :");
			String user = sc.next();

			int usercnt = 0;

			//���� ��
			if(user.equalsIgnoreCase("s")) { 
				usercnt = 0;
			}else if(user.equalsIgnoreCase("r")){ 
				usercnt = 1;				
			}else if(user.equalsIgnoreCase("p")){ 
				usercnt = 2;				
			}else {
				System.out.println("�ٽ� �Է����ּ���!");
				continue;
			}

			//����� ��
			if(usercnt - random == -2 || usercnt - random == 1) {
				System.out.println("�̰���ϴ�.");
				info.setWin(++win);
			}else if(usercnt - random == 0) {
				System.out.println("�����ϴ�.");
				info.setDraw(++draw);
			}else{
				System.out.println("�����ϴ�.");
				info.setLose(++lose);
			}
			System.out.printf("%d�� | %d��| %d�� \n", info.getWin(), info.getLose(), info.getDraw());
			System.out.print("�ٽ� �Ͻðڽ��ϱ�? y | n :");
			String play = sc.next();

			if(!play.equalsIgnoreCase("y")) {
				break;
			}//if
		}//while
		System.out.println("���� ����");
		//info�� ScoreSave�� �ѱ��.
		
		//Throws�� �� ��쿡�� ���⼭ ó�����ش�.
//		try {
			new ScoreSave(info);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}//ȣ�⸸..
	}//main
}
