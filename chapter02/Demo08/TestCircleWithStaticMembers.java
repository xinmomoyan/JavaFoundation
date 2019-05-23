package cn.jxufe.java.chapter2.demo08;

public class TestCircleWithStaticMembers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("before creating objects");
		System.out.println("the number of Circle objects is " + CircleWithStaticMembers.numberOfObjects);

		CircleWithStaticMembers c1 = new CircleWithStaticMembers();

		System.out.println("\nAfter creating c1");
		System.out.println("c1: radius " + c1.radius + " and number of Circle objects " + c1.numberOfObjects);
		
		CircleWithStaticMembers c2 = new CircleWithStaticMembers(5);
		
		System.out.println("\nAfter creating c2");
		System.out.println("c1: radius " + c1.radius + " and number of Circle objects " + c1.numberOfObjects);
		System.out.println("c2: radius " + c2.radius + " and number of Circle objects " + c2.numberOfObjects);
	}

}
