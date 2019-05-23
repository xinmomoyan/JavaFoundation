package cn.jxufe.java.chapter3.demo6;

public class JavaEE extends Developer {
	@Override
	public void work() {
		System.out.println("员工号为 " + getId() + " 的" + getName() + "员工，正在研发淘宝网站");

	}
}