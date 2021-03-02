package practice.tree;

public class Main {
	
	public static void main(String...strings ){
Tree t= new Tree();
t.insert(20);
t.insert(40);
t.insert(50);
t.insert(30);
System.out.println(t.find(50));
t.preOrderTraversal();
t.inOrderTraversal();
t.postOrderTraversal();
System.out.println("Height->"+t.height());
System.out.println(t.min());
}
}
