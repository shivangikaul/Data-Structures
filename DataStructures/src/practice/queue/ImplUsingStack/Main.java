package practice.queue.ImplUsingStack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue q= new Queue();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		System.out.println(q.toString());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		//System.out.println(q.dequeue());
		System.out.println(q.peek());
		//System.out.println(q.dequeue());
		System.out.println(q.toString());
		
	}

}
