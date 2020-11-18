package ex3_break;

public class Ex2_break {
	public static void main(String[] args) {

		int n = 1;
		
		while( true ) {
			
			System.out.println(n);
			n++;
			
			if(n > 5) {
			   break;
			}
			
		}//while
		
		System.out.println("----------------------------------");
		
		int num = 1;
		
		//switch문에 있는 break는 반복문인 while문을 나가는 것이 아니라
		//switch문만 빠져나간다.
		while(true) {
			
			switch(num) {
			case 1:
				System.out.println("1입니다.");
				//switch에서의 break는 반복문을 빠져나가는 것이 아니라
				//해당 switch문만 빠져나간다.
				break;
			case 2:
				System.out.println("2입니다.");
				break;
				
			}//switch
			
			num++;
			
		}//while
		
	}//main
}
