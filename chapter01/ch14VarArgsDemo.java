package cn.jxufe.java.chapter1;

public class ch14VarArgsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printMax(34, 3, 3, 2, 56.5);
		printMax(new double[] { 1, 2, 3 }); // ÄäÃûÊý×é
	}

	public static void printMax(double... numbers) {
		if (numbers.length == 0) {
			System.out.println("no argument passed ");
			return;
		}
		double result = numbers[0];
		for (double e : numbers) {
			if (e > result)
				result = e;
		}
		System.out.println("the max value is " + result);

	}

}
