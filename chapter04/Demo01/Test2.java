package cn.jxufe.java.chapter4.demo01;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal  = new Cat(); // ����ת��
		animal.eat();
		
		Cat cat = (Cat)animal; // ����ת��
		cat.eat();
		cat.catchMouse();
	}

}
