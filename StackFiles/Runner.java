package StackFiles;

public class Runner {
	public static void main(String[] args) {
		DStack stack = new DStack();
//		System.out.println(stack.pop());
		stack.push(5);
		stack.show();
		stack.push(2);
		stack.show();
		stack.push(6);
		stack.show();
		stack.push(9);
		stack.show();
		stack.push(1);
		stack.show();
		System.out.println("Top value : "+stack.peek());
		// stack overflow error 
//		stack.push(3);
		
		
//		stack.pop();
//		stack.show();
//		System.out.println(stack.isEmpty());
//		System.out.println(stack.size());
	}
}
