package cn.jxufe.java.chapter2.demo02;

/*
 *  �����Ĳ�������,�ǻ�����������,������������
 */
public class TestPerson {
	public static void main(String[] args) {
		int a = 1;
		function(a);
		System.out.println(a);

		Person p = new Person();
		p.name = "����";
		System.out.println(p.name);

		function(p);

		System.out.println(p.name);
	}

	/*
	 * ���巽��,���������������������� ������Person���� p���ܵ���һ���ڴ�ĵ�ַ main �е�
	 * ����p function �еı���p ����ĵ�ַ��һ����
	 */
	public static void function(Person p) {
		p.name = "����";
	}

	/*
	 * ���巽��,���������ǻ�����������
	 */
	public static void function(int a) {
		a += 5;
	}
}
