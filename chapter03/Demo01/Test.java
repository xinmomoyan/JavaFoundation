package cn.jxufe.java.chapter3.demo01;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Developer d = new Developer();
		d.name = "������";
		d.print();
		
		Manager m = new Manager();
		m.name = "����";
		m.printf();
		
		d.work();
		m.work();
	}

}
