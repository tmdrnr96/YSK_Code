package ex6_abstract;

import java.io.ObjectInputStream.GetField;

public class UnitMain {
	public static void main(String[] args) {

		//Ȥ�ö� �������� ���ڸ� �ϳ��� �������� ���� 
		Terran t1 = new Terran("�غ�", 100, false);
		t1.decEnergy();
		t1.decEnergy();
		System.out.println("t1 : " + t1.energy);
		
		Protoss p1 = new Protoss("��Ʋ", 150, true);
		p1.decEnergy();
		System.out.println("p1 : " + p1.energy);
		
		Zerg z1 = new Zerg("�����", 200, false);
		z1.decEnergy();
		System.out.println("z1 : " + z1.getEnergy());
	}//main
}
