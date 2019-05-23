package cn.jxufe.java.chapter3.demo6;

public class Hardware extends Maintainer {
	@Override
	public void work() {
		System.out.println("员工号为 " + getId() + " 的 " + getName() + " 员工，正在修复打印机");
	}
}
