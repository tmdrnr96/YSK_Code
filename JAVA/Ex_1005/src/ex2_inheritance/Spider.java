package ex2_inheritance;

public class Spider extends Animal{

	String special = "����";

	@Override
	public int getLeg() {
		return 8;
	}
	
	@Override
	public int getEye() {
		return 6;
	}
}
