package cn.jxufe.java.chapter3.demo8;

public class Triangle implements Ishape {
	double a, b, c;

	public Triangle(double a, double b, double c) {
		// TODO Auto-generated constructor stub
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double getArea() {
		double s = 0.5 * (a + b + c);
		return Math.sqrt(s * (s - a) * (s - b) * (s - c));
	}

	public double getPerimeter() {
		return a + b + c;
	}

}
