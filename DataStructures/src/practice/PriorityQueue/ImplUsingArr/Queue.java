package practice.PriorityQueue.ImplUsingArr;

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
		sortQueue(item);
		rear=(rear+1)%arr.length;
	}
	
	public void sortQueue(int item) {
		int i,j;
		
		for(i=count;i>0;i--){
			if(item<arr[i-1]){
				if(front>rear && i==count){
					arr[rear]=arr[i];
				}
				arr[i]=arr[i-1];
				arr[i-1]=item;
				continue;
			}
			else 
				break;
		}
		arr[i]=item;
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
