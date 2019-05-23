package cn.jxufe.java.chapter3.demo01;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Developer d = new Developer();
		d.name = "开发者";
		d.print();
		
		Manager m = new Manager();
		m.name = "经理";
		m.printf();
		
		d.work();
		m.work();
	}

}
