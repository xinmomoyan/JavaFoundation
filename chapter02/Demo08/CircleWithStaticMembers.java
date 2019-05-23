package cn.jxufe.java.chapter2.demo08;

public class CircleWithStaticMembers {
	double radius;
	static int numberOfObjects = 0;

	public CircleWithStaticMembers() {
		// TODO Auto-generated constructor stub
		radius = 1;
		numberOfObjects++;
	}

	public CircleWithStaticMembers(double radius) {
		this.radius = radius;
		numberOfObjects++;
	}

	public static int getNumberOfObjects() {
		return numberOfObjects;
	}

	public static void setNumberOfObjects(int numberOfObjects) {
		CircleWithStaticMembers.numberOfObjects = numberOfObjects;
	}

	public double getArea() {
		return radius * radius * Math.PI;
	}
}
