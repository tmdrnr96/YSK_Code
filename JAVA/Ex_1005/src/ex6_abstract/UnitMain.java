package ex6_abstract;

import java.io.ObjectInputStream.GetField;

public class UnitMain {
	public static void main(String[] args) {

		//혹시라도 생성자의 인자를 하나라도 빼먹으면 오류 
		Terran t1 = new Terran("해병", 100, false);
		t1.decEnergy();
		t1.decEnergy();
		System.out.println("t1 : " + t1.energy);
		
		Protoss p1 = new Protoss("셔틀", 150, true);
		p1.decEnergy();
		System.out.println("p1 : " + p1.energy);
		
		Zerg z1 = new Zerg("히드라", 200, false);
		z1.decEnergy();
		System.out.println("z1 : " + z1.getEnergy());
	}//main
}
