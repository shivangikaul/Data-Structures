package practice.Stack.ImplUsingArray;

import java.util.Arrays;

public class Stack {
	private int[] arr= new int[5];
	private int count;
	
	public void push(int item){
		if(count==arr.length)
			throw new StackOverflowError();
	arr[count++]=item;	
	}
	
	public int pop(){
		if(count==0)
			throw new IllegalStateException();
		return arr[--count];
	}
	
	public int peek(){
		if(count==0){
			throw new IllegalStateException(); 
		}
		return arr[count-1];
		
	} 
	
	public boolean isEmpty(){
		return (count==0);
	}
	
	public int min(Stack stack){
		int current,min;
		current=stack.pop();
		min=current;
		while(!stack.isEmpty()){
		current=stack.pop();
		if(min>current)
			min=current;
		}
		return min;
		}
	
	@Override
	public String toString(){
		return Arrays.toString(Arrays.copyOfRange(arr, 0, count));
	}
	
}
