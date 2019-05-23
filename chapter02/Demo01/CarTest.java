package cn.jxufe.java.chapter2.demo01;

public class CarTest {
	public static void main(String[] args) {
		// 创建出Car类的变量 , 创建出Car类的对象,小汽车真的有了
		Car c = new Car();
		// 对象.调用类中的属性和方法
		c.color = "无色";
		c.count = 5;

		c.run();
	}
}
