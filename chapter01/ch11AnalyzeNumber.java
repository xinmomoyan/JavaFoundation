package cn.jxufe.java.chapter1;

import java.util.Scanner;

public class ch11AnalyzeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("enter the number of items: ");
		int n = input.nextInt();
		double[] numbers = new double[n];
		double sum = 0;
		System.out.println("enter the numbers: ");
		for (int i = 0; i < n; i++) {
			numbers[i] = input.nextDouble();
			sum += numbers[i];
		}
		double average = sum / n;

		int count = 0;
		for (double e : numbers) {
			if (e > average)
				count++;
		}
		System.out.println("average is " + average);
		System.out.println("number of elements above the average is " + count);
	}

}
