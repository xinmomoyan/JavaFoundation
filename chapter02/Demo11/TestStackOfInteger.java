package cn.jxufe.java.chapter2.demo11;

public class TestStackOfInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackOfInteger stack = new StackOfInteger();

		for (int i = 0; i < 10; i++) {
			stack.push(i);
		}
		while (!stack.empty()) {
			System.out.print(stack.pop() + " ");
		}
	}

}
