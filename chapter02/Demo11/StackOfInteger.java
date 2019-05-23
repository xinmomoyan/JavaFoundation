package cn.jxufe.java.chapter2.demo11;

public class StackOfInteger {
	private int[] elements;
	private int size;
	public static final int DEFAULT_CAPACITY = 16;

	public StackOfInteger(int capacity) {
		// TODO Auto-generated constructor stub
		elements = new int[capacity];
	}

	public StackOfInteger() {
		this(DEFAULT_CAPACITY);
	}

	public void push(int value) {
		if (size >= elements.length) {
			int[] temp = new int[elements.length * 2];
			System.arraycopy(elements, 0, temp, 0, elements.length);
			elements = temp;
		}
		elements[size++] = value;
	}

	public int pop() {
		return elements[--size];
	}

	public int getSize() {
		return size;
	}

	public boolean empty() {
		return size == 0;
	}
}
