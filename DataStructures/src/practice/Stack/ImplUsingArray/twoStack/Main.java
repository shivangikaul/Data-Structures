package practice.Stack.ImplUsingArray.twoStack;

public class Main {

public static void main(String...strings ) {
	Stack stack=new Stack(10);
	stack.push1(1);
	stack.push1(2);
	stack.push2(3);
	stack.push2(4);
	System.out.println(stack.pop2());
	System.out.println(stack.toString1());
	System.out.println(stack.toString2());
}
}
