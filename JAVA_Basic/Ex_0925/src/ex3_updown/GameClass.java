package ex3_updown;

import java.util.Random;

public class GameClass {

	private int random = new Random().nextInt(50)+1;
	//�߰�
	private int count = 0;
	private boolean result = false;

	public boolean check(int n){//up����, Down����, ���������� �Ǵ��ϴ� �޼��� 
		count++;
		
		//����ó��
		if(random > n ) {			
			System.out.println("UP!");			
		}else if(random < n){
			System.out.println("DOWN!");
		}else {
			System.out.println(count + "ȸ ���� ����!");
			result = true;
		}
		return result;

	}

}
