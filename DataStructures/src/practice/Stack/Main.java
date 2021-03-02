package practice.Stack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="abcd";
StringReverser reverser= new StringReverser();
System.out.println(reverser.reverse(str));
Expression ex= new Expression();
//balanced-unbalanced check 
String str1="([1+2])";
System.out.println(ex.isBalanced(str1));
}
	
}
