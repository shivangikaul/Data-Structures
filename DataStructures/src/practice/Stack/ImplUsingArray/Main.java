package practice.Stack.ImplUsingArray;

public class Main {
	public static void main(String...strings ){
  Stack stack=new Stack();
  stack.push(10);
  stack.push(20);
  stack.push(30);
  stack.push(5);
  //stack.pop();
  System.out.println(stack.toString());
  System.out.println(stack.min(stack));
  //System.out.println(stack.peek());
  
  System.out.println(stack.toString());
  }
	
	
}

