package cn.jxufe.java.chapter1;

public class ch07StringCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Welcome to java ";
		String s2 = "Welcome to java ";
		String s3 = "Welcome to python ";
		System.out.println(s1.equals(s2)); // �������
		System.out.println(s1.equals(s3));
		System.out.println(s1.compareTo(s2)); // �������ҵ�һ����ͬ�ַ�֮��ľ���
		System.out.println(s1.compareTo(s3));
		System.out.println(s1.startsWith("Wel")); // �ַ������
		System.out.println(s1.endsWith("va"));
		System.out.println(s1.contains("to"));
	}

}
