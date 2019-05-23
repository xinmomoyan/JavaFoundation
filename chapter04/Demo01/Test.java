package cn.jxufe.java.chapter4.demo01;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Cat cat1 = new Cat(); cat1.eat();
		 * 
		 * Cat cat2 = new Cat(); cat2.eat();
		 */

		/*
		 * 每次来一只猫吃东西，我都需要调用一次eat()方法，太麻烦，直接封装成函数。
		 */
		function(new Cat());
		function(new Cat());

		/*
		 * 现在狗也想做同样的操作，怎么办？那我需要再重载一个function方法。
		 */
		function(new Dog());
		function(new Dog());

		/*
		 * 现在又来了一个新的动物，也想做同样的操作，怎么办？那我需要再重载一个function方法。
		 */

		function(new Pig());
		function(new Pig());

	}

	public static void function(Animal a) {
		a.eat();
		if(a instanceof Cat) {
			Cat cat = (Cat) a;
			cat.catchMouse();
		}
	}
}
