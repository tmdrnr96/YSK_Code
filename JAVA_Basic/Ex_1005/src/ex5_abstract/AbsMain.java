package ex5_abstract;

public class AbsMain {
	public static void main(String[] args) {

		absChild ac = new absChild();
		//�ڽ� �����ڰ� ������� ��, �θ�����ڴ� �ڵ����� �����ȴ�.
		ac.setValue(10);
		
		
		//�߻�Ŭ������ ��ü������ �ν��Ͻ��� ���������� ���� �� ����.
		//�߻�Ŭ������ �������̽� �ʿ��� ���������� ȣ������ �ʴ´�.(��üȭ ���� �ʴ´�.(�� �� ����.))
		absParent ap = new absParent() {
			
			@Override
			public void setValue(int n) {
			
				
			}
		};
		
		
	}//main
}
