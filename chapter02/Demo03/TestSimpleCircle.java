package cn.jxufe.java.chapter2.demo03;

public class TestSimpleCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleCircle circle1 = new SimpleCircle();
		System.out.println("the area of the circle of radius " + circle1.radius + " is " + circle1.getArea());

		SimpleCircle circle2 = new SimpleCircle(25);
		System.out.println("the area of the circle of radius " + circle2.radius + " is " + circle2.getArea());

		SimpleCircle circle3 = new SimpleCircle(125);
		System.out.println("the area of the circle of radius " + circle3.radius + " is " + circle3.getArea());
	}

}
