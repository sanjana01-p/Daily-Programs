import java.util.* ;
import java.io.*; 
public class Solution {

	public static void sortStack(Stack<Integer> stack) {
		// Write your code here.
		Stack<Integer> tmp = new Stack<>();
		
		while(!stack.isEmpty()) {
			int x = stack.pop();

			while(!tmp.isEmpty() && tmp.peek()<x) {
				stack.push((tmp.pop()));
			}
			tmp.push(x);
		}
		stack.clear();
		while(!tmp.isEmpty()) {
			stack.push(tmp.pop());
		}
	}
}
