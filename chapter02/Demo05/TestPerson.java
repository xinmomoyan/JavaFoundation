package cn.jxufe.java.chapter2.demo05;

import cn.jxufe.java.chapter2.demo05.Person;

public class TestPerson {
	public static void main(String[] args) {
		// 创建Person对象
		Person p = new Person();
		p.setAge(-20); // 给Person对象赋值
		p.name = "人妖";
		p.show(); // 调用Person的show方法
	}
}
