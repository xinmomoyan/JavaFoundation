package cn.jxufe.java.chapter3.demo3;

//�����ֻ���
public class NewPhone extends Phone {

	// ���Ǹ����������ʾ���빦�ܣ��������Լ�����ʾ������ͼƬ����
	@Override
	public void showNum() {
		// ���ø����Ѿ����ڵĹ���ʹ��super
		super.showNum();
		// �����Լ�������ʾ������ͼƬ����
		System.out.println("��ʾ��������");
		System.out.println("��ʾͷ��");
	}
}


