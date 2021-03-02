package practice.queue.ImplUsingArr;

public class Main {

	public static void  main(String...strings ) {
		Queue q=new Queue(5);
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
//		q.dequeue();
//		q.dequeue();
		
		q.enqueue(50);
		//q.enqueue(60);
		System.out.println(q.peek());
		System.out.println(q.toString());
		q.dequeue();
		System.out.println(q.peek());
		//q.enqueue(50);
		//q.enqueue(60);
		System.out.println(q.toString());
	}
}
