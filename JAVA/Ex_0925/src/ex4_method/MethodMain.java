package ex4_method;

public class MethodMain {
	public static void main(String[] args) {

		int[] arr = {1, 2, 3};

		MethodTest mt = new MethodTest();	
		//주소값을 넘겨주게 됨으로 arr[0]은 5가 된다. 
		//따라서 결과는 5,2,3이 나오게 된다.
		mt.test(arr);

		System.out.println("main에서 실행됨");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] +" ");
		}

		System.out.println("\n------------------");
	}//main
}
