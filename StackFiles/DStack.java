package StackFiles;

public class DStack {
	int capacity = 2;
	int[] stack = new int[capacity];
	int top = 0;

	public void push(int value) {
		if (size() == capacity) {
			expand();
		}
		stack[top] = value;
		top++;
	}

	private void expand() {
		int newStack[] = new int[capacity * 2];
		for (int i = 0; i < size(); i++) {
			newStack[i] = stack[i];
		}
		stack = newStack;
		capacity = capacity * 2;
	}

	public void show() {
		for (int value : stack) {
			System.out.print(value + " ");
		}
		System.out.println();
	}

	public int pop() {
		if (top == 0) {
			System.out.println("Stack is empty");
			return -1;
		}
		shrink();
		int data = stack[top - 1];
		stack[top - 1] = 0;
		top--;
		return data;

	}

	private void shrink() {
		int length = size();
		 if(length <= (capacity/2)/2) {
			 capacity = capacity/2;
			 int [] newStack = new int[capacity];
			 for(int i =0;i<capacity;i++) {
				 newStack[i] = stack[i];
			 }
			 stack = newStack;
		 }
	}

	public int peek() {
		if (top == 0) {
			System.out.println("Stack is empty");
			return -1;
		}
		int data = stack[top - 1];
		return data;

	}

	public boolean isEmpty() {
		return top <= 0;

	}

	public int size() {
		return top;
	}

}
