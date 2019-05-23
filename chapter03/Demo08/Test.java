package cn.jxufe.java.chapter3.demo8;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle = new Circle(10);
		System.out.println("circle area is " + circle.getArea() + " circle perimeter is " + circle.getPerimeter());

		Rectangle rectangle = new Rectangle(10, 20);
		System.out.println(
				"Rectangle area is " + rectangle.getArea() + " rectangle perimeter is " + rectangle.getPerimeter());

		Triangle triangle = new Triangle(3, 4, 5);
		System.out.println(
				"triangle area is " + triangle.getArea() + " triangle perimeter is " + triangle.getPerimeter());

	}
}
