package cn.jxufe.java.chapter2.demo09;

public class StaticMethod {
	int i = 5;
	static int k = 2;

	public static void main(String[] args) {
		StaticMethod a = new StaticMethod();
		int j = a.i; 
		a.m1(); 
	}

	public void m1() {
		i = i + k + m2(i, k);
		System.out.println("i = " + i);
	}

	public static int m2(int i, int j) {
		return (int) (Math.pow(i, j));
	}

}
