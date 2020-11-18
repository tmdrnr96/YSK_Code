package ex3_updown;

import java.util.Random;

public class GameClass {

	private int random = new Random().nextInt(50)+1;
	//추가
	private int count = 0;
	private boolean result = false;

	public boolean check(int n){//up인지, Down인지, 정답인지를 판단하는 메서드 
		count++;
		
		//정답처리
		if(random > n ) {			
			System.out.println("UP!");			
		}else if(random < n){
			System.out.println("DOWN!");
		}else {
			System.out.println(count + "회 만에 정답!");
			result = true;
		}
		return result;

	}

}
