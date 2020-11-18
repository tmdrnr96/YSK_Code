package ex4_try_catch;

public class Ex1_try_catch {
	public static void main(String[] args) {

		//TryCatch(예외처리)
		//자바에서 프로그램 실행중 예외(오류, 에러..)가 발생하면 그 시점에서
		//프로그램이 강제적으로 종료된다. 이것은 올바른 판단이지만 때로는
		//예측가능한 오류가 발생했을 때 이를 무시하거나 해결하고 진행해야 할 때가 있다.
		//예외처리를 통해 프로그램의 비정상적인 종료를 줄이고 오류가 없는 코드를 작성할 수 있다.

		int n = 2;
		int result = 0;
		int[] arr = {1,2,3};
		
		//try에서 오류가 났다면 catch를 실행한다.
		try {		
			//try영역 안에서 예외가 발생하면 예외발생 시점에서
			//catch영역으로 이동한다.
			result = 10 / n;
			arr[2] = 4;//3번방이 없기때문에 오류 발생
//			System.out.println("나는 try영역!");//result = 10 / n 에서 오류가 났기 때문에 실행되지 않는다.
			
			//catch에 Exception은 모든 오류의 부모이기 떄문에 오류를 각각 잡고 싶다면 각각의 오류의 명칭을 넣어줘야한다.
			//Exception를 가장 먼저 쓰면 아래에는 그 어떤 오류도 쓰일 수 없다.
			
		} catch (ArithmeticException  e) {//try에서 예외가 발생하지 않았다면 catch는 실행하지 않는다.
			//Exception은 모든 예외의 부모이며, e에는 발생한 예외가 저장!
			e.printStackTrace();//몇번째줄에서 오류가 났는지 알려준다.(try안에 코드가 여러개 있을때 어떤것 때문에 오류가 발생했는지 알 수 있음)
//			System.out.println("정수는 0으로 나눌 수 없습니다.");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 index가 없습니다.");
			
			//finally는 예외 여부와는 상관없이 마지막에 반드시 호출되는 영역!
		}finally {
			System.out.println("finally 영역!!");
		}

		//ArithmeticException : 숫자를 0으로 나누려고 할 때 나타나는 오류명
		System.out.println("result : " + result );

	}//main


}
