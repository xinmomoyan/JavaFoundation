package cn.jxufe.java.chapter4.demo02;

public class InnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Body.Heart bHeart = new Body().new Heart();
		bHeart.jump();
	}

}

class Body {// �ⲿ�࣬����
	private boolean life = true; // ����״̬

	public class Heart { // �ڲ��࣬����
	public void jump() {
         System.out.println("������ͨ��ͨ����");
			System.out.println("����״̬" + life); //�����ⲿ���Ա����
}
	}
}
