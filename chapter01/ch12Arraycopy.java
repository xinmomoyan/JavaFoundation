package cn.jxufe.java.chapter1;

public class ch12Arraycopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] myList = { 1.9, 2.9, 3.4, 3.5 };
		double[] newList = new double[myList.length];
		System.arraycopy(myList, 0, newList, 0, myList.length);
		for(double e:newList)
			System.out.print(e + " ");
	}
}
