package cn.jxufe.java.chapter3.demo6;

public abstract class Employee {
	private String id;// Ա�����
	private String name; // Ա������

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// �������������󷽷���
	public abstract void work();

}
