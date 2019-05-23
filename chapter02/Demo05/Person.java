package cn.jxufe.java.chapter2.demo05;

public class Person {
	private int age;
	String name;

	// private是成员修饰符，不能修饰局部变量，被private修饰的成员变量，只能在该类的内容使用，超出该类的范围都不能使用。
	public void setAge(int age) {
		if (age < 0 || age > 130) {
			System.out.println(age + " 不符合年龄范围");
			return;
		} else {
			this.age = age;
		}
	}

	public void show() {
		System.out.println(" age= " + age + " name " + name);
	}
}
