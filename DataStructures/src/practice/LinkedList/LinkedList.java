package practice.LinkedList;

import java.util.NoSuchElementException;

import javax.naming.directory.NoSuchAttributeException;

public class LinkedList {
Node head;
Node tail;
	int size=0;
public void addLast(int data){
	
	Node current=head;
	if(head==null){
		head=addHead(data);
		tail=addTail(data);
	}
	else{
		while(current.getNext()!=null){
			current=current.getNext();
		}
		current.setNext(new Node(data));
		current=current.getNext();
		addTail(data);
	}
	size++;
	
	
}

public void print(){
	Node current=head;
	while(current.getNext()!=null){
		System.out.print(current.getData()+"->");
		current=current.getNext();
	}
	System.out.print(current.getData());
	System.out.println();
}

public void addFirst(int data){
	Node current=head;
	addHead(data);
	if(current!=null){
		head.setNext(current);
	}
	size++;
}

public void deleteFirst(){
	if(isEmpty())
		throw new NoSuchElementException();
	Node current=head.getNext();
	head.setNext(null);
	head=current;
	size--;
}

public boolean isEmpty(){
	if(head==null || tail==null)
		return true;
	return false;
}
public void deleteLast(){
	if(isEmpty())
		throw new NoSuchElementException();
	Node current=head;
	Node prev=null;
	while(current.getNext()!=null){
		prev=current;
		current=current.getNext();
	}
	prev.setNext(null);
	size--;
}

public boolean contains(int data){
	Node current=head;
	while(current.getNext()!=null){
		if(current.getData()==data){
			return true;
		}
		
		current=current.getNext();
	}
	if(current.getData()==data)
		return true;
	return false;
} 

 public int indexOf(int data){
	 Node current=head;
	 int i=1;
		while(current.getNext()!=null){
			if(current.getData()==data){
				return i;
			}
			i++;
			current=current.getNext();
		}
		if(current.getData()==data)
		return i;
		return -1;
	 
 } 
 
 public int size(){
	 return size;
 }

private Node addHead(int data){
	return (head=new Node(data));
}

private Node addTail(int data){
	return (tail =new Node(data));
	
}

public int[] toArray(){
	int[] array= new int[size];
	Node current=head;
	int index=0;
	while(current!=null)
	{
		array[index++]=current.getData();
		current=current.getNext();
	}
	return array;
}

public void reverse(){
	
	Node current=head.getNext();
	Node prev=head;
	Node next=null;
	while(current!=null){
		next=current.getNext();
		current.setNext(prev);
		prev=current;
		current=next;	
	}
	tail=head;
	tail.setNext(null);
	head=prev;
	
}

public int getKthFromTheEnd(int k){
	if(isEmpty())
		throw new IllegalStateException();
	Node a=head;
	Node b=head;
	for(int i=0;i<k-1;i++){
		b=b.getNext();
		if(b==null)
			throw new IllegalArgumentException();
		}
		while(b!=tail){
			a=a.getNext();
			b=b.getNext();
		}
		return a.getData();
	}

public static boolean hasLoop(Node head){
	Node a=head;
	Node b=head;
	while(b.getNext()!=null){
		a=a.getNext();
		b=b.getNext().getNext();
		if (a==b)
			return true;
	}
	return false;
	
}

public void middleElement(Node head){
	int counter=0;
	Node a =head;
	Node b=head;
	if(head==null||head.getNext()==null){
		throw new IllegalArgumentException();
	}
	while(b.getNext()!=null && b.getNext().getNext()!=null){
		a=a.getNext();
		b=b.getNext().getNext();
		counter++;
	};
	
	if(b.getNext()!=null){
		System.out.println(a.getData()+"   "+a.getNext().getData());
	}
	else{
		System.out.println(a.getData());
	}
	
	
	
}
}
