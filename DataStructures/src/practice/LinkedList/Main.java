package practice.LinkedList;

import java.util.Arrays;

public class Main {
public static void main(String...strings ){
	LinkedList l= new LinkedList();
	
	//l.addLast(20);
	//l.addLast(30);
	//l.addLast(60);
	Node n1= new Node(10);
	Node n2= new Node(20);
	Node n3= new Node(30);
	Node n4= new Node(40);
	n4.setNext(n3);
	n3.setNext(n2);
	n2.setNext(n1);
	
	//n1.setNext(n3);
	//System.out.println(LinkedList.hasLoop(n3));
//	l.addFirst(10);
//	l.addFirst(20);
//	l.addFirst(30);
	l.middleElement(n4);
	
	//l.deleteFirst();
	//l.deleteLast();
	//l.print();
//	System.out.println(l.indexOf(20));
//	System.out.println(l.contains(30));
//	System.out.println(l.size);
//	int[] arr= l.toArray();
//	System.out.println(Arrays.toString(arr));
//	l.reverse();
//	l.print();
//	System.out.println(l.getKthFromTheEnd(0));
	//deleteFirst
	//deleteLast
	//contains
	//indexOf
}


}
