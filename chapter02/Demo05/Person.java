package cn.jxufe.java.chapter2.demo05;

public class Person {
	private int age;
	String name;

	// private�ǳ�Ա���η����������ξֲ���������private���εĳ�Ա������ֻ���ڸ��������ʹ�ã���������ķ�Χ������ʹ�á�
	public void setAge(int age) {
		if (age < 0 || age > 130) {
			System.out.println(age + " ���������䷶Χ");
			return;
		} else {
			this.age = age;
		}
	}

	public void show() {
		System.out.println(" age= " + age + " name " + name);
	}
}
