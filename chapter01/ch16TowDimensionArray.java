package cn.jxufe.java.chapter1;

import java.util.Arrays;
import java.util.Scanner;

public class ch16TowDimensionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] m = getArray();
		System.out.println(Arrays.deepToString(m)); // 打印二维数组的简单方法
		System.out.println("Sumof all element is " + sum(m));
	}

	public static int[][] getArray() {
		Scanner input = new Scanner(System.in);

		int[][] m = new int[3][4];
		System.out.println("enter " + m.length + " rows and " + m[0].length + " columns: ");
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++)
				m[i][j] = input.nextInt();
		}
		return m;
	}

	public static int sum(int[][] m) {
		int total = 0;
		for (int row = 0; row < m.length; row++) {
			for (int column = 0; column < m[row].length; column++) {
				total += m[row][column];
			}
		}
		return total;
	}
}
