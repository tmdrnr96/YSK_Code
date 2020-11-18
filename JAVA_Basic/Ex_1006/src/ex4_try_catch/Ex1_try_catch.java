package ex4_try_catch;

public class Ex1_try_catch {
	public static void main(String[] args) {

		//TryCatch(����ó��)
		//�ڹٿ��� ���α׷� ������ ����(����, ����..)�� �߻��ϸ� �� ��������
		//���α׷��� ���������� ����ȴ�. �̰��� �ùٸ� �Ǵ������� ���δ�
		//���������� ������ �߻����� �� �̸� �����ϰų� �ذ��ϰ� �����ؾ� �� ���� �ִ�.
		//����ó���� ���� ���α׷��� ���������� ���Ḧ ���̰� ������ ���� �ڵ带 �ۼ��� �� �ִ�.

		int n = 2;
		int result = 0;
		int[] arr = {1,2,3};
		
		//try���� ������ ���ٸ� catch�� �����Ѵ�.
		try {		
			//try���� �ȿ��� ���ܰ� �߻��ϸ� ���ܹ߻� ��������
			//catch�������� �̵��Ѵ�.
			result = 10 / n;
			arr[2] = 4;//3������ ���⶧���� ���� �߻�
//			System.out.println("���� try����!");//result = 10 / n ���� ������ ���� ������ ������� �ʴ´�.
			
			//catch�� Exception�� ��� ������ �θ��̱� ������ ������ ���� ��� �ʹٸ� ������ ������ ��Ī�� �־�����Ѵ�.
			//Exception�� ���� ���� ���� �Ʒ����� �� � ������ ���� �� ����.
			
		} catch (ArithmeticException  e) {//try���� ���ܰ� �߻����� �ʾҴٸ� catch�� �������� �ʴ´�.
			//Exception�� ��� ������ �θ��̸�, e���� �߻��� ���ܰ� ����!
			e.printStackTrace();//���°�ٿ��� ������ ������ �˷��ش�.(try�ȿ� �ڵ尡 ������ ������ ��� ������ ������ �߻��ߴ��� �� �� ����)
//			System.out.println("������ 0���� ���� �� �����ϴ�.");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭�� index�� �����ϴ�.");
			
			//finally�� ���� ���οʹ� ������� �������� �ݵ�� ȣ��Ǵ� ����!
		}finally {
			System.out.println("finally ����!!");
		}

		//ArithmeticException : ���ڸ� 0���� �������� �� �� ��Ÿ���� ������
		System.out.println("result : " + result );

	}//main


}
