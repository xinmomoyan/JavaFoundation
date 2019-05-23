package cn.jxufe.java.chapter3.demo4;

public class ChinesePerson extends Person {
	int age;
	// String color;
	// String language; 注意子类中不要再重新定义这两个属性了，否则出错

	public ChinesePerson(String color, String language, int age) {
		// TODO Auto-generated constructor stub
		super(color, language);
		this.age = age;

	}
}
