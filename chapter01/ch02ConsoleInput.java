package cn.jxufe.java.chapter1;

import java.util.Scanner;

public class ch02ConsoleInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("enter a number for radius: ");
		double radius = input.nextDouble();
		double area = radius * radius * 3.14159;
		System.out.println("the area for the circle of radius " + radius + " is " + area);
	}

}
