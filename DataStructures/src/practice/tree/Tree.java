package practice.tree;

public class Tree {

	private Node root;
	private class Node{
		Node left,right;
		int data;
		 Node(int data) {
			this.data = data;
		}
		 @Override
			public String toString(){
				return "Node:"+data;
			}
	}
	
	
	
	public void insert(int data){
		Node n= new Node(data);
		if(root==null){
			root=n;
			return;
		}
		Node current=root;
		while(current!=null){
			if(current.data>data){
				if(current.left==null){
					current.left=n;
					break;
				}
				current=current.left;
			}else{
				if(current.right==null){
					current.right=n;
					break;
				}
				current=current.right;
			}
		}
	}
	
	public boolean find(int value){
		if(root==null) 
			return false;
		else{
			Node current=root;
			while(current!=null ){
					if(current.data>value)
						current=current.left;
					else if(current.data<value)
						current=current.right;
					else
					return true;
				}
			return false;
			}	
		}
	//preOrder traversal
	public void preOrderTraversal(){
		preOrderTraversal(root);
	}
	
	private void preOrderTraversal(Node root){
		if(root==null) return;
		System.out.print(root.data+"  ");
		preOrderTraversal(root.left);
		preOrderTraversal(root.right);
	}
	
	//inOrder traversal
	public void inOrderTraversal(){
		inOrderTraversal(root);
	}
	
	private void inOrderTraversal(Node root){
		if(root==null) return;
		
		inOrderTraversal(root.left);
		System.out.print(root.data+"  ");
		inOrderTraversal(root.right);
	}
	//postOrder traversal
	public void postOrderTraversal(){
		postOrderTraversal(root);
	}
	
	private void postOrderTraversal(Node root){
		if(root==null) return;
		
		postOrderTraversal(root.left);
		postOrderTraversal(root.right);
		System.out.print(root.data+"  ");
	}
	//height of the tree
	public int height(){
		return height(root);
	}
	
	
	private int height(Node root){
		if (root==null) return -1;
		if(root.left==null && root.right==null)
			return 0;
		return 1+Math.max(height(root.left),height(root.right));
	}
	
	//minimum value in the tree 
	public int min(){ 
		return min(root);
	}
	private int min(Node root){ 
		if(root==null)
			return Integer.MAX_VALUE;
		if(isLeaf(root)) 
			return root.data;
		int left=min(root.left);
		int right=min(root.right);
		
		return Math.min(Math.min(left, right), root.data);
	}
	
	private boolean isLeaf(Node n){
		return (n.left==null && n.right==null);
	}
	
	public boolean equals(Tree t){
		
	}
}
