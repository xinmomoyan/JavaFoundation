package cn.jxufe.java.chapter2.demo07;

import java.util.Date;

public class ch01DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		System.out.println("the elapsed times since Jan 1,1970 is " + date.getTime() + " milliseconds");
		System.out.println(date.toString());
	}

}
