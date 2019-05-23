package cn.jxufe.java.chapter2.demo07;

import java.util.Random;

public class ch02RandomTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random1 = new Random(3);
		System.out.println("from random1:");
		for (int i = 0; i < 10; i++) {
			System.out.print(random1.nextInt(10)+ " ");
		}

		Random random2 = new Random(3);
		System.out.println("\nfrom random2:");
		for (int i = 0; i < 10; i++) {
			System.out.print(random2.nextInt(10) + " ");
		}
	}

}
