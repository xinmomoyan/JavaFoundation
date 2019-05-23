package cn.jxufe.java.chapter4.demo02;

public class LocalInnerClass {

	public static void main(String[] args) {
		// 创建外部类对象
		Party p = new Party();
		// 调用外部类中的puffBall方法
		p.puffBall();
	}

}

class Party {// 外部类，聚会
	public void puffBall() {// 吹气球方法
		class Ball {// 内部类，气球
			public void puff() {
				System.out.println("气球膨胀了");
			}
		}
		// 创建内部类对象，调用puff方法
		new Ball().puff();
	}
}
