package cn.jxufe.java.chapter3.demo2;

public class CollegeStudent extends Student {
	String name = "CollegeStudent";

	public void printName() {
		System.out.println("collegeStudent name is " + name);
		System.out.println("student name is " + super.name);

	}
}
