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
		 * ÿ����һֻè�Զ������Ҷ���Ҫ����һ��eat()������̫�鷳��ֱ�ӷ�װ�ɺ�����
		 */
		function(new Cat());
		function(new Cat());

		/*
		 * ���ڹ�Ҳ����ͬ���Ĳ�������ô�죿������Ҫ������һ��function������
		 */
		function(new Dog());
		function(new Dog());

		/*
		 * ����������һ���µĶ��Ҳ����ͬ���Ĳ�������ô�죿������Ҫ������һ��function������
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
