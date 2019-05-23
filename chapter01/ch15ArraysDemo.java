package cn.jxufe.java.chapter1;

import java.util.Arrays;

public class ch15ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] numbers = { 6.0, 4.4, 1.9, 2.9, 3.4, 3.5 };
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers)); // 打印一维数组的简单方法

		int[] list = { 2, 4, 7, 10, 11, 45 };
		System.out.println(" 11 index is " + Arrays.binarySearch(list, 11));

		int[] list2 = { 2, 3, 5, 1 };
		Arrays.fill(list2, 5);
		System.out.println(Arrays.toString(list2));

	}

}
