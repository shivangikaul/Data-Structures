package practice.LinkedList;

public class Node {
private int data;
private Node next;

Node(int data){
	this.data=data;
	this.next=null;
}

public int getData() {
	return data;
}

public void setData(int data) {
	this.data = data;
}

public Node getNext() {
	return next;
}

public void setNext(Node next) {
	this.next = next;
}

}
