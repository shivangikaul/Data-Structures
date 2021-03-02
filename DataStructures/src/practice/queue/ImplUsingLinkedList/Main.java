package practice.queue.ImplUsingLinkedList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue q=new Queue();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.print();
		System.out.println();
		System.out.println(q.deque());
		q.print();
		
		
	}

}
