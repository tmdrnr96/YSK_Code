package ex2_operator;

public class Ex3_Operator {
	public static void main(String[] args) {

		//논리연산자 
		//비교연산자를 통한 연산이 두 개 이상 사용되는 경우, 이를 연결하는 용도로 사용하는 연산자
		
		int age = 20;
		int limit = 25;
		
		//&&(and) 연산자 : 둘 중하나가 거짓이면 모두 false, 두가지가 모두 true 일 경우 true
		//true && true = true
		//true && false = false
		//false && true = false
		//flase && false = false
		
		//&&은 앞쪽 연산이 false면 뒤쪽 연산을 수행하지 않는다.(아래의 연산대로라면  age는 20이다.(연산을 수행하지 않음..))
		boolean res = limit - age > 5 && (age -= 2) > 20;
		
		System.out.println("&& 연산 : " + res);
		System.out.println("age : " + age);
		
		int n1 = 10;
		int n2 = 20;
		//||(or) 연산자 : 둘 가지가 모두 false일 때만 false 나머지의 경우는 모두 true
		//true && true = true
		//true && false = true
		//false && true = true
		//flase && false = false
		
		//&&연산과는 반대로 생각하자
		//||(or)연산은 앞쪽 연산이 true이면 뒤쪽 연산을 수행하지 않는다
		res = (n1 += 10) > 20 || n2 - 10 == 11;
		System.out.println("|| 연산 : " + res);
		
		//!(not)연산자 : 참은 거짓으로 거짓은 참으로 변환시켜주는 연산자
		System.out.println("!(not) 연산 : " + !res);
		System.out.println(res);
	}//main
}
