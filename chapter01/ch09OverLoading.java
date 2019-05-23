package cn.jxufe.java.chapter1;


public class ch09OverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("the maximum of 3 and 4 is " + max(3, 4));
		System.out.println("the maximum of 3.0 and 5.4 is " + max(3, 5.4));
		System.out.println("the maximum of 3.0, 5.4 and 10.14 is " + max(3, 5.4, 10.14));

	}

	public static int max(int num1, int num2) {
		return Math.max(num1, num2);
	}

	public static double max(double num1, double num2) {

		return Math.max(num1, num2);
	}

	public static double max(double num1, double num2, double num3) {
		return max(max(num1, num2), num3);
	}

}
