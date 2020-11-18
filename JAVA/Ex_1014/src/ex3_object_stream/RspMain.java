package ex3_object_stream;

import java.util.Random;
import java.util.Scanner;

public class RspMain {
	public static void main(String[] args) {

		//RspInfo클래스를 활용하여 가위바위보 게임을 제작

		//id : aa
		//가위(s) | 바위(r) | 보(p) : r
		//당신이 이겼습니다.
		//1승 0무 0패
		//다시 하시겠습니까? y | n : y
		//가위(s) | 바위(r) | 보(p) : r
		//당신이 이겼습니다.
		//2승 0무 0패
		//다시 하시겠습니까? y | n : n
		//게임을 종료합니다.

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

		//로드 위치
		ScoreLoader sl = new ScoreLoader(id);
		try {			
			//처음에는 값이 없기 때문에 ... 안에 값이 없다..
			win = sl.getInfo().getWin();
			lose = sl.getInfo().getLose();
			draw = sl.getInfo().getDraw();
			
			info.setWin(win);
			info.setLose(lose);
			info.setDraw(draw);
			
		} catch (Exception e) {

		}

		System.out.printf("%d승 | %d패| %d무 \n", win, lose, draw );

		while(true) {
			//0:가위, 1:바위, 2:보
			int random = new Random().nextInt(3);
			//****************
			//내가 이기는 상황
			//나 : 1  2  0  
			//컴 : 0  1  2

			//비기는 상황
			//나 : 1  0  2
			//컴 : 1  0  2

			//나머지는 모두 지는 상황..
			//*****************
			System.out.print("가위(s) | 바위(r) | 보(p) :");
			String user = sc.next();

			int usercnt = 0;

			//내가 낸
			if(user.equalsIgnoreCase("s")) { 
				usercnt = 0;
			}else if(user.equalsIgnoreCase("r")){ 
				usercnt = 1;				
			}else if(user.equalsIgnoreCase("p")){ 
				usercnt = 2;				
			}else {
				System.out.println("다시 입력해주세요!");
				continue;
			}

			//경우의 수
			if(usercnt - random == -2 || usercnt - random == 1) {
				System.out.println("이겼습니다.");
				info.setWin(++win);
			}else if(usercnt - random == 0) {
				System.out.println("비겼습니다.");
				info.setDraw(++draw);
			}else{
				System.out.println("졌습니다.");
				info.setLose(++lose);
			}
			System.out.printf("%d승 | %d패| %d무 \n", info.getWin(), info.getLose(), info.getDraw());
			System.out.print("다시 하시겠습니까? y | n :");
			String play = sc.next();

			if(!play.equalsIgnoreCase("y")) {
				break;
			}//if
		}//while
		System.out.println("게임 종료");
		//info를 ScoreSave로 넘긴다.
		
		//Throws를 쓸 경우에는 여기서 처리해준다.
//		try {
			new ScoreSave(info);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}//호출만..
	}//main
}
