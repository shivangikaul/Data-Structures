package practice.Stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Expression {
	List<Character> leftBrackets=Arrays.asList('(','<','[','{');
	List<Character> rightBrackets=Arrays.asList(')','>',']','}');
boolean isBalanced(String input){
	Stack<Character> stack= new Stack<>();
	for(char ch:input.toCharArray()){
		if(isLeftBracket(ch))
			stack.push(ch);
	if(isRightBracket(ch)){
		if(stack.empty())
			return false;
		char top=stack.pop();
		if(!BracketsMatch(top, ch))
			return false;
	}}
	return stack.empty();
	}

private boolean isLeftBracket(char ch){
	return (leftBrackets.contains(ch));
}

private boolean isRightBracket(char ch){
	return (rightBrackets.contains(ch));
}

private boolean BracketsMatch(char left,char right){
	return leftBrackets.indexOf(left)==rightBrackets.indexOf(right);
	
}
}

