package cn.jxufe.java.chapter3.demo7;

public class Sheep implements Shout {
	// @Override 注意不是重写这个功能，而是实现，加这个将报错
	public void shoutSound() {
		// TODO Auto-generated method stub
		System.out.println("羊的叫声是“咩咩咩”");
	}

}
