package ex1_times_table;

public class GuguClass {

	public void showTable(int n) {
		//������ ���


		if(n < 10 && n > 1) {

			for(int i = 1; i <= 9; i++ ) {
				System.out.printf("%d * %d = %d\n",n,i,n*i);	
			}			
		}else {

			System.out.println("2 ~ 9�ܱ��� �Է��� �����մϴ�.");
		}
	}

}
