package practice.Stack.ImplUsingArray.twoStack;

import java.util.Arrays;

public class Stack {
	int size;
	int top,end;
	int[] arr;
	
	public Stack(int size) {
		arr= new int[size];
		end=size;
		
	}

	public void push1(int data){
		if(top==end){
			throw new StackOverflowError();
		}
		arr[top++]=data;
	}
	
	public void push2(int data){
		if(top==end){
			throw new StackOverflowError();
		}
		arr[--end]=data;
	}
	
	public int pop1(){
		if(top==0)
			throw new IllegalStateException();
		return arr[top--];
	}
	public int pop2(){
		if(end==arr.length-1)
			throw new IllegalStateException();
		return arr[end++];
	}
	
	public String toString1(){
		return Arrays.toString(Arrays.copyOfRange(arr, 0, top));
	}
	public String toString2(){
		return Arrays.toString(Arrays.copyOfRange(arr, end, arr.length));
	}
	
	
	
}
