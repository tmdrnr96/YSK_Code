package ex1_string;

public class Ex2_Stirng_Method {
	public static void main(String[] args) {

		//String Ŭ������ �޼���� 
		//�޼���� ��� �۾��� �����ϱ� ���� ��ɹ��� ����(��� �޼���� �Ұ�ȣ"()"�� �����ϰ� �ִ�.)
		String name = "Hong Gil Dong";

		//length() : �ش繮�ڿ��� ���̸� �˷��ش�(���� ����)
		//System.out.println("���ڿ� name�� ����(length) : " + name.length());
		//heap�� �޸𸮰� �Ҵ�Ǵ� ��� ��ü�� .�� ��� �޼��带 ����� �� �ִ�.
		int index = name.length();// cntl + spacebar : String�� �޼���� intŸ������ ���� ��ȯ�� �� �ִ�.
		//length ��ȣ �ȿ� �����͸� ������ ����...
		System.out.println("���ڿ� name�� ����(length) : " + index);

		index = name.indexOf('o'); //length�� ������ ��� String�޼���� 0������ �����Ѵ�.
		System.out.println("�� ó�� �߰��� ���� o�� ��ġ(indexOf) : " + index);
		//H o n g   G i l   D o  n  g
		//0 1 2 3 4 5 6 7 8 9 10 11 12

		index = name.indexOf('y'); //Ư�� ���ڸ� �߰����� ���ߴٸ� -1�� ��ȯ�Ѵ�.
		System.out.println("�� ó�� �߰��� ���� y�� ��ġ(indexOf) : " + index);

		index = name.indexOf("Gil");//Gil�̶�� ������ ���� ��ġ(��ҹ��� ����), Ư�� ���ڸ� �߰����� ���ߴٸ� -1�� ��ȯ
		System.out.println("���� Gil�� ������ġ(indexOf) : " + index);

		index = name.lastIndexOf('o');//o�� ������ ��ġ
		System.out.println("������ ���� o�� ��ġ(lastindexOf) : " + index);

		char c = name.charAt(5);//String ��ü���� 5��°�� ��ġ�� �ִ� ���ڸ� �����´�.(�ѱ��ڸ� ������ �� �ִ�.) 
		System.out.println("������ 5��° ��ġ�� ����(charAt) : " + c);

		String str = name.substring(5,10);//���� ������ ������ �߶� ������ �����´�.(5���� 10-1, �� 9��°���� �����´�.)
		System.out.println("5 ~ 9���� �߶� ����(subString) : " + str);

		String fruit1 = "apple"; 
		String fruit2 = "Apple";

		if(fruit1.equals(fruit2)) {//equals�� ��ҹ��ڸ� �����Ͽ� ���� ���Ѵ�. : boolean Ÿ������ �޾��ش�.
			System.out.println("equals : ���� �����ϴ�.");
		}else {
			System.out.println("equals : ���� �ٸ��ϴ�.");
		}

		if(fruit1.equalsIgnoreCase(fruit2)){//equalsIgnoreCase�� ��ҹ��ڸ� �����ϰ� �ܾ ��ġ�ϸ� true�� ��ȯ : boolean Ÿ������ �޾��ش�.

			System.out.println("equalsIgnoreCase : ���� �����ϴ�.");
		}else {
			System.out.println("equalsIgnoreCase : ���� �ٸ��ϴ�.");
		}


		String myId = " ysk ";
		
		//trim() : myId�� ���� �յ� �ǹ̾��� ������ ���� ��, �߰��� ������ �������� ���Ѵ�. 
		String result = myId.trim();
	
		if(result.equals("ysk")) {
			System.out.println("trim : �α��� ����");
		}else {
			System.out.println("trim : �α��� ����");
		}
		
		//���� ������ ���ڿ�("10","1000".....(����ó�� ���� ���ڿ�))�� ���� ������ �ٲ��ִ� �޼���
		String number = "10";
		int n = Integer.parseInt(number);
//		Double.parseDouble("10.4"); ���ڿ� �Ǽ��� ���� �Ǽ��� �ٲ��ִ� �޼���
		System.out.println(n + 10);
		
		//�⺻�ڷ����� ������� .�� �� �޼��带 ȣ���� �� ���� ������ wrapperŬ������ ���ؼ� �޼��带 ȣ���� �� �ִ�.
			//*wrapper Ŭ������ ����*
			// int�� char�� wrapper Ŭ������ ���� �����ϰ� ��� �⺻�ڷ������� �ձ��ڸ� �빮��!
			// wrapper | �⺻�ڷ���
			//---------|--------
			// Boolean | boolean
			//---------|--------
			//  Byte   |  byte 
			//  Short  |  short
			// Integer |  int
			//  Long   |  long
			//---------|--------
			//Character|  char
			//---------|--------
			//  Float  |  float
			//  Double |  double
		
		
		
		
	}//main

}



















