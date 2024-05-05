package StackFiles;

public class Stack {
	int [] stack = new int[5];
	int top = 0;

	public void push(int value) {
		if(top == 5) {
			System.out.println("Stack is full");
			top--;
			return;
		}else {
			stack[top] = value;
			top++;
		}
	}
	
	public void show() {
		for(int value : stack) {
			System.out.println(value+" ");
		}
	}

	public int pop() {
		if(top ==0) {
			System.out.println("Stack is empty");
			return -1;
		}
		int data = stack[top-1];
		stack[top-1] = 0;
		top--;
		return data;
		
	}
	public int peek() {
		if(top ==0) {
			System.out.println("Stack is empty");
			return -1;
		}
		int data = stack[top-1];
		return data;
		
	}

	public boolean isEmpty() {
		return top<=0;
		
	}

	public int size() {
		return top;
	}
	
	
}
