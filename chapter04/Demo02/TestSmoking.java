package cn.jxufe.java.chapter4.demo02;

public class TestSmoking {
	public static void main(String[] args) {
		//ʹ�������ڲ���
		/*
		 *  ����ʵ����,��д����,����ʵ�������,һ���㶨
		 *  ��ʽ:
		 *    new �ӿڻ��߸���(){
		 *       ��д���󷽷�
		 *    };
		 *    �� new��ʼ,���ֺŽ���
		 *    �����˽ӿڵ�ʵ����Ķ���
		 */
		new Smoking(){
			public void smoking(){
				System.out.println("��������");
			}
		}.smoking();
	}
}
