package ex3_work;

public class Ex2_work {
	public static void main(String[] args) {

		//과수원이 있다.
		//배, 사과, 오렌지를 키우고 있는데 하루 생산량은 각각
		//5,7,5 개다.
		//과수원에서 하루에 생산되는 과일의 총 갯수를 출력하고,
		//한 시간에 몇개의 과일이 만들어 지는지 전체 과일의 평균 생산 갯수를 출력.
		
		//단, 과일의 갯수와 총합을 담는 변수는 정수형으로 
		//평균 생산 갯수를 저장하는 변수는 float타입으로 만들 것 !!
		
		//하루 생산량  : 17
		//시간당 평균 :0.7xxx
		
		int pear = 5;
		int apple = 7;
		int orange = 5;
		
		int sum = pear + apple + orange;
		System.out.println("하루 생산량 : " + sum + "개");
		
		//둘 중에 하나가 실수면 결과가 실수가 나온다. 하지만 둘다 정수라면  정수가 나오기 때문에 소숫점이 나오지 않는다. 
		float avg = sum/24f;
		System.out.println("1.시간당 평균 생산량 : " + avg + "개");
				
		//float avg1 = (float)(sum/24); -> 최고 연산자로 sum/24가 먼저 계산이 되고 float으로 바뀐다.(0이 float으로 바뀐다. (0.0))
		float avg1 = (float)sum/24;
		System.out.println("2.시간당 평균 생산량 : " + avg1 + "개");
		
	}//main
}
