package cn.jxufe.java.chapter4.demo01;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal  = new Cat(); // 向上转型
		animal.eat();
		
		Cat cat = (Cat)animal; // 向下转型
		cat.eat();
		cat.catchMouse();
	}

}
