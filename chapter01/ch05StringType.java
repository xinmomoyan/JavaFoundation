package cn.jxufe.java.chapter1;

import java.util.Scanner;

public class ch05StringType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String message = "Welcome to Java";
//		System.out.println("the length of " + message + " is " + message.length()); // 求字符串长度
//		System.out.println(message.charAt(0)); // 从字符串中获取字符
//		System.out.println(message.concat(" and python")); // 连接字符串
//		System.out.println(message + " and python");
//		System.out.println(message.toLowerCase()); // 字符串大小写转换
//		System.out.println(message.toUpperCase());
//		
		Scanner input = new Scanner(System.in);
		System.out.println("enter three words separated by spaces");
		String s1 = input.next();
		String s2 = input.next();
		String s3 = input.next();
		
		System.out.println("s1 is " + s1);
		System.out.println("s2 is " + s2);
		System.out.println("s3 is " + s3);
		
		System.out.println("enter a line: ");
		Scanner input2 = new Scanner(System.in);
		String s= input2.nextLine();
		System.out.println("the line entered is " + s);
		
		
	}

}
