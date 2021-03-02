package practice.PriorityQueue.ImplUsingArr;

import java.util.PriorityQueue;

public class Main {

	public static void  main(String...strings ) {
		Queue q=new Queue(5);
		q.enqueue(100);
		q.enqueue(90);
		q.enqueue(30);
		q.enqueue(40);
//		q.dequeue();
//		q.dequeue();
		
		q.enqueue(50);
		//q.enqueue(60);
		System.out.println(q.peek());
		System.out.println(q.toString());
		q.dequeue();
		q.dequeue();
		System.out.println(q.peek());
		//q.enqueue(50);
		//q.enqueue(60);
		q.enqueue(80);
		System.out.println(q.toString());
		
//		PriorityQueue<Integer> q=new PriorityQueue<Integer>();
//		q.add(700);
//		q.add(20);
//		q.add(30);
//		q.add(40);
//		System.out.println(q.toString());
	}
}
