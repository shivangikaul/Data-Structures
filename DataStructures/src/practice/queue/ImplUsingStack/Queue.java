package practice.queue.ImplUsingStack;

import java.util.Arrays;
import java.util.Stack;

public class Queue {
	Stack<Integer> stack1;
	Stack<Integer> stack2;
	public Queue() {
		 stack1 = new Stack<Integer>();
		 stack2 = new Stack<Integer>();
		// TODO Auto-generated constructor stub
	}
	
	public void enqueue(int item){
	stack1.push(item);
	}
	
	public int dequeue(){
//		if(stack1.isEmpty())
//			throw new IllegalStateException();
//		while(!stack1.isEmpty())
//		{
//			stack2.push(stack1.pop());
//		}	
//		int firstItem=stack2.pop();
//		while(!stack2.isEmpty()){
//			stack1.push(stack2.pop());
//		}
//		return firstItem;
		
		if(stack1.isEmpty() && stack2.isEmpty())
			throw new IllegalStateException();
		moveStack1ToStack2();
		return stack2.pop();
	}

	private void moveStack1ToStack2() {
		if(stack2.isEmpty())
			while (!stack1.isEmpty())
				stack2.push(stack1.pop());
	}
	
	@Override
	public String toString(){
		return stack1.isEmpty()?stack2.toString():stack1.toString();
	}
	
	public boolean isEmpty(){
		if(stack1.isEmpty() && stack2.isEmpty())
			return true;
		return false;
	}
	
	public Object peek(){
		moveStack1ToStack2();
		return stack2.isEmpty()?new IllegalStateException():stack2.peek();
	}
	
	
	
	
}
