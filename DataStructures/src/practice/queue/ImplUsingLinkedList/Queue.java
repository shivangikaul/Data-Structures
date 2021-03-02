package practice.queue.ImplUsingLinkedList;

import java.util.Arrays;

public class Queue {
	Node head;
public void enqueue(int item){
	if(head==null)
		head=new Node(item);
	else{
	Node current=head;
	while(current.next!=null){
		current=current.next;
	}
	current.next=new Node(item);
	}}

public int deque(){
	Node prev;
	if(head==null)
		throw new IllegalStateException();
	else{
		prev=head;
		head=head.next;
	}
	return prev.data;
}


public void print(){
	Node current=head;
	while(current!=null)
		{System.out.print(current.data+"  ");
		current=current.next;
		}
}
}
