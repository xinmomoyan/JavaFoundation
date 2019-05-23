package cn.jxufe.java.chapter1;

public class ch07StringCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Welcome to java ";
		String s2 = "Welcome to java ";
		String s3 = "Welcome to python ";
		System.out.println(s1.equals(s2)); // 内容相等
		System.out.println(s1.equals(s3));
		System.out.println(s1.compareTo(s2)); // 从左至右第一个不同字符之间的距离
		System.out.println(s1.compareTo(s3));
		System.out.println(s1.startsWith("Wel")); // 字符串检测
		System.out.println(s1.endsWith("va"));
		System.out.println(s1.contains("to"));
	}

}
