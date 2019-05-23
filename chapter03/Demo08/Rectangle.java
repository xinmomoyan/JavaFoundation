package cn.jxufe.java.chapter3.demo8;

public class Rectangle implements Ishape {
	double height;
	double wight;

	public Rectangle(double height, double wight) {
		// TODO Auto-generated constructor stub
		this.height = height;
		this.wight = wight;
	}

	public double getArea() {
		return height * wight;
	}

	public double getPerimeter() {
		return 2 * (height + wight);
	}
}
