package lesson07_oop;

import java.util.Stack;

public class StackMain {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		for(int i =0; i <10; i++) {
		
			stack.push("������");	
		stack.push("������");
		stack.push("��");
		}
		
		System.out.println( stack.peek());
		System.out.println(stack.pop());
		System.out.println( stack.size());
		System.out.println( stack.pop());
		System.out.println( stack.pop());
	}
}
