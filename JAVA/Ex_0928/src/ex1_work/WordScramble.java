package ex1_work;

import java.util.Random;

public class WordScramble {
	//���� �ܾ ��ȯ�ϰ�, ������ �����ϱ����� Ŭ����
	String[] strArr = {"HOPE", "APPLE", "DOCTOR"};
	String shake = ""; //������ �ܾ �� ����

	//������ �������� ��ȯ�ϴ� �޼���

	public String getAnswer() {
		int idx = new Random().nextInt(strArr.length); //���������� ���� length�� !
		return strArr[idx];
		
	}
	//������ ���� ������ �����ϴ� �޼���
	public String getQuestion(String str) {
//		String aa = getAnswer(); �̷��� ����쿡�� getAnswer()�� �ٽ� ȣ���ϱ� ������ ���� �޶�����.
		//����ܾ��� �� ��ŭ �迭�� �����Ͽ� �ߺ����� �ʴ� ������ ����!!
		int[] inArr = new int[str.length()];
		
		outer : for(int i = 0; i < inArr.length;) {
			
			inArr[i] = new Random().nextInt(str.length()); 
			
			for(int j = 0; j < i; j++) {
				if(inArr[i] == inArr[j]) {
					continue outer;
				}//for
				
			}//inner
			i++;
		}//outer
		
		for(int i = 0; i < str.length(); i++) {
			//�������� ���� ������ �ڸ� ���� �°� inArr�� �迭 �ڸ��� �־ ���ڸ� �̾� ���δ�.
			shake += str.charAt(inArr[i]);
		}//for
		return shake;//���� ������ ��ȯ(��������)
	
	}




}
