package ex5_array_work;

public class Ex1_work {
	public static void main(String[] args) {

		//배열 arr에 담긴 모든 값에 합을 출력하시오!
		int[] arr = {10, 20, 30, 40, 50};

		int sum = 0;

		//개선된 for문
		for(int n : arr) {
			sum += n;
		}
		System.out.println(sum);
		
		for(int i = 0; i < arr.length; i++) {
			sum+=arr[i];
		}
		System.out.println(sum);
		
		System.out.println("---------------------------");
		
		
	}//main
}
