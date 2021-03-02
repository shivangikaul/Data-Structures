package practice.queue;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.Stack;

public class Main {

	static Queue<Integer> queue;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		queue=new ArrayDeque<Integer>();
		queue.add(10);
		queue.add(20);
		queue.add(30);
		queue.add(40);
		queue.add(50);
	Main.reverseTillK(queue, 3);
		System.out.println(queue.toString());
		Main.reverse(queue);
		
	}
//	@Override
//	public String toString(){
//		return Arrays.toString(queue);
//	}
	
	public static void reverse(Queue q){
	Queue q1= new ArrayDeque<Integer>();
	Stack<Integer> stack=new Stack<Integer>();
	while(!q.isEmpty()){
		stack.push((Integer) q.remove());
	}
	while(!stack.isEmpty()){q1.add(stack.pop());}
	System.out.println(q1.toString());
	}
	
	
	public static void reverseTillK(Queue<Integer> q,int k){
		Stack<Integer> s1=new Stack<>();
		Queue<Integer> q1=new ArrayDeque<>();
		int num=k;
		while(num!=0){
			s1.push(q.poll());
			num--;
		}
		while(!q.isEmpty()){
			q1.add(q.poll());
		}
		while(!s1.isEmpty()){
			q.add(s1.pop());
		}
		while(!q1.isEmpty()){
			q.add(q1.poll());
		}
		//System.out.println(q.toString());
	}
	

}
