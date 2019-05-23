package cn.jxufe.java.chapter3.demo5;

/*
 *  测试抽象类
 *    创建他的子类的对象,使用子类的对象调用方法
 */
public class Test {
	public static void main(String[] args) {
		JavaEE ee = new JavaEE();
		ee.work();

		Python py = new Python();
		py.work();
	}
}
