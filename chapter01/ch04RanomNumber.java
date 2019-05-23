package cn.jxufe.java.chapter1;

import java.util.Scanner;

public class ch04RanomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1 = (int) (Math.random() * 10);
		int number2 = (int) (Math.random() * 10);

		if (number1 < number2) {
			int temp = number1;
			number1 = number2;
			number2 = temp;
		}

		System.out.println("what is " + number1 + " - " + number2 + " ?");
		Scanner input = new Scanner(System.in);
		int answer = input.nextInt();

		if (number1 - number2 == answer)
			System.out.println("you are right");
		else {
			System.out.println("you are wrong");
			System.out.println(number1 + " - " + number2 + " should be " + (number1 - number2));
		}
	}

}
