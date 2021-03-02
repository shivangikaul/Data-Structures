package practice.queue.ImplUsingArr;

import java.util.Arrays;

public class Queue {

	//Enqueue,Dequeue,peek,isEmpty,isFull
	int front,rear,size,count;
	private int[] arr;
	public Queue(int size) {
		arr=new int[size];
		// TODO Auto-generated constructor stub
	}
	
	public void enqueue(int item){
		if(count==arr.length+1)
			throw new IllegalStateException();
		arr[rear]=item;
		rear=(rear+1)%arr.length;
		count++;
	}
	
	public int dequeue(){
		int item=arr[front];
		arr[front]=0;
		front=(front+1)%arr.length;
		count--;
		return item;
	}
	
	public int peek(){
//		if(front==0 && front==rear)
//			throw new IllegalStateException();
		return arr[front];
	}
	
//	public boolean isEmpty(){
//		if(front==0 && front==rear)
//			throw new IllegalStateException();
//		return arr[front++];
//	}
	
	@Override
	public String toString(){
		//return Arrays.toString(Arrays.copyOfRange(arr, front, rear));
		return Arrays.toString(arr);
	}

	
}
