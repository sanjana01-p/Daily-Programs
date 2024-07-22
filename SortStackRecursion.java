import java.util.* ;
import java.io.*; 
public class Solution {

	public static void sortStack(Stack<Integer> stack) {
		// Write your code here.
		if(stack.isEmpty()) {
			return;
		}

		int val = stack.pop();
		 
		sortStack(stack);

		Stack<Integer> tmp = new Stack<>();
		
		
		while(!stack.isEmpty() && stack.peek()>val) {
			tmp.push((stack.pop()));
		}
		stack.push(val);
		

		while(!tmp.isEmpty()) {
			stack.push(tmp.pop());
		}
	}
}
