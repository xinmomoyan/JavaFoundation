package cn.jxufe.java.chapter4.demo02;

public class LocalInnerClass {

	public static void main(String[] args) {
		// �����ⲿ�����
		Party p = new Party();
		// �����ⲿ���е�puffBall����
		p.puffBall();
	}

}

class Party {// �ⲿ�࣬�ۻ�
	public void puffBall() {// �����򷽷�
		class Ball {// �ڲ��࣬����
			public void puff() {
				System.out.println("����������");
			}
		}
		// �����ڲ�����󣬵���puff����
		new Ball().puff();
	}
}
