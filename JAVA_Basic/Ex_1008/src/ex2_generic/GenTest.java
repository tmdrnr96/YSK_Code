package ex2_generic;

public class GenTest<T> {
	
	//���ʸ�(Generic) ���α׷����̶�?
	//�Ϲ����� �ڵ带 �ۼ��ϵ�, �� �ڵ带 �پ��� Ÿ���� ��ü�ν� ��Ȱ����
	//�����ϵ����ϴ� ����!
	
	T value;
	
	public void setValue(T value) {
		this.value = value;
	}

	public T getValue() {
		return value;
	}
	
	
	
}
