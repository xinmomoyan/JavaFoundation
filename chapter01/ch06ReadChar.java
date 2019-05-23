package cn.jxufe.java.chapter1;

import java.util.Scanner;

public class ch06ReadChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("enter a character: ");
		String s = input.nextLine();
		char ch = s.charAt(0);
		System.out.println("the character entered is " + ch);
	}
}
