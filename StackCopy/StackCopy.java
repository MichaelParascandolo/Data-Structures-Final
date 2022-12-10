import java.util.Stack;
/**
 * Lab: Practice with Stack operations
 * 
 * See comments for assignment instructions.
 * 
 * @author Michael Parascandolo
 *
 */
public class StackCopy {
	/**
	 * Make an identical copy of a Stack.
	 * post-condition: s is the same as it was before the method was called.
	 * @param s The Stack to copy.
	 * @return An identical copy of the Stack s.
	 */
	public <E> Stack<E> copy(Stack<E> s) {
		Stack<E> copy = new Stack<E>();
		Stack<E> temp = new Stack<E>();
		E result;

		while(!s.isEmpty()) {
			result = s.pop();
			temp.push(result);
		}
		while(!temp.isEmpty()) {
			result = temp.pop();
			copy.push(result);
			s.push(result);
		}
		return copy;
		// Stack Copy Algorithm: Assumes the Stack to copy is named s (as it is in the parameter of this method.
		//     Let copy be an initially empty Stack.
		//     Let temp be an initially empty Stack.
		//     while s is not empty
		//         Pop s and store the result in element.
		//         Push element onto temp.
		//     end while
		//     while temp is not empty
		//         Pop temp and store the result in element.
		//         Push element onto copy.
		//         Push element onto s.
		//     end while
		//     return copy
		
	}
	
	/**
	 * Make a reverse copy of a Stack.
	 * post-condition: s is the same as it was before the method was called.
	 * @param s The Stack to copy.
	 * @return A reverse copy of the Stack s.
	 */
	public <E> Stack<E> reverseCopy(Stack<E> s) {
		Stack<E> reverse = new Stack<E>();
		Stack<E> temp = new Stack<E>();
		E result;

		while(!s.isEmpty()) {
			result = s.pop();
			temp.push(result);
			reverse.push(result);
		}
		while(!temp.isEmpty()) {
			result = temp.pop();
			s.push(result);
		}
		return reverse;
		// Stack Reverse Copy Algorithm: Assumes the Stack to copy is named s (as it is in the parameter of this method.
		//     Let reverse be an initially empty Stack.
		//     Let temp be an initially empty Stack.
		//     while s is not empty
		//         Pop s and store the result in element.
		//         Push element onto temp.
		//         Push element onto reverse.
		//     end while
		//     while temp is not empty
		//         Pop temp and store the result in element.
		//         Push element onto s.
		//     end while
		//     return reverse
		
	}
	// used to print the stack
	public void print(Stack<Integer> stack) {
		for(Integer i: stack) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// Create a Stack of whatever type of element you want, such as Strings,
		// Integers, etc, and put at least 5 different elements in it.
		Stack<Integer> original = new Stack<Integer>();
		original.push(1);
		original.push(2);
		original.push(3);
		original.push(4);
		original.push(5);

		StackCopy test = new StackCopy();
	

		// Use a for-each style loop to print the original Stack
		// This type of loop will work with Java's Stack class since it implements
		// the Iterable interface, although you don't typically iterate over a Stack
		// like this.
		System.out.println("Original Stack");
		test.print(original);
		

		// Use the copy method to make a duplicate Stack
		// Use a for-each style loop to print the copy
		System.out.println("Copy Stack");
		test.print(test.copy(original));


		// Use the reverseCopy method to make a copy of the original Stack in reverse order
		// Use a for-each style loop to print the reverse copy
		System.out.println("Reverse Copy Stack");
		test.print(test.reverseCopy(test.copy(original)));
	}
}