package cn.jxufe.java.chapter2.demo05;

import cn.jxufe.java.chapter2.demo05.Person;

public class TestPerson {
	public static void main(String[] args) {
		// ����Person����
		Person p = new Person();
		p.setAge(-20); // ��Person����ֵ
		p.name = "����";
		p.show(); // ����Person��show����
	}
}
