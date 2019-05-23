package cn.jxufe.java.chapter1;


public class ch08subString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Welcome to java";
		System.out.println(s.indexOf('W'));
		System.out.println(s.indexOf('o'));
		System.out.println(s.indexOf("to"));
		System.out.println(s.indexOf("To"));
		System.out.println();
		System.out.println(s.lastIndexOf('W'));
		System.out.println(s.lastIndexOf('o'));
		System.out.println(s.lastIndexOf("to"));
		System.out.println(s.lastIndexOf("To"));
	}

}
