package cn.jxufe.java.chapter3.demo01;

/*
 *  定义研发部员工
 *    属于员工中的一种
 *    研发员工继承员工类
 *    
 *    关键字 extends
 *    子类是Developer, 父类是Employee
 *    子类自动拥有父类中可以继承的属性和方法
 *    
 *    子类中,可以直接调用父类的成员
 */
public class Developer extends Employee {
		
	public void print() {
		System.out.println("the name of Developer is " + name);
	}
	
}
