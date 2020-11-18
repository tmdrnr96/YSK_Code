package ex1_printf;

public class Ex1_printf {
	public static void main(String[] args) {

		int su1 = 10;
		int su2 = 20;
		//10 + 20 = 30
		System.out.println(su1 + " + " + su2 + " = " + (su1 + su2) );
		System.out.printf("%d + %d = %d\n", su1, su2, su1 + su2);//값이 순차적으로 대입된다.
		//printf (print + form)
		System.out.println("----------------------------------");
		//printf에는 ln의 라인일 바꾸는 기능이 없기 때문에 "\n(이스케이프: 엔터를 쳐준다(줄바꿈))"으로 강제로 라인을 바꿔준다.

		char blood = 'B';
		//저의 혈액형은 B형입니다.
		System.out.println("저의 혈액형은 " + blood + "형 입니다.");
		System.out.printf("저의 혈액형은 %c형 입니다.\n",blood);
		
		float temp = 20.5f;
		double temp2 = 22.7;
		//현재 기온은 20.5도 입니다.
		System.out.printf("현재 기온은 %.1f도 입니다.\n",temp);
		//%.1f 소수점 한자리까지만 표시!
		//%.2f 소수점 두자리까지만 표시!
		
		System.out.printf("현재 기온은 %f도 입니다.\n",temp2);
		
		String name = "마루치";
		int age = 20;
		//저는 마루치고 20살입니다.
		System.out.printf("저는 %s고 %02d살입니다.\n",name,age);
		//%02d 정수를 2자리 수로 만들어준다.
		//%03d 정수를 3자리 수로 만들어준다.
		
		//formatter의 자료형 타입
		//%d : 정수 타입
		//%c : 문자 타입
		//%f : 실수 타입
		//%s : 문자형 타입
		
	}//mian
}
