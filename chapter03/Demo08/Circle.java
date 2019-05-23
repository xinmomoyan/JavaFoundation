package cn.jxufe.java.chapter3.demo8;

public class Circle implements Ishape {
	double redius;

	public Circle(double redius) {
		// TODO Auto-generated constructor stub
		this.redius = redius;
	}

	public double getArea() {
		return redius * redius * PI;
	}

	public double getPerimeter() {
		return 2 * redius * PI;
	}

}
