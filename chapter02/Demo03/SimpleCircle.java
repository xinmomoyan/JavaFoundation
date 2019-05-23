package cn.jxufe.java.chapter2.demo03;

public class SimpleCircle {
	double radius;

	public SimpleCircle() {
		// TODO Auto-generated constructor stub
		radius = 1;
	}

	public SimpleCircle(double radius) {
		this.radius = radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	double getArea() {
		return radius * radius * Math.PI;
	}

	double getPerimeter() {
		return 2 * radius * Math.PI;
	}
}
