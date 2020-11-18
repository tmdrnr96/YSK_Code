package ex3_object_stream;

import java.io.Serializable;

//	Serializable(����ȭ): ����ȭ�� ������ ������.. ������ ���� ����..
public class RspInfo implements Serializable{
	//Serializable�� �����ϸ� ��������� �˾Ƽ� ����ȭ�� ���ش�.
	
	//�Ϲ����� Ŭ������ ��ü�� ������ �� ��������� �޸𸮻� ���� ����� ä�� ���������.
	//����ȭ�� ���� ����������� �迭���·� �Ϸķ� ���� ��������� �Ѵ�.
	//Serializable�� ������ �θ� JVM�� �˾Ƽ� ����Ŭ����(RspInfo)�� �����������
	//����ȭ �����ش�.(���� ���� ����ȭ)
	
	private int win, lose, draw;
	private String id;
	
	
	public int getWin() {
		return win;
	}
	public void setWin(int win) {
		this.win = win;
	}
	public int getLose() {
		return lose;
	}
	public void setLose(int lose) {
		this.lose = lose;
	}
	public int getDraw() {
		return draw;
	}
	public void setDraw(int draw) {
		this.draw = draw;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
}
